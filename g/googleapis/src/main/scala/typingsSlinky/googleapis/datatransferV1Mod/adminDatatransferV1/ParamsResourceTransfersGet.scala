package typingsSlinky.googleapis.datatransferV1Mod.adminDatatransferV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTransfersGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * ID of the resource to be retrieved. This is returned in the response from
    * the insert method.
    */
  var dataTransferId: js.UndefOr[String] = js.native
}
object ParamsResourceTransfersGet {
  
  @scala.inline
  def apply(): ParamsResourceTransfersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransfersGet]
  }
  
  @scala.inline
  implicit class ParamsResourceTransfersGetOps[Self <: ParamsResourceTransfersGet] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDataTransferId(value: String): Self = this.set("dataTransferId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTransferId: Self = this.set("dataTransferId", js.undefined)
  }
}
