package typingsSlinky.antd.libDropdownDropdownMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdown
  extends Component[DropDownProps, js.Any, js.Any] {
  def getTransitionName(): String = js.native
  def renderDropDown(hasGetPopupContainerGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def renderOverlay(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
}

