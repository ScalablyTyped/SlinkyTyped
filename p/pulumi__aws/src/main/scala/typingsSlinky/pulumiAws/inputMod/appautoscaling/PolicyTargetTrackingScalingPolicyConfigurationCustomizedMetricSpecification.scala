package typingsSlinky.pulumiAws.inputMod.appautoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification extends js.Object {
  var dimensions: js.UndefOr[
    Input[
      js.Array[
        Input[
          PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
        ]
      ]
    ]
  ] = js.native
  var metricName: Input[String] = js.native
  var namespace: Input[String] = js.native
  var statistic: Input[String] = js.native
  var unit: js.UndefOr[Input[String]] = js.native
}

object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification {
  @scala.inline
  def apply(metricName: Input[String], namespace: Input[String], statistic: Input[String]): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification = {
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
    def withMetricName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatistic(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(
      value: Input[
          js.Array[
            Input[
              PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
            ]
          ]
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
    def withUnit(value: Input[String]): Self = {
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

