package typingsSlinky.antd.libCalendarHeaderMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.Anon_MonthReactNode
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.libRadioInterfaceMod.RadioChangeEvent
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header
  extends Component[HeaderProps, js.Any, js.Any] {
  var calenderHeaderNode: js.Any = js.native
  def getCalenderHeaderNode(node: HTMLDivElement): Unit = js.native
  def getMonthSelectElement(prefixCls: String, month: Double, months: js.Array[Double]): ReactElement = js.native
  def getMonthYearSelections(
    getPrefixCls: js.Function2[/* suffixCls */ String, /* customizePrefixCls */ js.UndefOr[String], String]
  ): Anon_MonthReactNode = js.native
  def getTypeSwitch(): ReactElement = js.native
  def getYearSelectElement(prefixCls: String, year: Double): ReactElement = js.native
  def headerRenderCustom(headerRender: HeaderRender): TagMod[Any] = js.native
  def onInternalTypeChange(e: RadioChangeEvent): Unit = js.native
  def onMonthChange(month: String): Unit = js.native
  def onTypeChange(`type`: String): Unit = js.native
  def onYearChange(year: String): Unit = js.native
  def renderHeader(hasGetPrefixCls: ConfigConsumerProps): js.UndefOr[js.Object | Null] = js.native
}

