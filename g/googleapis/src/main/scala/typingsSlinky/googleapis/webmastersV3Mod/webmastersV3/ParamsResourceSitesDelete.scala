package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSitesDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The URI of the property as defined in Search Console. Examples:
    * http://www.example.com/ or android-app://com.example/ Note: for
    * property-sets, use the URI that starts with sc-set: which is used in
    * Search Console URLs.
    */
  var siteUrl: js.UndefOr[String] = js.native
}
object ParamsResourceSitesDelete {
  
  @scala.inline
  def apply(): ParamsResourceSitesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceSitesDeleteMutableBuilder[Self <: ParamsResourceSitesDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
