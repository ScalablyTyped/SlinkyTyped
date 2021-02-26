package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationsDecisionDetail extends StObject {
  
  /**
    * Specifies whether the simulated operation is allowed by the Organizations service control policies that impact the simulated user's account.
    */
  var AllowedByOrganizations: js.UndefOr[booleanType] = js.native
}
object OrganizationsDecisionDetail {
  
  @scala.inline
  def apply(): OrganizationsDecisionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationsDecisionDetail]
  }
  
  @scala.inline
  implicit class OrganizationsDecisionDetailMutableBuilder[Self <: OrganizationsDecisionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedByOrganizations(value: booleanType): Self = StObject.set(x, "AllowedByOrganizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedByOrganizationsUndefined: Self = StObject.set(x, "AllowedByOrganizations", js.undefined)
  }
}
