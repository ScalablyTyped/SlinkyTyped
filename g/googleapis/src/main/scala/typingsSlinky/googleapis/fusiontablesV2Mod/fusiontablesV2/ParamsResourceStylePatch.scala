package typingsSlinky.googleapis.fusiontablesV2Mod.fusiontablesV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceStylePatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaStyleSetting] = js.native
  
  /**
    * Identifier (within a table) for the style being updated.
    */
  var styleId: js.UndefOr[Double] = js.native
  
  /**
    * Table whose style is being updated.
    */
  var tableId: js.UndefOr[String] = js.native
}
object ParamsResourceStylePatch {
  
  @scala.inline
  def apply(): ParamsResourceStylePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStylePatch]
  }
  
  @scala.inline
  implicit class ParamsResourceStylePatchOps[Self <: ParamsResourceStylePatch] (val x: Self) extends AnyVal {
    
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
    def setRequestBody(value: SchemaStyleSetting): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setStyleId(value: Double): Self = this.set("styleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleId: Self = this.set("styleId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
  }
}
