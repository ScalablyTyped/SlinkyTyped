package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateXAnimatedInterpolation extends js.Object {
  var translateX: AnimatedInterpolation = js.native
}

object TranslateXAnimatedInterpolation {
  @scala.inline
  def apply(translateX: AnimatedInterpolation): TranslateXAnimatedInterpolation = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateXAnimatedInterpolation]
  }
  @scala.inline
  implicit class TranslateXAnimatedInterpolationOps[Self <: TranslateXAnimatedInterpolation] (val x: Self) extends AnyVal {
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

