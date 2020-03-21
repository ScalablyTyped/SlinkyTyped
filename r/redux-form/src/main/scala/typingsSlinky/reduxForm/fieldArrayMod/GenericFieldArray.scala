package typingsSlinky.reduxForm.fieldArrayMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericFieldArray[FieldValue, P]
  extends Component[BaseFieldArrayProps[P, FieldValue], js.Object, js.Any] {
  var name: String = js.native
  var valid: Boolean = js.native
  def getRenderedComponent(): ReactComponentClass[WrappedFieldArrayProps[FieldValue] with P] = js.native
}

