package typingsSlinky.gapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientLogging.AnonPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Lists the descriptors for monitored resource types used by Stackdriver Logging. */
  def list(request: AnonPageSize): Request_[ListMonitoredResourceDescriptorsResponse] = js.native
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(list: AnonPageSize => Request_[ListMonitoredResourceDescriptorsResponse]): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
  @scala.inline
  implicit class MonitoredResourceDescriptorsResourceOps[Self <: MonitoredResourceDescriptorsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonPageSize => Request_[ListMonitoredResourceDescriptorsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

