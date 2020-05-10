package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRuleUpdate extends js.Object {
  /**
    * Matches attributes derived from the request.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.native
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[NullableDouble] = js.native
  /**
    * Matches the HTTP method of a request.
    */
  var HTTPMethod: js.UndefOr[typingsSlinky.awsSdk.xrayMod.HTTPMethod] = js.native
  /**
    * Matches the hostname from a request URL.
    */
  var Host: js.UndefOr[typingsSlinky.awsSdk.xrayMod.Host] = js.native
  /**
    * The priority of the sampling rule.
    */
  var Priority: js.UndefOr[NullableInteger] = js.native
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  var ReservoirSize: js.UndefOr[NullableInteger] = js.native
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ResourceARN] = js.native
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.native
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[typingsSlinky.awsSdk.xrayMod.RuleName] = js.native
  /**
    * Matches the name that the service uses to identify itself in segments.
    */
  var ServiceName: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ServiceName] = js.native
  /**
    * Matches the origin that the service uses to identify its type in segments.
    */
  var ServiceType: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ServiceType] = js.native
  /**
    * Matches the path from a request URL.
    */
  var URLPath: js.UndefOr[typingsSlinky.awsSdk.xrayMod.URLPath] = js.native
}

object SamplingRuleUpdate {
  @scala.inline
  def apply(): SamplingRuleUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleUpdate]
  }
  @scala.inline
  implicit class SamplingRuleUpdateOps[Self <: SamplingRuleUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: AttributeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedRate(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedRate")(js.undefined)
        ret
    }
    @scala.inline
    def withHTTPMethod(value: HTTPMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTTPMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: Host): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(js.undefined)
        ret
    }
    @scala.inline
    def withReservoirSize(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservoirSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservoirSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservoirSize")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleName(value: RuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceType(value: ServiceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceType")(js.undefined)
        ret
    }
    @scala.inline
    def withURLPath(value: URLPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURLPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLPath")(js.undefined)
        ret
    }
  }
  
}

