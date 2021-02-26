package typingsSlinky.baseui.inputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/input", "BaseInput")
@js.native
class BaseInput protected ()
  extends Component[BaseInputProps[HTMLInputElement], InternalState, js.Any] {
  def this(props: BaseInputProps[HTMLInputElement]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: BaseInputProps[HTMLInputElement], context: js.Any) = this()
  
  def onBlur(e: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
  
  def onFocus(e: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
}
