package typingsSlinky.antd.popconfirmMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
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
  def setVisible(visible: Boolean, e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
}

