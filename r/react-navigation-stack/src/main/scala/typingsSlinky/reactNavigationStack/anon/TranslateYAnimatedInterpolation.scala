package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateYAnimatedInterpolation extends js.Object {
  var translateY: AnimatedInterpolation = js.native
}

object TranslateYAnimatedInterpolation {
  @scala.inline
  def apply(translateY: AnimatedInterpolation): TranslateYAnimatedInterpolation = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateYAnimatedInterpolation]
  }
  @scala.inline
  implicit class TranslateYAnimatedInterpolationOps[Self <: TranslateYAnimatedInterpolation] (val x: Self) extends AnyVal {
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

