package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowOpacity extends js.Object {
  var opacity: js.UndefOr[scala.Nothing] = js.undefined
  var overlayOpacity: AnimatedInterpolation | Null
  var shadowOpacity: AnimatedInterpolation | Null
  var transform: js.Array[TranslateXAnimatedInterpolation]
}

object ShadowOpacity {
  @scala.inline
  def apply(transform: js.Array[TranslateXAnimatedInterpolation]): ShadowOpacity = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowOpacity]
  }
  @scala.inline
  implicit class ShadowOpacityOps[Self <: ShadowOpacity] (val x: Self) extends AnyVal {
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
    def setTransformVarargs(value: TranslateXAnimatedInterpolation*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: js.Array[TranslateXAnimatedInterpolation]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayOpacity(value: AnimatedInterpolation): Self = this.set("overlayOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayOpacityNull: Self = this.set("overlayOpacity", null)
    @scala.inline
    def setShadowOpacity(value: AnimatedInterpolation): Self = this.set("shadowOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowOpacityNull: Self = this.set("shadowOpacity", null)
  }
  
}

