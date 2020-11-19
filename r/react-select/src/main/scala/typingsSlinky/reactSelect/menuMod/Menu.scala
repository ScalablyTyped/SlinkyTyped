package typingsSlinky.reactSelect.menuMod

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.anon.GetPortalPlacement
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/components/Menu", "Menu")
@js.native
class Menu[OptionType /* <: OptionTypeBase */] ()
  extends Component[MenuProps[OptionType], MenuState, js.Any] {
  
  def getPlacement(ref: Ref[_]): Unit = js.native
  
  def getState(): MenuProps[OptionType] with MenuState = js.native
}
/* static members */
@JSImport("react-select/src/components/Menu", "Menu")
@js.native
object Menu extends js.Object {
  
  var contextTypes: GetPortalPlacement = js.native
}
