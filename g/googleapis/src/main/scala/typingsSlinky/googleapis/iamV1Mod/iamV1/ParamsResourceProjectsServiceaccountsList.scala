package typingsSlinky.googleapis.iamV1Mod.iamV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsServiceaccountsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The resource name of the project associated with the service
    * accounts, such as `projects/my-project-123`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional limit on the number of service accounts to include in the
    * response. Further accounts can subsequently be obtained by including the
    * ListServiceAccountsResponse.next_page_token in a subsequent request.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional pagination token returned in an earlier
    * ListServiceAccountsResponse.next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsServiceaccountsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsServiceaccountsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsServiceaccountsListMutableBuilder[Self <: ParamsResourceProjectsServiceaccountsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
