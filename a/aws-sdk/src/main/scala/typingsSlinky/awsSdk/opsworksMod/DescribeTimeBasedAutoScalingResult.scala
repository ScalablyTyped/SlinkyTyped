package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTimeBasedAutoScalingResult extends js.Object {
  /**
    * An array of TimeBasedAutoScalingConfiguration objects that describe the configuration for the specified instances.
    */
  var TimeBasedAutoScalingConfigurations: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.TimeBasedAutoScalingConfigurations] = js.native
}

object DescribeTimeBasedAutoScalingResult {
  @scala.inline
  def apply(): DescribeTimeBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingResult]
  }
  @scala.inline
  implicit class DescribeTimeBasedAutoScalingResultOps[Self <: DescribeTimeBasedAutoScalingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeBasedAutoScalingConfigurations(value: TimeBasedAutoScalingConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeBasedAutoScalingConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeBasedAutoScalingConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeBasedAutoScalingConfigurations")(js.undefined)
        ret
    }
  }
  
}

