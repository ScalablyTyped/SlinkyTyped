package typingsSlinky.antd.libDateDashPickerWeekPickerMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeekPicker
  extends Component[js.Any, WeekPickerState, js.Any] {
  var input: js.Any = js.native
  var prefixCls: js.UndefOr[js.Any] = js.native
  def blur(): Unit = js.native
  def clearSelection(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MWeekPicker(_underscore: js.Any, prevState: WeekPickerState): Unit = js.native
  def focus(): Unit = js.native
  def handleChange(): Unit = js.native
  def handleChange(value: Moment): Unit = js.native
  def handleOpenChange(open: Boolean): Unit = js.native
  def renderFooter(args: js.Any*): Element | Null = js.native
  def renderWeekPicker(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveInput(node: js.Any): Unit = js.native
  def weekDateRender(current: js.Any): Element = js.native
}

