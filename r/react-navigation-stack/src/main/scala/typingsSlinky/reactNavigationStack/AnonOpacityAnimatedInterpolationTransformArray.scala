package typingsSlinky.reactNavigationStack

import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOpacityAnimatedInterpolationTransformArray extends js.Object {
  var opacity: AnimatedInterpolation = js.native
  var transform: js.Array[AnonTranslateXAnimatedInterpolation] = js.native
}

object AnonOpacityAnimatedInterpolationTransformArray {
  @scala.inline
  def apply(opacity: AnimatedInterpolation, transform: js.Array[AnonTranslateXAnimatedInterpolation]): AnonOpacityAnimatedInterpolationTransformArray = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacityAnimatedInterpolationTransformArray]
  }
  @scala.inline
  implicit class AnonOpacityAnimatedInterpolationTransformArrayOps[Self <: AnonOpacityAnimatedInterpolationTransformArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpacity(value: AnimatedInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: js.Array[AnonTranslateXAnimatedInterpolation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

