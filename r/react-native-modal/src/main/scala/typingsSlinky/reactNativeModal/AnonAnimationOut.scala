package typingsSlinky.reactNativeModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimationOut extends js.Object {
  var animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any = js.native
  var animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any = js.native
}

object AnonAnimationOut {
  @scala.inline
  def apply(
    animationIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any,
    animationOut: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any
  ): AnonAnimationOut = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationOut]
  }
  @scala.inline
  implicit class AnonAnimationOutOps[Self <: AnonAnimationOut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOut(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

