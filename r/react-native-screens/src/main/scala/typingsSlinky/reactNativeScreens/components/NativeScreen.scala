package typingsSlinky.reactNativeScreens.components

import typingsSlinky.reactNativeScreens.mod.ScreenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NativeScreen {
  
  @JSImport("react-native-screens", "NativeScreen")
  @js.native
  object component extends js.Object
  
  def withProps(p: ScreenProps): SharedBuilder_ScreenProps13027081[typingsSlinky.reactNativeScreens.mod.NativeScreen] = new SharedBuilder_ScreenProps13027081[typingsSlinky.reactNativeScreens.mod.NativeScreen](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: NativeScreen.type): SharedBuilder_ScreenProps13027081[typingsSlinky.reactNativeScreens.mod.NativeScreen] = new SharedBuilder_ScreenProps13027081[typingsSlinky.reactNativeScreens.mod.NativeScreen](js.Array(this.component, js.Dictionary.empty))()
}
