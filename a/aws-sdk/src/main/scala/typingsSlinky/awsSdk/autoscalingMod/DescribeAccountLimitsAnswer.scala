package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountLimitsAnswer extends js.Object {
  /**
    * The maximum number of groups allowed for your AWS account. The default is 200 groups per AWS Region.
    */
  var MaxNumberOfAutoScalingGroups: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MaxNumberOfAutoScalingGroups] = js.native
  /**
    * The maximum number of launch configurations allowed for your AWS account. The default is 200 launch configurations per AWS Region.
    */
  var MaxNumberOfLaunchConfigurations: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.MaxNumberOfLaunchConfigurations] = js.native
  /**
    * The current number of groups for your AWS account.
    */
  var NumberOfAutoScalingGroups: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.NumberOfAutoScalingGroups] = js.native
  /**
    * The current number of launch configurations for your AWS account.
    */
  var NumberOfLaunchConfigurations: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.NumberOfLaunchConfigurations] = js.native
}

object DescribeAccountLimitsAnswer {
  @scala.inline
  def apply(): DescribeAccountLimitsAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsAnswer]
  }
  @scala.inline
  implicit class DescribeAccountLimitsAnswerOps[Self <: DescribeAccountLimitsAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxNumberOfAutoScalingGroups(value: MaxNumberOfAutoScalingGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxNumberOfAutoScalingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumberOfAutoScalingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxNumberOfAutoScalingGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNumberOfLaunchConfigurations(value: MaxNumberOfLaunchConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxNumberOfLaunchConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumberOfLaunchConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxNumberOfLaunchConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfAutoScalingGroups(value: NumberOfAutoScalingGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfAutoScalingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfAutoScalingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfAutoScalingGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfLaunchConfigurations(value: NumberOfLaunchConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfLaunchConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLaunchConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfLaunchConfigurations")(js.undefined)
        ret
    }
  }
  
}

