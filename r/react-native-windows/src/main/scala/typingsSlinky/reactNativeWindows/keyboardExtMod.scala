package typingsSlinky.reactNativeWindows

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactNativeWindows.anon.Children
import typingsSlinky.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/Libraries/Components/Keyboard/KeyboardExt", JSImport.Namespace)
@js.native
object keyboardExtMod extends js.Object {
  
  def supportKeyboard[P /* <: js.Object */](WrappedComponent: ReactComponentClass[P]): ForwardRefExoticComponent[(PropsWithoutRef[P with IKeyboardProps with Children]) with RefAttributes[_]] = js.native
}
