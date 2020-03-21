package typingsSlinky.antd.dropdownDropdownMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.bottomCenter
import typingsSlinky.antd.antdStrings.bottomLeft
import typingsSlinky.antd.antdStrings.bottomRight
import typingsSlinky.antd.antdStrings.topCenter
import typingsSlinky.antd.antdStrings.topLeft
import typingsSlinky.antd.antdStrings.topRight
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdown
  extends Component[DropDownProps, js.Any, js.Any] {
  def getPlacement(): bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = js.native
  def getPlacement(direction: String): bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = js.native
  def getTransitionName(): String = js.native
  def renderDropDown(hasGetPopupContainerGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def renderOverlay(prefixCls: String): ReactElement = js.native
}

