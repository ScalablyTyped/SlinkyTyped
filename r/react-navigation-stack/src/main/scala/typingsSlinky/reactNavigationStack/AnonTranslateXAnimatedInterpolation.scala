package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTranslateXAnimatedInterpolation extends js.Object {
  var translateX: AnimatedInterpolation = js.native
}

object AnonTranslateXAnimatedInterpolation {
  @scala.inline
  def apply(translateX: AnimatedInterpolation): AnonTranslateXAnimatedInterpolation = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslateXAnimatedInterpolation]
  }
  @scala.inline
  implicit class AnonTranslateXAnimatedInterpolationOps[Self <: AnonTranslateXAnimatedInterpolation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslateX(value: AnimatedInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

