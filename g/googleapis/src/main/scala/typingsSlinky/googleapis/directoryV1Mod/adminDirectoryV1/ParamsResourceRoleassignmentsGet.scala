package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceRoleassignmentsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Immutable ID of the G Suite account.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * Immutable ID of the role assignment.
    */
  var roleAssignmentId: js.UndefOr[String] = js.native
}
object ParamsResourceRoleassignmentsGet {
  
  @scala.inline
  def apply(): ParamsResourceRoleassignmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRoleassignmentsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceRoleassignmentsGetMutableBuilder[Self <: ParamsResourceRoleassignmentsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setRoleAssignmentId(value: String): Self = StObject.set(x, "roleAssignmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAssignmentIdUndefined: Self = StObject.set(x, "roleAssignmentId", js.undefined)
  }
}
