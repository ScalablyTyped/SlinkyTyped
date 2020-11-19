package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverRule extends js.Object {
  
  /**
    * The ARN (Amazon Resource Name) for the resolver rule specified by Id.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Arn] = js.native
  
  /**
    * A unique string that you specified when you created the resolver rule. CreatorRequestIdidentifies the request and allows failed requests to be retried without the risk of executing the operation twice. 
    */
  var CreatorRequestId: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.CreatorRequestId] = js.native
  
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps. If a query matches multiple resolver rules (example.com and www.example.com), the query is routed using the resolver rule that contains the most specific domain name (www.example.com).
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.DomainName] = js.native
  
  /**
    * The ID that Resolver assigned to the resolver rule when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  
  /**
    * The name for the resolver rule, which you specified when you created the resolver rule.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Name] = js.native
  
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  var OwnerId: js.UndefOr[AccountId] = js.native
  
  /**
    * The ID of the endpoint that the rule is associated with.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  
  /**
    * This value is always FORWARD. Other resolver rule types aren't supported.
    */
  var RuleType: js.UndefOr[RuleTypeOption] = js.native
  
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    */
  var ShareStatus: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ShareStatus] = js.native
  
  /**
    * A code that specifies the current status of the resolver rule.
    */
  var Status: js.UndefOr[ResolverRuleStatus] = js.native
  
  /**
    * A detailed description of the status of a resolver rule.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.StatusMessage] = js.native
  
  /**
    * An array that contains the IP addresses and ports that you want to forward 
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
}
object ResolverRule {
  
  @scala.inline
  def apply(): ResolverRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRule]
  }
  
  @scala.inline
  implicit class ResolverRuleOps[Self <: ResolverRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: CreatorRequestId): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwnerId(value: AccountId): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = this.set("ResolverEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverEndpointId: Self = this.set("ResolverEndpointId", js.undefined)
    
    @scala.inline
    def setRuleType(value: RuleTypeOption): Self = this.set("RuleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleType: Self = this.set("RuleType", js.undefined)
    
    @scala.inline
    def setShareStatus(value: ShareStatus): Self = this.set("ShareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareStatus: Self = this.set("ShareStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: ResolverRuleStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setTargetIpsVarargs(value: TargetAddress*): Self = this.set("TargetIps", js.Array(value :_*))
    
    @scala.inline
    def setTargetIps(value: TargetList): Self = this.set("TargetIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetIps: Self = this.set("TargetIps", js.undefined)
  }
}
