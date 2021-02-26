package typingsSlinky.baseui.inputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/input", "Input")
@js.native
class Input protected ()
  extends Component[InputProps, InternalState, js.Any] {
  def this(props: InputProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: InputProps, context: js.Any) = this()
  
  def onBlur(e: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
  
  def onFocus(e: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
}
