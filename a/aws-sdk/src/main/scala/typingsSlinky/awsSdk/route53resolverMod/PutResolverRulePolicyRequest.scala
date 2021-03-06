package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResolverRulePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the account that you want to share rules with.
    */
  var Arn: typingsSlinky.awsSdk.route53resolverMod.Arn = js.native
  
  /**
    * An AWS Identity and Access Management policy statement that lists the rules that you want to share with another AWS account and the operations that you want the account to be able to perform. You can specify the following operations in the Actions section of the statement:    route53resolver:GetResolverRule     route53resolver:AssociateResolverRule     route53resolver:DisassociateResolverRule     route53resolver:ListResolverRules     route53resolver:ListResolverRuleAssociations    In the Resource section of the statement, you specify the ARNs for the rules that you want to share with the account that you specified in Arn. 
    */
  var ResolverRulePolicy: typingsSlinky.awsSdk.route53resolverMod.ResolverRulePolicy = js.native
}
object PutResolverRulePolicyRequest {
  
  @scala.inline
  def apply(Arn: Arn, ResolverRulePolicy: ResolverRulePolicy): PutResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ResolverRulePolicy = ResolverRulePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResolverRulePolicyRequest]
  }
  
  @scala.inline
  implicit class PutResolverRulePolicyRequestMutableBuilder[Self <: PutResolverRulePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRulePolicy(value: ResolverRulePolicy): Self = StObject.set(x, "ResolverRulePolicy", value.asInstanceOf[js.Any])
  }
}
