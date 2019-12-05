package typingsSlinky.reactDashSelect.srcComponentsMenuMod

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashSelect.Anon_GetPortalPlacement
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Menu", "MenuPortal")
@js.native
class MenuPortal[OptionType /* <: OptionTypeBase */] ()
  extends Component[MenuPortalProps[OptionType], MenuPortalState, js.Any] {
  def getChildContext(): Anon_GetPortalPlacement = js.native
  // callback for occassions where the menu must "flip"
  def getPortalPlacement(state: MenuState): Unit = js.native
}

/* static members */
@JSImport("react-select/src/components/Menu", "MenuPortal")
@js.native
object MenuPortal extends js.Object {
  var childContextTypes: Anon_GetPortalPlacement = js.native
}

