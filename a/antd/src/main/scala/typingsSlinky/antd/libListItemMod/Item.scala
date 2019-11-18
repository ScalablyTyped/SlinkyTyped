package typingsSlinky.antd.libListItemMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item
  extends Component[ListItemProps, js.Any, js.Any] {
  def isFlexMode(): Boolean = js.native
  def isItemContainsTextNode(): js.UndefOr[scala.Nothing] = js.native
  def renderItem(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
}

