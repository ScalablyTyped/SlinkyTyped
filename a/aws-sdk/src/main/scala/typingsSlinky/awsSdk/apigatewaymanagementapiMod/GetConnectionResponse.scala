package typingsSlinky.awsSdk.apigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectionResponse extends js.Object {
  
  /**
    * The time in ISO 8601 format for when the connection was established.
    */
  var ConnectedAt: js.UndefOr[js.Date] = js.native
  
  var Identity: js.UndefOr[typingsSlinky.awsSdk.apigatewaymanagementapiMod.Identity] = js.native
  
  /**
    * The time in ISO 8601 format for when the connection was last active.
    */
  var LastActiveAt: js.UndefOr[js.Date] = js.native
}
object GetConnectionResponse {
  
  @scala.inline
  def apply(): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionResponse]
  }
  
  @scala.inline
  implicit class GetConnectionResponseOps[Self <: GetConnectionResponse] (val x: Self) extends AnyVal {
    
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
    def setConnectedAt(value: js.Date): Self = this.set("ConnectedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectedAt: Self = this.set("ConnectedAt", js.undefined)
    
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("Identity", js.undefined)
    
    @scala.inline
    def setLastActiveAt(value: js.Date): Self = this.set("LastActiveAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastActiveAt: Self = this.set("LastActiveAt", js.undefined)
  }
}
