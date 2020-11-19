package typingsSlinky.pulumiAws.inputMod.autoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyStepAdjustment extends js.Object {
  
  /**
    * The lower bound for the
    * difference between the alarm threshold and the CloudWatch metric.
    * Without a value, AWS will treat this bound as infinity.
    */
  var metricIntervalLowerBound: js.UndefOr[Input[String]] = js.native
  
  /**
    * The upper bound for the
    * difference between the alarm threshold and the CloudWatch metric.
    * Without a value, AWS will treat this bound as infinity. The upper bound
    * must be greater than the lower bound.
    */
  var metricIntervalUpperBound: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of members by which to
    * scale, when the adjustment bounds are breached. A positive value scales
    * up. A negative value scales down.
    */
  var scalingAdjustment: Input[Double] = js.native
}
object PolicyStepAdjustment {
  
  @scala.inline
  def apply(scalingAdjustment: Input[Double]): PolicyStepAdjustment = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStepAdjustment]
  }
  
  @scala.inline
  implicit class PolicyStepAdjustmentOps[Self <: PolicyStepAdjustment] (val x: Self) extends AnyVal {
    
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
    def setScalingAdjustment(value: Input[Double]): Self = this.set("scalingAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricIntervalLowerBound(value: Input[String]): Self = this.set("metricIntervalLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricIntervalLowerBound: Self = this.set("metricIntervalLowerBound", js.undefined)
    
    @scala.inline
    def setMetricIntervalUpperBound(value: Input[String]): Self = this.set("metricIntervalUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricIntervalUpperBound: Self = this.set("metricIntervalUpperBound", js.undefined)
  }
}
