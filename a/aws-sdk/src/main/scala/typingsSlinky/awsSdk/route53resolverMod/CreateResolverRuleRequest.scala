package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResolverRuleRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typingsSlinky.awsSdk.route53resolverMod.CreatorRequestId = js.native
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that you specify in TargetIps. If a query matches multiple resolver rules (example.com and www.example.com), outbound DNS queries are routed using the resolver rule that contains the most specific domain name (www.example.com).
    */
  var DomainName: typingsSlinky.awsSdk.route53resolverMod.DomainName = js.native
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Name] = js.native
  /**
    * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  /**
    * Specify FORWARD. Other resolver rule types aren't supported.
    */
  var RuleType: RuleTypeOption = js.native
  /**
    * A list of the tag keys and values that you want to associate with the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The IPs that you want Resolver to forward DNS queries to. You can specify only IPv4 addresses. Separate IP addresses with a comma.
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
}

object CreateResolverRuleRequest {
  @scala.inline
  def apply(CreatorRequestId: CreatorRequestId, DomainName: DomainName, RuleType: RuleTypeOption): CreateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], RuleType = RuleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverRuleRequest]
  }
  @scala.inline
  implicit class CreateResolverRuleRequestOps[Self <: CreateResolverRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatorRequestId(value: CreatorRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleType(value: RuleTypeOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleType")(value.asInstanceOf[js.Any])
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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

