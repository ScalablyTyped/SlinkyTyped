package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCustomchannelsAdunitsList extends StandardParameters {
  
  /**
    * Ad client which contains the custom channel.
    */
  var adClientId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Custom channel for which to list ad units.
    */
  var customChannelId: js.UndefOr[String] = js.native
  
  /**
    * Whether to include inactive ad units. Default: true.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of ad units to include in the response, used for
    * paging.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * A continuation token, used to page through ad units. To retrieve the next
    * page, set this parameter to the value of "nextPageToken" from the
    * previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceCustomchannelsAdunitsList {
  
  @scala.inline
  def apply(): ParamsResourceCustomchannelsAdunitsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomchannelsAdunitsList]
  }
  
  @scala.inline
  implicit class ParamsResourceCustomchannelsAdunitsListOps[Self <: ParamsResourceCustomchannelsAdunitsList] (val x: Self) extends AnyVal {
    
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
    def setAdClientId(value: String): Self = this.set("adClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdClientId: Self = this.set("adClientId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCustomChannelId(value: String): Self = this.set("customChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomChannelId: Self = this.set("customChannelId", js.undefined)
    
    @scala.inline
    def setIncludeInactive(value: Boolean): Self = this.set("includeInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInactive: Self = this.set("includeInactive", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
