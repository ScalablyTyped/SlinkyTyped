package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTargetsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn = js.native
  /**
    * The targets. If you specified a port override when you registered a target, you must specify both the target ID and the port when you deregister it.
    */
  var Targets: TargetDescriptions = js.native
}

object DeregisterTargetsInput {
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn, Targets: TargetDescriptions): DeregisterTargetsInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTargetsInput]
  }
  @scala.inline
  implicit class DeregisterTargetsInputOps[Self <: DeregisterTargetsInput] (val x: Self) extends AnyVal {
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
  }
  
}

