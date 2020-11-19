package typingsSlinky.antdMobile.inputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input
  extends Component[InputProps, js.Any, js.Any] {
  
  def focus(): Unit = js.native
  
  var inputRef: HTMLInputElement | Null = js.native
  
  def onInputBlur(e: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
  
  def onInputFocus(e: SyntheticFocusEvent[HTMLInputElement]): Unit = js.native
}
