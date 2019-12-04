package typingsSlinky.antd.libDateDashPickerRangePickerMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.libDateDashPickerInterfaceMod.RangePickerPresetRange
import typingsSlinky.antd.libDateDashPickerInterfaceMod.RangePickerProps
import typingsSlinky.antd.libDateDashPickerInterfaceMod.RangePickerValue
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangePicker
  extends Component[RangePickerProps, RangePickerState, js.Any] {
  var picker: js.Any = js.native
  var prefixCls: js.UndefOr[js.Any] = js.native
  var tagPrefixCls: js.UndefOr[js.Any] = js.native
  def blur(): Unit = js.native
  def clearHoverValue(): Unit = js.native
  def clearSelection(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MRangePicker(`_`: js.Any, prevState: RangePickerState): Unit = js.native
  def focus(): Unit = js.native
  def handleCalendarInputSelect(value: RangePickerValue): Unit = js.native
  def handleChange(value: RangePickerValue): Unit = js.native
  def handleHoverChange(hoverValue: js.Any): Unit = js.native
  def handleOpenChange(open: Boolean): Unit = js.native
  def handleRangeClick(value: RangePickerPresetRange): Unit = js.native
  def handleRangeMouseLeave(): Unit = js.native
  def handleShowDateChange(showDate: RangePickerValue): Unit = js.native
  def renderFooter(): (js.Array[Element | Null]) | Null = js.native
  def renderRangePicker(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def savePicker(node: HTMLSpanElement): Unit = js.native
  def setValue(value: RangePickerValue): Unit = js.native
  def setValue(value: RangePickerValue, hidePanel: Boolean): Unit = js.native
}

