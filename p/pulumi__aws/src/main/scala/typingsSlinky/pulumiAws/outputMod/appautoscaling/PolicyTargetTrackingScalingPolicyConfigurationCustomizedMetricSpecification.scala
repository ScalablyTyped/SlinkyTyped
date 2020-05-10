package typingsSlinky.pulumiAws.outputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification extends js.Object {
  var dimensions: js.UndefOr[
    js.Array[
      PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
    ]
  ] = js.native
  var metricName: String = js.native
  var namespace: String = js.native
  var statistic: String = js.native
  var unit: js.UndefOr[String] = js.native
}

object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification {
  @scala.inline
  def apply(metricName: String, namespace: String, statistic: String): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification]
  }
  @scala.inline
  implicit class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationOps[Self <: PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(
      value: js.Array[
          PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

