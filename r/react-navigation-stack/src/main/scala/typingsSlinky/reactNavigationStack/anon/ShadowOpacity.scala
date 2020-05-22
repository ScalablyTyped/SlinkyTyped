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
  def apply(
    transform: js.Array[TranslateXAnimatedInterpolation],
    overlayOpacity: AnimatedInterpolation = null,
    shadowOpacity: AnimatedInterpolation = null
  ): ShadowOpacity = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any], overlayOpacity = overlayOpacity.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowOpacity]
  }
}

