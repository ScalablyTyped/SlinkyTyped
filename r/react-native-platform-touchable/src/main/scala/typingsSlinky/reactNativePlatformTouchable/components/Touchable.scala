package typingsSlinky.reactNativePlatformTouchable.components

import typingsSlinky.reactNativePlatformTouchable.mod.PlatformTouchableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Touchable {
  @JSImport("react-native-platform-touchable", "Touchable")
  @js.native
  object component extends js.Object
  
  def withProps(p: PlatformTouchableProps): SharedBuilder_PlatformTouchableProps1790487014[typingsSlinky.reactNativePlatformTouchable.mod.Touchable] = new SharedBuilder_PlatformTouchableProps1790487014[typingsSlinky.reactNativePlatformTouchable.mod.Touchable](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Touchable.type): SharedBuilder_PlatformTouchableProps1790487014[typingsSlinky.reactNativePlatformTouchable.mod.Touchable] = new SharedBuilder_PlatformTouchableProps1790487014[typingsSlinky.reactNativePlatformTouchable.mod.Touchable](js.Array(this.component, js.Dictionary.empty))()
}

