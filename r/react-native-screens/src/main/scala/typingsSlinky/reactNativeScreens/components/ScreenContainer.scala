package typingsSlinky.reactNativeScreens.components

import typingsSlinky.reactNativeScreens.mod.ScreenContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScreenContainer {
  
  @JSImport("react-native-screens", "ScreenContainer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ScreenContainerProps): SharedBuilder_ScreenContainerProps_1633865115[typingsSlinky.reactNativeScreens.mod.ScreenContainer] = new SharedBuilder_ScreenContainerProps_1633865115[typingsSlinky.reactNativeScreens.mod.ScreenContainer](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ScreenContainer.type): SharedBuilder_ScreenContainerProps_1633865115[typingsSlinky.reactNativeScreens.mod.ScreenContainer] = new SharedBuilder_ScreenContainerProps_1633865115[typingsSlinky.reactNativeScreens.mod.ScreenContainer](js.Array(this.component, js.Dictionary.empty))()
}
