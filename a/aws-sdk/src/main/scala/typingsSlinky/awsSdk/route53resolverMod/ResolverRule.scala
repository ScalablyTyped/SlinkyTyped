package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorRequestId(value: CreatorRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withResolverEndpointId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleType(value: RuleTypeOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleType")(js.undefined)
        ret
    }
    @scala.inline
    def withShareStatus(value: ShareStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ResolverRuleStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetIps(value: TargetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetIps")(js.undefined)
        ret
    }
  }
  
}

