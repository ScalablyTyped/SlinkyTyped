package typingsSlinky.antd.selectMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.antd.antdStrings.SECRET_COMBOBOX_MODE_DO_NOT_USE
import typingsSlinky.antd.antdStrings.combobox
import typingsSlinky.antd.antdStrings.multiple
import typingsSlinky.antd.antdStrings.tags
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[ValueType /* <: SelectValue */]
  extends Component[SelectProps[ValueType], js.Object, js.Any] {
  var selectRef: ReactRef[typingsSlinky.rcSelect.mod.default] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getMode(): js.UndefOr[multiple | tags | SECRET_COMBOBOX_MODE_DO_NOT_USE | combobox] = js.native
  def renderSelect(
    hasGetPopupContainerGetPrefixClsRenderEmptyDirectionVirtualDropdownMatchSelectWidth: ConfigConsumerProps
  ): ReactElement = js.native
}

