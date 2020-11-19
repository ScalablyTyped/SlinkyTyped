package typingsSlinky.gapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRecordSetsResource extends js.Object {
  
  /** Enumerate ResourceRecordSets that have been created but not yet deleted. */
  def list(request: typingsSlinky.gapiClientDns.anon.ManagedZone): Request[ResourceRecordSetsListResponse] = js.native
}
object ResourceRecordSetsResource {
  
  @scala.inline
  def apply(list: typingsSlinky.gapiClientDns.anon.ManagedZone => Request[ResourceRecordSetsListResponse]): ResourceRecordSetsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ResourceRecordSetsResource]
  }
  
  @scala.inline
  implicit class ResourceRecordSetsResourceOps[Self <: ResourceRecordSetsResource] (val x: Self) extends AnyVal {
    
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
    def setList(value: typingsSlinky.gapiClientDns.anon.ManagedZone => Request[ResourceRecordSetsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
