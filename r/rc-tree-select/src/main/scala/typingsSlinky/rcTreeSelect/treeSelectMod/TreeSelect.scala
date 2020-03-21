package typingsSlinky.rcTreeSelect.treeSelectMod

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSelect[ValueType]
  extends Component[TreeSelectProps[ValueType], js.Object, js.Any] {
  var selectRef: ReactRef[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefSelectProps */ _
  ] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

