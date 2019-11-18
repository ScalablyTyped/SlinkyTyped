package typingsSlinky.antd.esCascaderMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends Component[CascaderProps, CascaderState, js.Any] {
  var cachedOptions: js.Array[CascaderOptionType] = js.native
  var input: js.Any = js.native
  def blur(): Unit = js.native
  def clearSelection(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def focus(): Unit = js.native
  def generateFilteredOptions(prefixCls: js.UndefOr[scala.Nothing], renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
  def generateFilteredOptions(prefixCls: String, renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
  def getLabel(): js.Any = js.native
  def handleChange(value: js.Any, selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
  def handleInputBlur(): Unit = js.native
  def handleInputChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleInputClick(e: SyntheticMouseEvent[HTMLInputElement]): Unit = js.native
  def handleKeyDown(e: SyntheticKeyboardEvent[HTMLInputElement]): Unit = js.native
  def handlePopupVisibleChange(popupVisible: Boolean): Unit = js.native
  def renderCascader(hasGetPopupContainerGetPrefixClsRenderEmpty: ConfigConsumerProps, locale: CascaderLocale): ReactElement = js.native
  def saveInput(node: typingsSlinky.antd.esInputMod.default): Unit = js.native
  def setValue(value: js.Array[String]): Unit = js.native
  def setValue(value: js.Array[String], selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
}

