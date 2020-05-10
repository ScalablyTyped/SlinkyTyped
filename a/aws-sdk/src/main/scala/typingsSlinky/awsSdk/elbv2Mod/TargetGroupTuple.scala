package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupTuple extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn] = js.native
  /**
    * The weight. The range is 0 to 999.
    */
  var Weight: js.UndefOr[TargetGroupWeight] = js.native
}

object TargetGroupTuple {
  @scala.inline
  def apply(): TargetGroupTuple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupTuple]
  }
  @scala.inline
  implicit class TargetGroupTupleOps[Self <: TargetGroupTuple] (val x: Self) extends AnyVal {
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
    def withoutTargetGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: TargetGroupWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weight")(js.undefined)
        ret
    }
  }
  
}

