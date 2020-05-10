package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetOperationPreferences extends js.Object {
  /**
    * The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the operation in any subsequent regions. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage (but not both).
    */
  var FailureToleranceCount: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.FailureToleranceCount] = js.native
  /**
    * The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation stops the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage, but not both.
    */
  var FailureTolerancePercentage: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.FailureTolerancePercentage] = js.native
  /**
    * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of FailureToleranceCount—MaxConcurrentCount is at most one more than the FailureToleranceCount . Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
    */
  var MaxConcurrentCount: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.MaxConcurrentCount] = js.native
  /**
    * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, CloudFormation sets the number as one instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
    */
  var MaxConcurrentPercentage: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.MaxConcurrentPercentage] = js.native
  /**
    * The order of the regions in where you want to perform the stack operation.
    */
  var RegionOrder: js.UndefOr[RegionList] = js.native
}

object StackSetOperationPreferences {
  @scala.inline
  def apply(): StackSetOperationPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperationPreferences]
  }
  @scala.inline
  implicit class StackSetOperationPreferencesOps[Self <: StackSetOperationPreferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureToleranceCount(value: FailureToleranceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureToleranceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureToleranceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureToleranceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureTolerancePercentage(value: FailureTolerancePercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureTolerancePercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureTolerancePercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureTolerancePercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentCount(value: MaxConcurrentCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentPercentage(value: MaxConcurrentPercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionOrder(value: RegionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionOrder")(js.undefined)
        ret
    }
  }
  
}

