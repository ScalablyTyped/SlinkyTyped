package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrganizationConfigRuleDetailedStatusResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of MemberAccountStatus objects.
    */
  var OrganizationConfigRuleDetailedStatus: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.OrganizationConfigRuleDetailedStatus] = js.native
}
object GetOrganizationConfigRuleDetailedStatusResponse {
  
  @scala.inline
  def apply(): GetOrganizationConfigRuleDetailedStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrganizationConfigRuleDetailedStatusResponse]
  }
  
  @scala.inline
  implicit class GetOrganizationConfigRuleDetailedStatusResponseMutableBuilder[Self <: GetOrganizationConfigRuleDetailedStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRuleDetailedStatus(value: OrganizationConfigRuleDetailedStatus): Self = StObject.set(x, "OrganizationConfigRuleDetailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationConfigRuleDetailedStatusUndefined: Self = StObject.set(x, "OrganizationConfigRuleDetailedStatus", js.undefined)
    
    @scala.inline
    def setOrganizationConfigRuleDetailedStatusVarargs(value: MemberAccountStatus*): Self = StObject.set(x, "OrganizationConfigRuleDetailedStatus", js.Array(value :_*))
  }
}
