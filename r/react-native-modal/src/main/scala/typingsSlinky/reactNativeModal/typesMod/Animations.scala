package typingsSlinky.reactNativeModal.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animations extends js.Object {
  var animationIn: String = js.native
  var animationOut: String = js.native
}

object Animations {
  @scala.inline
  def apply(animationIn: String, animationOut: String): Animations = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animations]
  }
  @scala.inline
  implicit class AnimationsOps[Self <: Animations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

