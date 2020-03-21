package typingsSlinky.antd.listItemMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item
  extends Component[ListItemProps, js.Any, js.Any] {
  def isFlexMode(): Boolean = js.native
  def isItemContainsTextNodeAndNotSingular(): js.UndefOr[scala.Nothing] = js.native
  def renderItem(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
}

