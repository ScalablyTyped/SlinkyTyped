package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTranslateYAnimatedInterpolation extends js.Object {
  var translateY: AnimatedInterpolation = js.native
}

object AnonTranslateYAnimatedInterpolation {
  @scala.inline
  def apply(translateY: AnimatedInterpolation): AnonTranslateYAnimatedInterpolation = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslateYAnimatedInterpolation]
  }
  @scala.inline
  implicit class AnonTranslateYAnimatedInterpolationOps[Self <: AnonTranslateYAnimatedInterpolation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslateY(value: AnimatedInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

