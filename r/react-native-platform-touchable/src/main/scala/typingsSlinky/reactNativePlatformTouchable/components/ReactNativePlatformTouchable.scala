package typingsSlinky.reactNativePlatformTouchable.components

import typingsSlinky.reactNativePlatformTouchable.mod.PlatformTouchableProps
import typingsSlinky.reactNativePlatformTouchable.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativePlatformTouchable {
  
  @JSImport("react-native-platform-touchable", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PlatformTouchableProps): SharedBuilder_PlatformTouchableProps1790487014[default] = new SharedBuilder_PlatformTouchableProps1790487014[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativePlatformTouchable.type): SharedBuilder_PlatformTouchableProps1790487014[default] = new SharedBuilder_PlatformTouchableProps1790487014[default](js.Array(this.component, js.Dictionary.empty))()
}
