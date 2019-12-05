package typingsSlinky.reactDashNativeDashModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typingsSlinky.reactDashNative.reactDashNativeMod.ImageStyle
  import typingsSlinky.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
  import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
  import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
  import typingsSlinky.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.Animation
  import typingsSlinky.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.CustomAnimation

  type AnimationEvent = js.Function1[/* repeated */ js.Any, Unit]
  type OnOrientationChange = js.Function1[/* orientation */ NativeSyntheticEvent[js.Any], Unit]
  type OrNull[T] = Null | T
  type SupportedAnimation = Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])
}
