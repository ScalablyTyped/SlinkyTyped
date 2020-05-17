package typingsSlinky.reactNativeModal.typesMod

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAnimatable.mod.Animation
import typingsSlinky.reactNativeAnimatable.mod.CustomAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeAnimatable.mod.Animation
  - typingsSlinky.reactNativeAnimatable.mod.CustomAnimation[
typingsSlinky.reactNative.mod.TextStyle with typingsSlinky.reactNative.mod.ViewStyle with typingsSlinky.reactNative.mod.ImageStyle]
*/
trait SupportedAnimation extends js.Object

object SupportedAnimation {
  @scala.inline
  implicit def apply(value: Animation): SupportedAnimation = value.asInstanceOf[SupportedAnimation]
  @scala.inline
  implicit def apply(value: CustomAnimation[TextStyle with ViewStyle with ImageStyle]): SupportedAnimation = value.asInstanceOf[SupportedAnimation]
}

