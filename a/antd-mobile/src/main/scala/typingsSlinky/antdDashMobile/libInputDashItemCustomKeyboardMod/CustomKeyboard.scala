package typingsSlinky.antdDashMobile.libInputDashItemCustomKeyboardMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTableDataCellElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antdDashMobile.Anon_Arialabel
import typingsSlinky.antdDashMobile.Anon_ArialabelIconOnly
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomKeyboard
  extends Component[js.Any, js.Any, js.Any] {
  var antmKeyboard: HTMLDivElement | Null = js.native
  var confirmDisabled: Boolean = js.native
  var confirmKeyboardItem: HTMLTableDataCellElement | Null = js.native
  var linkedInput: js.Any = js.native
  def getAriaAttr(label: String): Anon_Arialabel | Anon_ArialabelIconOnly = js.native
  def onKeyboardClick(e: SyntheticMouseEvent[HTMLTableDataCellElement]): js.UndefOr[Null] = js.native
  def onKeyboardClick(e: SyntheticMouseEvent[HTMLTableDataCellElement], value: String): js.UndefOr[Null] = js.native
  def renderKeyboardItem(item: String, index: Double): Element = js.native
}

