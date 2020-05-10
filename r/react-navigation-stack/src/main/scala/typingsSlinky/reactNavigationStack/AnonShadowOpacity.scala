package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShadowOpacity extends js.Object {
  var opacity: js.UndefOr[scala.Nothing] = js.native
  var overlayOpacity: AnimatedInterpolation | Null = js.native
  var shadowOpacity: AnimatedInterpolation | Null = js.native
  var transform: js.Array[AnonTranslateXAnimatedInterpolation] = js.native
}

object AnonShadowOpacity {
  @scala.inline
  def apply(transform: js.Array[AnonTranslateXAnimatedInterpolation]): AnonShadowOpacity = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShadowOpacity]
  }
  @scala.inline
  implicit class AnonShadowOpacityOps[Self <: AnonShadowOpacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransform(value: js.Array[AnonTranslateXAnimatedInterpolation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayOpacity(value: AnimatedInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayOpacityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayOpacity")(null)
        ret
    }
    @scala.inline
    def withShadowOpacity(value: AnimatedInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowOpacityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOpacity")(null)
        ret
    }
  }
  
}

