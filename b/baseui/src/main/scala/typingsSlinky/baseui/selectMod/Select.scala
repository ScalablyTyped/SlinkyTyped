package typingsSlinky.baseui.selectMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import typingsSlinky.baseui.Anon_Clearable
import typingsSlinky.baseui.Anon_Item
import typingsSlinky.baseui.Anon_OptionOptionState
import typingsSlinky.baseui.Anon_Option_666053661
import typingsSlinky.dateDashFns.Locale
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.FormEvent
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
  def getOptionLabel(locale: Locale, hasOption: Anon_OptionOptionState): TagMod[Any] = js.native
  def getSharedProps(): Anon_Clearable = js.native
  def getValueArray(value: Value): js.Array[Option] = js.native
  def getValueLabel(hasOption: Anon_Option_666053661): TagMod[Any] = js.native
  def handleBlur(event: Event): Unit = js.native
  def handleClick(event: MouseEvent): Unit = js.native
  def handleClick(event: TouchEvent): Unit = js.native
  def handleClickOutside(event: org.scalajs.dom.raw.MouseEvent): Unit = js.native
  def handleInputChange(event: FormEvent[HTMLInputElement]): Unit = js.native
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
  def selectValue(hasItem: Anon_Item): Unit = js.native
  def setValue(value: Value, option: Option, `type`: ChangeAction): Unit = js.native
}

