package typingsSlinky.baseui.selectMod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import typingsSlinky.baseui.AnonClearable
import typingsSlinky.baseui.AnonItemOption
import typingsSlinky.baseui.AnonOptionOption
import typingsSlinky.baseui.AnonOptionState
import typingsSlinky.dateFns.Locale
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Event_
import typingsSlinky.std.KeyboardEvent
import typingsSlinky.std.MouseEvent
import typingsSlinky.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/select", "Select")
@js.native
class Select ()
  extends Component[SelectProps, SelectState, js.Any] {
  def addValue(item: Option): Unit = js.native
  def clearValue(event: KeyboardEvent): Unit = js.native
  def clearValue(event: MouseEvent): Unit = js.native
  def clearValue(event: TouchEvent): Unit = js.native
  def closeMenu(): Unit = js.native
  def filterOption(): Value = js.native
  def filterOption(excludeOptions: Value): Value = js.native
  def focus(): Unit = js.native
  def getOptionLabel(locale: Locale, hasOption: AnonOptionState): TagMod[Any] = js.native
  def getSharedProps(): AnonClearable = js.native
  def getValueArray(value: Value): js.Array[Option] = js.native
  def getValueLabel(hasOption: AnonOptionOption): TagMod[Any] = js.native
  def handleBlur(event: Event_): Unit = js.native
  def handleClick(event: MouseEvent): Unit = js.native
  def handleClick(event: TouchEvent): Unit = js.native
  def handleClickOutside(event: org.scalajs.dom.raw.MouseEvent): Unit = js.native
  def handleInputChange(event: SyntheticEvent[EventTarget with HTMLInputElement, Event_]): Unit = js.native
  def handleInputFocus(event: SyntheticFocusEvent[HTMLElement]): Unit = js.native
  def handleKeyDown(event: org.scalajs.dom.raw.KeyboardEvent): Unit = js.native
  def handleTouchEnd(event: org.scalajs.dom.raw.TouchEvent): Unit = js.native
  def handleTouchEndClearValue(event: org.scalajs.dom.raw.TouchEvent): Unit = js.native
  def handleTouchMove(): Unit = js.native
  def handleTouchOutside(event: org.scalajs.dom.raw.TouchEvent): Unit = js.native
  def handleTouchStart(): Unit = js.native
  def popValue(): Unit = js.native
  def removeValue(item: Option): Unit = js.native
  def renderArrow(): TagMod[Any] = js.native
  def renderClear(): TagMod[Any] = js.native
  def renderInput(): TagMod[Any] = js.native
  def renderLoading(): TagMod[Any] = js.native
  def renderSearch(): TagMod[Any] = js.native
  def renderValue(valueArray: Value, isOpen: Boolean, locale: Locale): TagMod[Any] = js.native
  def selectValue(hasItem: AnonItemOption): Unit = js.native
  def setValue(value: Value, option: Option, `type`: ChangeAction): Unit = js.native
}

