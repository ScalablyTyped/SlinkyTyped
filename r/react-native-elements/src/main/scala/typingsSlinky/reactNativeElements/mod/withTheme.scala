package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.replaceTheme
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.theme
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.updateTheme
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "withTheme")
@js.native
object withTheme extends js.Object {
  
  def apply[P, T](component: ReactComponentClass[P with ThemeProps[T]]): ReactComponentClass[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ]
  ] = js.native
  def apply[P, T](component: ReactComponentClass[P with ThemeProps[T]], themeKey: String): ReactComponentClass[
    Omit[
      P, 
      /* keyof react-native-elements.react-native-elements.ThemeProps<T> */ theme | updateTheme | replaceTheme
    ]
  ] = js.native
}
