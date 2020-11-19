package typingsSlinky.gapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientLogging.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoredResourceDescriptorsResource extends js.Object {
  
  /** Lists the descriptors for monitored resource types used by Stackdriver Logging. */
  def list(request: PageSize): Request[ListMonitoredResourceDescriptorsResponse] = js.native
}
object MonitoredResourceDescriptorsResource {
  
  @scala.inline
  def apply(list: PageSize => Request[ListMonitoredResourceDescriptorsResponse]): MonitoredResourceDescriptorsResource = {
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setList(value: PageSize => Request[ListMonitoredResourceDescriptorsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
