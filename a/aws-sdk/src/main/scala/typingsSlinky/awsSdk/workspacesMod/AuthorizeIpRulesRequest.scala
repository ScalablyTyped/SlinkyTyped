package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeIpRulesRequest extends StObject {
  
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId = js.native
  
  /**
    * The rules to add to the group.
    */
  var UserRules: IpRuleList = js.native
}
object AuthorizeIpRulesRequest {
  
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRuleList): AuthorizeIpRulesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], UserRules = UserRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeIpRulesRequest]
  }
  
  @scala.inline
  implicit class AuthorizeIpRulesRequestMutableBuilder[Self <: AuthorizeIpRulesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: IpGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRules(value: IpRuleList): Self = StObject.set(x, "UserRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRulesVarargs(value: IpRuleItem*): Self = StObject.set(x, "UserRules", js.Array(value :_*))
  }
}
