package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePagesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * An integer that specifies the current offset (that is, starting result
    * location) in search results. This field is only considered if
    * `page_token` is unset, and if the request is not for a specific URL. For
    * example, 0 means to return results starting from the first matching
    * result, and 10 means to return from the 11th result.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The organization for which we want to fetch markups for. For instance,
    * "site.com". Cannot be specified along with an URL.
    */
  var organization: js.UndefOr[String] = js.native
  
  /**
    * The pagination size. We will return up to that many results. Defaults to
    * 10 if not set. Has no effect if a URL is requested.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The pagination token. You may provide the `next_page_token` returned from
    * a previous List request, if any, in order to get the next page. All other
    * fields must have the same values as in the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The URL from which to get `ClaimReview` markup. There will be at most one
    * result. If markup is associated with a more canonical version of the URL
    * provided, we will return that URL instead. Cannot be specified along with
    * an organization.
    */
  var url: js.UndefOr[String] = js.native
}
object ParamsResourcePagesList {
  
  @scala.inline
  def apply(): ParamsResourcePagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesList]
  }
  
  @scala.inline
  implicit class ParamsResourcePagesListMutableBuilder[Self <: ParamsResourcePagesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
