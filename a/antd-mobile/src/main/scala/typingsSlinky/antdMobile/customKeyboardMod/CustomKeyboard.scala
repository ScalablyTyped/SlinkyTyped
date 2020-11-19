package typingsSlinky.antdMobile.customKeyboardMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antdMobile.anon.Arialabel
import typingsSlinky.antdMobile.anon.IconOnly
import typingsSlinky.react.mod.Component
import typingsSlinky.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomKeyboard
  extends Component[js.Any, js.Any, js.Any] {
  
  var antmKeyboard: HTMLDivElement | Null = js.native
  
  var confirmDisabled: Boolean = js.native
  
  var confirmKeyboardItem: HTMLTableDataCellElement | Null = js.native
  
  def getAriaAttr(label: String): Arialabel | IconOnly = js.native
  
  var linkedInput: js.Any = js.native
  
  def onKeyboardClick(e: SyntheticMouseEvent[HTMLTableDataCellElement]): js.UndefOr[Null] = js.native
  def onKeyboardClick(e: SyntheticMouseEvent[HTMLTableDataCellElement], value: String): js.UndefOr[Null] = js.native
  
  def renderKeyboardItem(item: String, index: Double): ReactElement = js.native
}
