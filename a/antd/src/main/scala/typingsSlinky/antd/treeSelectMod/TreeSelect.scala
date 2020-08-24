package typingsSlinky.antd.treeSelectMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.rcTreeSelect.interfaceMod.DefaultValueType
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSelect[T]
  extends Component[TreeSelectProps[T], js.Object, js.Any] {
  var selectRef: ReactRef[typingsSlinky.rcTreeSelect.mod.default[DefaultValueType]] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderTreeSelect(
    hasGetPopupContainerGetPrefixClsRenderEmptyDirectionVirtualDropdownMatchSelectWidth: ConfigConsumerProps
  ): ReactElement = js.native
}

