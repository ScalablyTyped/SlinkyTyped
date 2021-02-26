package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResolverQueryLogConfigPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the account that you want to share rules with.
    */
  var Arn: typingsSlinky.awsSdk.route53resolverMod.Arn = js.native
  
  /**
    * An AWS Identity and Access Management policy statement that lists the query logging configurations that you want to share with another AWS account and the operations that you want the account to be able to perform. You can specify the following operations in the Actions section of the statement:    route53resolver:AssociateResolverQueryLogConfig     route53resolver:DisassociateResolverQueryLogConfig     route53resolver:ListResolverQueryLogConfigAssociations     route53resolver:ListResolverQueryLogConfigs    In the Resource section of the statement, you specify the ARNs for the query logging configurations that you want to share with the account that you specified in Arn. 
    */
  var ResolverQueryLogConfigPolicy: typingsSlinky.awsSdk.route53resolverMod.ResolverQueryLogConfigPolicy = js.native
}
object PutResolverQueryLogConfigPolicyRequest {
  
  @scala.inline
  def apply(Arn: Arn, ResolverQueryLogConfigPolicy: ResolverQueryLogConfigPolicy): PutResolverQueryLogConfigPolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ResolverQueryLogConfigPolicy = ResolverQueryLogConfigPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResolverQueryLogConfigPolicyRequest]
  }
  
  @scala.inline
  implicit class PutResolverQueryLogConfigPolicyRequestMutableBuilder[Self <: PutResolverQueryLogConfigPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigPolicy(value: ResolverQueryLogConfigPolicy): Self = StObject.set(x, "ResolverQueryLogConfigPolicy", value.asInstanceOf[js.Any])
  }
}
