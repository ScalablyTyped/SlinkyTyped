package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBasedAutoScalingResult extends js.Object {
  /**
    * An array of LoadBasedAutoScalingConfiguration objects that describe each layer's configuration.
    */
  var LoadBasedAutoScalingConfigurations: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.LoadBasedAutoScalingConfigurations] = js.native
}

object DescribeLoadBasedAutoScalingResult {
  @scala.inline
  def apply(): DescribeLoadBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBasedAutoScalingResult]
  }
  @scala.inline
  implicit class DescribeLoadBasedAutoScalingResultOps[Self <: DescribeLoadBasedAutoScalingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBasedAutoScalingConfigurations(value: LoadBasedAutoScalingConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBasedAutoScalingConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBasedAutoScalingConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBasedAutoScalingConfigurations")(js.undefined)
        ret
    }
  }
  
}

