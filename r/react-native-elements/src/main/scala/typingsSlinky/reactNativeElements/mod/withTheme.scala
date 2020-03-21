package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[P, T](component: ReactComponentClass[P with ThemeProps[T]]): ReactComponentClass[Omit[P, String]] = js.native
}

