package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateXAnimatedInterpolation extends js.Object {
  var translateX: AnimatedInterpolation
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTranslateX(value: AnimatedInterpolation): Self = this.set("translateX", value.asInstanceOf[js.Any])
  }
  
}

