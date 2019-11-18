package typingsSlinky.antd.esTreeTreeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tree
  extends Component[TreeProps, js.Any, js.Any] {
  var tree: js.Any = js.native
  def renderSwitcherIcon(
    prefixCls: String,
    switcherIcon: js.UndefOr[scala.Nothing],
    hasIsLeafExpandedLoading: AntTreeNodeProps
  ): ReactElement | Null = js.native
  def renderSwitcherIcon(
    prefixCls: String,
    switcherIcon: typingsSlinky.react.reactMod.ReactElement,
    hasIsLeafExpandedLoading: AntTreeNodeProps
  ): ReactElement | Null = js.native
  def renderTree(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def setTreeRef(node: js.Any): Unit = js.native
}

