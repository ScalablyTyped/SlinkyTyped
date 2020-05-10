package typingsSlinky.pulumiAws.resolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.route53.ResolverRuleTargetIp
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleState extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the resolver rule.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified using `targetIp`.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `targetIp`.
    * This argument should only be specified for `FORWARD` type rules.
    */
  val resolverEndpointId: js.UndefOr[Input[String]] = js.native
  /**
    * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    */
  val ruleType: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
    * This argument should only be specified for `FORWARD` type rules.
    */
  val targetIps: js.UndefOr[Input[js.Array[Input[ResolverRuleTargetIp]]]] = js.native
}

object ResolverRuleState {
  @scala.inline
  def apply(): ResolverRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleState]
  }
  @scala.inline
  implicit class ResolverRuleStateOps[Self <: ResolverRuleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(js.undefined)
        ret
    }
    @scala.inline
    def withResolverEndpointId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleType")(js.undefined)
        ret
    }
    @scala.inline
    def withShareStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetIps(value: Input[js.Array[Input[ResolverRuleTargetIp]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIps")(js.undefined)
        ret
    }
  }
  
}

