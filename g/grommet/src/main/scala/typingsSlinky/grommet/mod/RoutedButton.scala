package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.buttonMod.ButtonProps
import typingsSlinky.grommet.routedButtonMod.RoutedButtonProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "RoutedButton")
@js.native
class RoutedButton protected ()
  extends Component[RoutedButtonProps with ButtonProps, ComponentState, js.Any] {
  def this(props: RoutedButtonProps with ButtonProps) = this()
  def this(props: RoutedButtonProps with ButtonProps, context: js.Any) = this()
}

@JSImport("grommet", "RoutedButton")
@js.native
object RoutedButton extends TopLevel[ComponentClass[RoutedButtonProps with ButtonProps, ComponentState]]

