package typingsSlinky.googleapis.loggingV2Mod.loggingV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceExclusionsDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The resource name of an existing exclusion to delete:
    * "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
    * "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
    * "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example:
    * "projects/my-project-id/exclusions/my-exclusion-id".
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceExclusionsDelete {
  
  @scala.inline
  def apply(): ParamsResourceExclusionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceExclusionsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceExclusionsDeleteMutableBuilder[Self <: ParamsResourceExclusionsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
