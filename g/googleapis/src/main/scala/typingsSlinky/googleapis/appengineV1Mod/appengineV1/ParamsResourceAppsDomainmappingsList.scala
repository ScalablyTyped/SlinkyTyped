package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAppsDomainmappingsList extends StandardParameters {
  
  /**
    * Part of `parent`. Name of the parent Application resource. Example:
    * apps/myapp.
    */
  var appsId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Maximum results to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceAppsDomainmappingsList {
  
  @scala.inline
  def apply(): ParamsResourceAppsDomainmappingsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsDomainmappingsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsDomainmappingsListOps[Self <: ParamsResourceAppsDomainmappingsList] (val x: Self) extends AnyVal {
    
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
    def setAppsId(value: String): Self = this.set("appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppsId: Self = this.set("appsId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
