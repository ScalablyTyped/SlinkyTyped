package typingsSlinky.antd.esPopoverMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popover
  extends Component[PopoverProps, js.Object, js.Any] {
  var tooltip: js.Any = js.native
  def getOverlay(prefixCls: String): ReactElement = js.native
  def getPopupDomNode(): js.Any = js.native
  def renderPopover(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def saveTooltip(node: js.Any): Unit = js.native
}

