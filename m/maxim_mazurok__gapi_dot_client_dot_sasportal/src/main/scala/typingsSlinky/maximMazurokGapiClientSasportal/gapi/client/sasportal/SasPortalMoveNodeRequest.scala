package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalMoveNodeRequest extends js.Object {
  
  /** Required. The name of the new parent resource node or Customer) to reparent the node under. */
  var destination: js.UndefOr[String] = js.native
}
object SasPortalMoveNodeRequest {
  
  @scala.inline
  def apply(): SasPortalMoveNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalMoveNodeRequest]
  }
  
  @scala.inline
  implicit class SasPortalMoveNodeRequestOps[Self <: SasPortalMoveNodeRequest] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
  }
}
