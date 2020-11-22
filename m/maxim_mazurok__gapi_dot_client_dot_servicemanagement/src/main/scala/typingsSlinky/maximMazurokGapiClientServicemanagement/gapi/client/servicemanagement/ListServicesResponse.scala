package typingsSlinky.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServicesResponse extends js.Object {
  
  /** Token that can be passed to `ListServices` to resume a paginated query. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The returned services will only have the name field set. */
  var services: js.UndefOr[js.Array[ManagedService]] = js.native
}
object ListServicesResponse {
  
  @scala.inline
  def apply(): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicesResponse]
  }
  
  @scala.inline
  implicit class ListServicesResponseOps[Self <: ListServicesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: ManagedService*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[ManagedService]): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
}
