package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSitesVersionsFilesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The page size to return. Defaults to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The next_page_token from a previous request, if provided. This will be
    * the encoded version of a
    * firebase.hosting.proto.metadata.ListFilesPageToken.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required. The parent to list files for, in the format:
    * <code>sites/<var>site-name</var>/versions/<var>versionID</var></code>
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The type of files in the version that should be listed.
    */
  var status: js.UndefOr[String] = js.native
}
object ParamsResourceSitesVersionsFilesList {
  
  @scala.inline
  def apply(): ParamsResourceSitesVersionsFilesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesVersionsFilesList]
  }
  
  @scala.inline
  implicit class ParamsResourceSitesVersionsFilesListMutableBuilder[Self <: ParamsResourceSitesVersionsFilesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
