package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateYAnimatedInterpolation extends js.Object {
  var translateY: AnimatedInterpolation
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTranslateY(value: AnimatedInterpolation): Self = this.set("translateY", value.asInstanceOf[js.Any])
  }
  
}

