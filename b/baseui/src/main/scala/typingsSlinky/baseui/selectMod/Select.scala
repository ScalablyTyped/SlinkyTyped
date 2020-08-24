package typingsSlinky.baseui.selectMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.baseui.anon.Clearable
import typingsSlinky.baseui.anon.ItemOption
import typingsSlinky.baseui.anon.OptionOption
import typingsSlinky.baseui.anon.OptionState
import typingsSlinky.dateFns.Locale
import typingsSlinky.react.mod.Component
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
  def getOptionLabel(locale: Locale, hasOption: OptionState): ReactElement = js.native
  def getSharedProps(): Clearable = js.native
  def getValueArray(value: Value): js.Array[Option] = js.native
  def getValueLabel(hasOption: OptionOption): ReactElement = js.native
  def handleBlur(event: Event): Unit = js.native
  def handleClick(event: MouseEvent): Unit = js.native
  def handleClick(event: TouchEvent): Unit = js.native
  def handleClickOutside(event: MouseEvent): Unit = js.native
  def handleInputChange(event: SyntheticEvent[EventTarget with HTMLInputElement, Event]): Unit = js.native
  def handleInputFocus(event: SyntheticFocusEvent[HTMLElement]): Unit = js.native
  def handleKeyDown(event: KeyboardEvent): Unit = js.native
  def handleTouchEnd(event: TouchEvent): Unit = js.native
  def handleTouchEndClearValue(event: TouchEvent): Unit = js.native
  def handleTouchMove(): Unit = js.native
  def handleTouchOutside(event: TouchEvent): Unit = js.native
  def handleTouchStart(): Unit = js.native
  def popValue(): Unit = js.native
  def removeValue(item: Option): Unit = js.native
  def renderArrow(): ReactElement = js.native
  def renderClear(): ReactElement = js.native
  def renderInput(): ReactElement = js.native
  def renderLoading(): ReactElement = js.native
  def renderSearch(): ReactElement = js.native
  def renderValue(valueArray: Value, isOpen: Boolean, locale: Locale): ReactElement = js.native
  def selectValue(hasItem: ItemOption): Unit = js.native
  def setValue(value: Value, option: Option, `type`: ChangeAction): Unit = js.native
}

