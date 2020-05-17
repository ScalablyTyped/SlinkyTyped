package typingsSlinky.antd.collapseCollapseMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collapse
  extends Component[CollapseProps, js.Any, js.Any] {
  def renderCollapse(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def renderExpandIcon(panelProps: js.UndefOr[PanelProps], prefixCls: String): js.UndefOr[js.Object | Null] = js.native
}

