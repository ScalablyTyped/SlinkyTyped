package typingsSlinky.reduxDashForm.libFieldMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericField[P]
  extends Component[BaseFieldProps[P] with P, js.Object, js.Any] {
  var dirty: Boolean = js.native
  var name: String = js.native
  var pristine: Boolean = js.native
  var value: js.Any = js.native
  def getRenderedComponent(): ReactComponentClass[WrappedFieldProps with P] = js.native
}

