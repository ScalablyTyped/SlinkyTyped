package typingsSlinky.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredefinedMetricSpecification extends js.Object {
  /**
    * The metric type. The ALBRequestCountPerTarget metric type applies only to Spot Fleet requests and ECS services.
    */
  var PredefinedMetricType: MetricType = js.native
  /**
    * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group attached to the Spot Fleet request or ECS service. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
    */
  var ResourceLabel: js.UndefOr[typingsSlinky.awsSdk.applicationautoscalingMod.ResourceLabel] = js.native
}

object PredefinedMetricSpecification {
  @scala.inline
  def apply(PredefinedMetricType: MetricType): PredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(PredefinedMetricType = PredefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedMetricSpecification]
  }
  @scala.inline
  implicit class PredefinedMetricSpecificationOps[Self <: PredefinedMetricSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredefinedMetricType(value: MetricType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedMetricType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceLabel(value: ResourceLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceLabel")(js.undefined)
        ret
    }
  }
  
}

