package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientMonitoring.anon.Accesstoken
import typingsSlinky.gapiClientMonitoring.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Gets a single monitored resource descriptor. This method does not require a Stackdriver account. */
  def get(request: Accesstoken): Request[MonitoredResourceDescriptor] = js.native
  /** Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: Callback): Request[ListMonitoredResourceDescriptorsResponse] = js.native
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(
    get: Accesstoken => Request[MonitoredResourceDescriptor],
    list: Callback => Request[ListMonitoredResourceDescriptorsResponse]
  ): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
  @scala.inline
  implicit class MonitoredResourceDescriptorsResourceOps[Self <: MonitoredResourceDescriptorsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Accesstoken => Request[MonitoredResourceDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Callback => Request[ListMonitoredResourceDescriptorsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

