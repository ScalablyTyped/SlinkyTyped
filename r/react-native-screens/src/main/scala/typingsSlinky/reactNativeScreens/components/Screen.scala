package typingsSlinky.reactNativeScreens.components

import typingsSlinky.reactNativeScreens.mod.ScreenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Screen {
  
  @JSImport("react-native-screens", "Screen")
  @js.native
  object component extends js.Object
  
  def withProps(p: ScreenProps): SharedBuilder_ScreenProps13027081[typingsSlinky.reactNativeScreens.mod.Screen] = new SharedBuilder_ScreenProps13027081[typingsSlinky.reactNativeScreens.mod.Screen](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Screen.type): SharedBuilder_ScreenProps13027081[typingsSlinky.reactNativeScreens.mod.Screen] = new SharedBuilder_ScreenProps13027081[typingsSlinky.reactNativeScreens.mod.Screen](js.Array(this.component, js.Dictionary.empty))()
}
