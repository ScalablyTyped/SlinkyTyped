package typingsSlinky.antd.esPopconfirmMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.NativeMouseEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popconfirm
  extends Component[PopconfirmProps, PopconfirmState, js.Any] {
  var tooltip: js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def onCancel(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
  def onConfirm(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def renderConfirm(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def renderOverlay(prefixCls: String, popconfirmLocale: PopconfirmLocale): ReactElement = js.native
  def saveTooltip(node: js.Any): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setVisible(visible: Boolean, e: MouseEvent[typingsSlinky.std.HTMLButtonElement, NativeMouseEvent]): Unit = js.native
}

