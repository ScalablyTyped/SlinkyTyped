package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableOrganizationAdminAccountRequest extends StObject {
  
  /**
    * The AWS Account ID for the organizations account to be disabled as a GuardDuty delegated administrator.
    */
  var AdminAccountId: String = js.native
}
object DisableOrganizationAdminAccountRequest {
  
  @scala.inline
  def apply(AdminAccountId: String): DisableOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccountId = AdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableOrganizationAdminAccountRequest]
  }
  
  @scala.inline
  implicit class DisableOrganizationAdminAccountRequestMutableBuilder[Self <: DisableOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminAccountId(value: String): Self = StObject.set(x, "AdminAccountId", value.asInstanceOf[js.Any])
  }
}
