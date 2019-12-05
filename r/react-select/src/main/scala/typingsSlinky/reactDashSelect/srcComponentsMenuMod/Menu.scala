package typingsSlinky.reactDashSelect.srcComponentsMenuMod

import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashSelect.Anon_GetPortalPlacement
import typingsSlinky.reactDashSelect.MenuPropsOptionTypeMenuState
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Menu", "Menu")
@js.native
class Menu[OptionType /* <: OptionTypeBase */] ()
  extends Component[MenuProps[OptionType], MenuState, js.Any] {
  def getPlacement(ref: Ref[_]): Unit = js.native
  def getState(): MenuPropsOptionTypeMenuState[OptionType] = js.native
}

/* static members */
@JSImport("react-select/src/components/Menu", "Menu")
@js.native
object Menu extends js.Object {
  var contextTypes: Anon_GetPortalPlacement = js.native
}

