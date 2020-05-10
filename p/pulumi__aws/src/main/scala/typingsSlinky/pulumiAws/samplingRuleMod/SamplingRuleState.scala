package typingsSlinky.pulumiAws.samplingRuleMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRuleState extends js.Object {
  /**
    * The ARN of the sampling rule.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Matches attributes derived from the request.
    */
  val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  val fixedRate: js.UndefOr[Input[Double]] = js.native
  /**
    * Matches the hostname from a request URL.
    */
  val host: js.UndefOr[Input[String]] = js.native
  /**
    * Matches the HTTP method of a request.
    */
  val httpMethod: js.UndefOr[Input[String]] = js.native
  /**
    * The priority of the sampling rule.
    */
  val priority: js.UndefOr[Input[Double]] = js.native
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  val reservoirSize: js.UndefOr[Input[Double]] = js.native
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the sampling rule.
    */
  val ruleName: js.UndefOr[Input[String]] = js.native
  /**
    * Matches the `name` that the service uses to identify itself in segments.
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  /**
    * Matches the `origin` that the service uses to identify its type in segments.
    */
  val serviceType: js.UndefOr[Input[String]] = js.native
  /**
    * Matches the path from a request URL.
    */
  val urlPath: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the sampling rule format (`1` )
    */
  val version: js.UndefOr[Input[Double]] = js.native
}

object SamplingRuleState {
  @scala.inline
  def apply(): SamplingRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleState]
  }
  @scala.inline
  implicit class SamplingRuleStateOps[Self <: SamplingRuleState] (val x: Self) extends AnyVal {
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
    def withAttributes(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedRate(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRate")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpMethod(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withReservoirSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservoirSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservoirSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservoirSize")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPath")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

