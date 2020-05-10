package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTargetGroupArn extends js.Object {
  var targetGroupArn: String = js.native
}

object AnonTargetGroupArn {
  @scala.inline
  def apply(targetGroupArn: String): AnonTargetGroupArn = {
    val __obj = js.Dynamic.literal(targetGroupArn = targetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetGroupArn]
  }
  @scala.inline
  implicit class AnonTargetGroupArnOps[Self <: AnonTargetGroupArn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

