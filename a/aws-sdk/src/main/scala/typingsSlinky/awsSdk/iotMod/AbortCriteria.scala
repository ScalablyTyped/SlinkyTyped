package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortCriteria extends js.Object {
  /**
    * The type of abort action to initiate a job abort.
    */
  var action: AbortAction = js.native
  /**
    * The type of job execution failure to define a rule to initiate a job abort.
    */
  var failureType: JobExecutionFailureType = js.native
  /**
    * Minimum number of executed things before evaluating an abort rule.
    */
  var minNumberOfExecutedThings: MinimumNumberOfExecutedThings = js.native
  /**
    * The threshold as a percentage of the total number of executed things that will initiate a job abort. AWS IoT supports up to two digits after the decimal (for example, 10.9 and 10.99, but not 10.999).
    */
  var thresholdPercentage: AbortThresholdPercentage = js.native
}

object AbortCriteria {
  @scala.inline
  def apply(
    action: AbortAction,
    failureType: JobExecutionFailureType,
    minNumberOfExecutedThings: MinimumNumberOfExecutedThings,
    thresholdPercentage: AbortThresholdPercentage
  ): AbortCriteria = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], minNumberOfExecutedThings = minNumberOfExecutedThings.asInstanceOf[js.Any], thresholdPercentage = thresholdPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortCriteria]
  }
  @scala.inline
  implicit class AbortCriteriaOps[Self <: AbortCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: AbortAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureType(value: JobExecutionFailureType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinNumberOfExecutedThings(value: MinimumNumberOfExecutedThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNumberOfExecutedThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThresholdPercentage(value: AbortThresholdPercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdPercentage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

