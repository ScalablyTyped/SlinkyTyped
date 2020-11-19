package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCommentsUpdate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The part parameter identifies the properties that the API response will
    * include. You must at least include the snippet part in the parameter
    * value since that part contains all of the properties that the API request
    * can update.
    */
  var part: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaComment] = js.native
}
object ParamsResourceCommentsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceCommentsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceCommentsUpdateOps[Self <: ParamsResourceCommentsUpdate] (val x: Self) extends AnyVal {
    
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
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaComment): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
}
