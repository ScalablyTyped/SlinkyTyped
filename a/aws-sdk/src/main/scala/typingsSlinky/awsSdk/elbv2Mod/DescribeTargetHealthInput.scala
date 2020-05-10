package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTargetHealthInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn = js.native
  /**
    * The targets.
    */
  var Targets: js.UndefOr[TargetDescriptions] = js.native
}

object DescribeTargetHealthInput {
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn): DescribeTargetHealthInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetHealthInput]
  }
  @scala.inline
  implicit class DescribeTargetHealthInputOps[Self <: DescribeTargetHealthInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetGroupArn(value: TargetGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: TargetDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Targets")(js.undefined)
        ret
    }
  }
  
}

