package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleVisibilityConfig extends js.Object {
  
  /**
    * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
    */
  var cloudwatchMetricsEnabled: Input[Boolean] = js.native
  
  /**
    * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can't contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
    */
  var metricName: Input[String] = js.native
  
  /**
    * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
    */
  var sampledRequestsEnabled: Input[Boolean] = js.native
}
object WebAclRuleVisibilityConfig {
  
  @scala.inline
  def apply(
    cloudwatchMetricsEnabled: Input[Boolean],
    metricName: Input[String],
    sampledRequestsEnabled: Input[Boolean]
  ): WebAclRuleVisibilityConfig = {
    val __obj = js.Dynamic.literal(cloudwatchMetricsEnabled = cloudwatchMetricsEnabled.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], sampledRequestsEnabled = sampledRequestsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleVisibilityConfig]
  }
  
  @scala.inline
  implicit class WebAclRuleVisibilityConfigOps[Self <: WebAclRuleVisibilityConfig] (val x: Self) extends AnyVal {
    
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
    def setCloudwatchMetricsEnabled(value: Input[Boolean]): Self = this.set("cloudwatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampledRequestsEnabled(value: Input[Boolean]): Self = this.set("sampledRequestsEnabled", value.asInstanceOf[js.Any])
  }
}
