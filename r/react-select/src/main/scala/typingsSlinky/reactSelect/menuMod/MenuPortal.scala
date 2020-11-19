package typingsSlinky.reactSelect.menuMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactSelect.anon.GetPortalPlacement
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/components/Menu", "MenuPortal")
@js.native
class MenuPortal[OptionType /* <: OptionTypeBase */] ()
  extends Component[MenuPortalProps[OptionType], MenuPortalState, js.Any] {
  
  def getChildContext(): GetPortalPlacement = js.native
  
  // callback for occassions where the menu must "flip"
  def getPortalPlacement(state: MenuState): Unit = js.native
}
/* static members */
@JSImport("react-select/src/components/Menu", "MenuPortal")
@js.native
object MenuPortal extends js.Object {
  
  var childContextTypes: GetPortalPlacement = js.native
}
