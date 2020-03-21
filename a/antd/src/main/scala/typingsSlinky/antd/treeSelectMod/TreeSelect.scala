package typingsSlinky.antd.treeSelectMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSelect[T]
  extends Component[TreeSelectProps[T], js.Object, js.Any] {
  var selectRef: ReactRef[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelect<imported_interface.DefaultValueType> */ _
  ] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderTreeSelect(hasGetPopupContainerGetPrefixClsRenderEmptyDirection: ConfigConsumerProps): ReactElement = js.native
}

