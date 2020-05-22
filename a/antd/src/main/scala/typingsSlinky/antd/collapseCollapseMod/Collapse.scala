package typingsSlinky.antd.collapseCollapseMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.transferMod.TransferDirection
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collapse
  extends Component[CollapseProps, js.Any, js.Any] {
  def getIconPosition(): TransferDirection = js.native
  def getIconPosition(direction: String): TransferDirection = js.native
  def renderCollapse(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def renderExpandIcon(panelProps: js.UndefOr[PanelProps], prefixCls: String): ReactElement = js.native
}

