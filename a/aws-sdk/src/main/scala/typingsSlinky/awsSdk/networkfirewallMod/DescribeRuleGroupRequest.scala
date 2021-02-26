package typingsSlinky.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRuleGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group. You must specify the ARN or the name, and you can specify both. 
    */
  var RuleGroupArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var RuleGroupName: js.UndefOr[ResourceName] = js.native
  
  /**
    * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless rules. If it is stateful, it contains stateful rules.   This setting is required for requests that do not include the RuleGroupARN. 
    */
  var Type: js.UndefOr[RuleGroupType] = js.native
}
object DescribeRuleGroupRequest {
  
  @scala.inline
  def apply(): DescribeRuleGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuleGroupRequest]
  }
  
  @scala.inline
  implicit class DescribeRuleGroupRequestMutableBuilder[Self <: DescribeRuleGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "RuleGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupArnUndefined: Self = StObject.set(x, "RuleGroupArn", js.undefined)
    
    @scala.inline
    def setRuleGroupName(value: ResourceName): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupNameUndefined: Self = StObject.set(x, "RuleGroupName", js.undefined)
    
    @scala.inline
    def setType(value: RuleGroupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
