package typingsSlinky.pulumiAws.inputMod.autoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingConfigurationCustomizedMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric.
    */
  var metricDimensions: js.UndefOr[
    Input[
      js.Array[
        Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
      ]
    ]
  ] = js.native
  /**
    * The name of the metric.
    */
  var metricName: Input[String] = js.native
  /**
    * The namespace of the metric.
    */
  var namespace: Input[String] = js.native
  /**
    * The statistic of the metric.
    */
  var statistic: Input[String] = js.native
  /**
    * The unit of the metric.
    */
  var unit: js.UndefOr[Input[String]] = js.native
}

object PolicyTargetTrackingConfigurationCustomizedMetricSpecification {
  @scala.inline
  def apply(metricName: Input[String], namespace: Input[String], statistic: Input[String]): PolicyTargetTrackingConfigurationCustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]
  }
  @scala.inline
  implicit class PolicyTargetTrackingConfigurationCustomizedMetricSpecificationOps[Self <: PolicyTargetTrackingConfigurationCustomizedMetricSpecification] (val x: Self) extends AnyVal {
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
    def withMetricDimensions(
      value: Input[
          js.Array[
            Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricDimensions")(js.undefined)
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

