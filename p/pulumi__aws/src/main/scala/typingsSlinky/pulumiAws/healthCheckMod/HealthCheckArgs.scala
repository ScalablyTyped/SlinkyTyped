package typingsSlinky.pulumiAws.healthCheckMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheckArgs extends js.Object {
  /**
    * The minimum number of child health checks that must be healthy for Route 53 to consider the parent health check to be healthy. Valid values are integers between 0 and 256, inclusive
    */
  val childHealthThreshold: js.UndefOr[Input[Double]] = js.native
  /**
    * For a specified parent health check, a list of HealthCheckId values for the associated child health checks.
    */
  val childHealthchecks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the CloudWatch alarm.
    */
  val cloudwatchAlarmName: js.UndefOr[Input[String]] = js.native
  /**
    * The CloudWatchRegion that the CloudWatch alarm was created in.
    */
  val cloudwatchAlarmRegion: js.UndefOr[Input[String]] = js.native
  /**
    * A boolean value that indicates whether Route53 should send the `fqdn` to the endpoint when performing the health check. This defaults to AWS' defaults: when the `type` is "HTTPS" `enableSni` defaults to `true`, when `type` is anything else `enableSni` defaults to `false`.
    */
  val enableSni: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The number of consecutive health checks that an endpoint must pass or fail.
    */
  val failureThreshold: js.UndefOr[Input[Double]] = js.native
  /**
    * The fully qualified domain name of the endpoint to be checked.
    */
  val fqdn: js.UndefOr[Input[String]] = js.native
  /**
    * The status of the health check when CloudWatch has insufficient data about the state of associated alarm. Valid values are `Healthy` , `Unhealthy` and `LastKnownStatus`.
    */
  val insufficientDataHealthStatus: js.UndefOr[Input[String]] = js.native
  /**
    * A boolean value that indicates whether the status of health check should be inverted. For example, if a health check is healthy but Inverted is True , then Route 53 considers the health check to be unhealthy.
    */
  val invertHealthcheck: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The IP address of the endpoint to be checked.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * A Boolean value that indicates whether you want Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint and to display CloudWatch latency graphs in the Route 53 console.
    */
  val measureLatency: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The port of the endpoint to be checked.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single healthCheck set amongst others)
    */
  val referenceName: js.UndefOr[Input[String]] = js.native
  /**
    * A list of AWS regions that you want Amazon Route 53 health checkers to check the specified endpoint from.
    */
  val regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health-check request.
    */
  val requestInterval: js.UndefOr[Input[Double]] = js.native
  /**
    * The path that you want Amazon Route 53 to request when performing health checks.
    */
  val resourcePath: js.UndefOr[Input[String]] = js.native
  /**
    * String searched in the first 5120 bytes of the response body for check to be considered healthy. Only valid with `HTTP_STR_MATCH` and `HTTPS_STR_MATCH`.
    */
  val searchString: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the health check.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The protocol to use when performing health checks. Valid values are `HTTP`, `HTTPS`, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, `TCP`, `CALCULATED` and `CLOUDWATCH_METRIC`.
    */
  val `type`: Input[String] = js.native
}

object HealthCheckArgs {
  @scala.inline
  def apply(`type`: Input[String]): HealthCheckArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheckArgs]
  }
  @scala.inline
  implicit class HealthCheckArgsOps[Self <: HealthCheckArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildHealthThreshold(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childHealthThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildHealthThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childHealthThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withChildHealthchecks(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childHealthchecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildHealthchecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childHealthchecks")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchAlarmName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchAlarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchAlarmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchAlarmName")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchAlarmRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchAlarmRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchAlarmRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchAlarmRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSni(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSni")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSni: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSni")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureThreshold(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withFqdn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fqdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFqdn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fqdn")(js.undefined)
        ret
    }
    @scala.inline
    def withInsufficientDataHealthStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insufficientDataHealthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsufficientDataHealthStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insufficientDataHealthStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertHealthcheck(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertHealthcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertHealthcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertHealthcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureLatency(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureLatency")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestInterval(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcePath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchString(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchString")(js.undefined)
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
  }
  
}

