package typingsSlinky.antd.libSelectMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[T]
  extends Component[SelectProps[T], js.Object, js.Any] {
  var rcSelect: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getNotFoundContent(renderEmpty: RenderEmptyHandler): js.UndefOr[js.Object | Null] = js.native
  def isCombobox(): Boolean = js.native
  def renderSelect(hasGetPopupContainerGetPrefixClsRenderEmpty: ConfigConsumerProps): ReactElement = js.native
  def renderSuffixIcon(prefixCls: String): js.Object = js.native
  def saveSelect(node: js.Any): Unit = js.native
}

