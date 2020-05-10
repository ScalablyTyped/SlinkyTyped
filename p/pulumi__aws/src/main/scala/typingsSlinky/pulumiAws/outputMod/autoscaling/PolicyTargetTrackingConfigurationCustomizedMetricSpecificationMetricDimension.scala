package typingsSlinky.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension extends js.Object {
  /**
    * The name of the dimension.
    */
  var name: String = js.native
  /**
    * The value of the dimension.
    */
  var value: String = js.native
}

object PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension {
  @scala.inline
  def apply(name: String, value: String): PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
  }
  @scala.inline
  implicit class PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionOps[Self <: PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

