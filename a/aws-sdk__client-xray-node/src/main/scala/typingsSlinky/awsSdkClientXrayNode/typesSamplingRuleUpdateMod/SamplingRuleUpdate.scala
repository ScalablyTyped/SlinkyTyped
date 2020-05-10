package typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleUpdateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRuleUpdate extends js.Object {
  /**
    * <p>Matches attributes derived from the request.</p>
    */
  var Attributes: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
  /**
    * <p>The percentage of matching requests to instrument, after the reservoir is exhausted.</p>
    */
  var FixedRate: js.UndefOr[Double] = js.native
  /**
    * <p>Matches the HTTP method of a request.</p>
    */
  var HTTPMethod: js.UndefOr[String] = js.native
  /**
    * <p>Matches the hostname from a request URL.</p>
    */
  var Host: js.UndefOr[String] = js.native
  /**
    * <p>The priority of the sampling rule.</p>
    */
  var Priority: js.UndefOr[Double] = js.native
  /**
    * <p>A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.</p>
    */
  var ReservoirSize: js.UndefOr[Double] = js.native
  /**
    * <p>Matches the ARN of the AWS resource on which the service runs.</p>
    */
  var ResourceARN: js.UndefOr[String] = js.native
  /**
    * <p>The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
    */
  var RuleARN: js.UndefOr[String] = js.native
  /**
    * <p>The name of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
    */
  var RuleName: js.UndefOr[String] = js.native
  /**
    * <p>Matches the <code>name</code> that the service uses to identify itself in segments.</p>
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * <p>Matches the <code>origin</code> that the service uses to identify its type in segments.</p>
    */
  var ServiceType: js.UndefOr[String] = js.native
  /**
    * <p>Matches the path from a request URL.</p>
    */
  var URLPath: js.UndefOr[String] = js.native
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
    def withAttributesIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = {
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
    def withFixedRate(value: Double): Self = {
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
    def withHTTPMethod(value: String): Self = {
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
    def withHost(value: String): Self = {
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
    def withPriority(value: Double): Self = {
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
    def withReservoirSize(value: Double): Self = {
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
    def withResourceARN(value: String): Self = {
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
    def withRuleName(value: String): Self = {
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
    def withServiceName(value: String): Self = {
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
    def withServiceType(value: String): Self = {
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
    def withURLPath(value: String): Self = {
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

