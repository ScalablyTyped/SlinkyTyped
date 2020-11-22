package typingsSlinky.antd.cascaderMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.antd.renderEmptyMod.RenderEmptyHandler
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cascader
  extends Component[CascaderProps, CascaderState, js.Any] {
  
  def blur(): Unit = js.native
  
  var cachedOptions: js.Array[CascaderOptionType] = js.native
  
  def clearSelection(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  var clearSelectionTimeout: js.Any = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCascader(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def generateFilteredOptions(prefixCls: js.UndefOr[scala.Nothing], renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
  def generateFilteredOptions(prefixCls: String, renderEmpty: RenderEmptyHandler): js.Array[CascaderOptionType] = js.native
  
  def getLabel(): js.Any = js.native
  
  def getPopupPlacement(): String = js.native
  def getPopupPlacement(direction: DirectionType): String = js.native
  
  def handleChange(value: js.Any, selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
  
  def handleInputBlur(): Unit = js.native
  
  def handleInputChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleInputClick(e: SyntheticMouseEvent[HTMLInputElement]): Unit = js.native
  
  def handleKeyDown(e: SyntheticKeyboardEvent[HTMLInputElement]): Unit = js.native
  
  def handlePopupVisibleChange(popupVisible: Boolean): Unit = js.native
  
  var input: js.Any = js.native
  
  def renderCascader(hasGetPopupContainerGetPrefixClsRenderEmptyDirection: ConfigConsumerProps, locale: CascaderLocale): ReactElement = js.native
  
  def saveInput(node: typingsSlinky.antd.inputMod.default): Unit = js.native
  
  def setValue(value: CascaderValueType): Unit = js.native
  def setValue(value: CascaderValueType, selectedOptions: js.Array[CascaderOptionType]): Unit = js.native
}
