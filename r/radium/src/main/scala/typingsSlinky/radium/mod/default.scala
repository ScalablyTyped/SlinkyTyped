package typingsSlinky.radium.mod

import typingsSlinky.radium.mod.Radium.RadiumConfig
import typingsSlinky.radium.mod.Radium.RadiumTestMode
import typingsSlinky.radium.mod.Radium.StyleProps
import typingsSlinky.radium.mod.Radium.StyleRootProps
import typingsSlinky.radium.mod.Radium.StyleRules
import typingsSlinky.radium.radiumStrings.Colonactive
import typingsSlinky.radium.radiumStrings.Colonfocus
import typingsSlinky.radium.radiumStrings.Colonhover
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("radium", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(config: RadiumConfig): js.Function1[/* component */ js.UndefOr[js.Any], _] = js.native
  // @Radium decorator
  def apply[TElement /* <: js.Function */](component: TElement): TElement = js.native
  
  var TestMode: RadiumTestMode = js.native
  
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: String, value: Colonactive): Boolean = js.native
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: Unit, value: Colonactive): Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: String, value: Colonfocus): Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: Unit, value: Colonfocus): Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: String, value: Colonhover): Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: Unit, value: Colonhover): Boolean = js.native
  
  def keyframes(keyframes: StyleRules): js.Object = js.native
  def keyframes(keyframes: StyleRules, name: String): js.Object = js.native
  
  @js.native
  class Style ()
    extends Component[StyleProps, js.Object, js.Any]
  
  @js.native
  class StyleRoot ()
    extends Component[StyleRootProps, js.Object, js.Any]
}
