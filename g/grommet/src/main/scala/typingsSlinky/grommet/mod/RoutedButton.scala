package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.buttonMod.ButtonProps
import typingsSlinky.grommet.routedButtonMod.RoutedButtonProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "RoutedButton")
@js.native
class RoutedButton protected ()
  extends Component[RoutedButtonProps with ButtonProps, js.Object, js.Any] {
  def this(props: RoutedButtonProps with ButtonProps) = this()
  def this(props: RoutedButtonProps with ButtonProps, context: js.Any) = this()
}

@JSImport("grommet/es6", "RoutedButton")
@js.native
object RoutedButton extends TopLevel[ReactComponentClass[RoutedButtonProps with ButtonProps]]

