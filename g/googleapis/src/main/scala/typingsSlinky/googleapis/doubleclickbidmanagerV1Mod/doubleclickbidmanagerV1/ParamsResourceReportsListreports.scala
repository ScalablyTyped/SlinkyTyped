package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceReportsListreports extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Query ID with which the reports are associated.
    */
  var queryId: js.UndefOr[String] = js.native
}
object ParamsResourceReportsListreports {
  
  @scala.inline
  def apply(): ParamsResourceReportsListreports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsListreports]
  }
  
  @scala.inline
  implicit class ParamsResourceReportsListreportsOps[Self <: ParamsResourceReportsListreports] (val x: Self) extends AnyVal {
    
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
    def setQueryId(value: String): Self = this.set("queryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryId: Self = this.set("queryId", js.undefined)
  }
}
