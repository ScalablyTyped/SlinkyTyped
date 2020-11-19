package typingsSlinky.reduxForm.fieldMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericField[P]
  extends Component[BaseFieldProps[P] with P, js.Object, js.Any] {
  
  var dirty: Boolean = js.native
  
  def getRenderedComponent(): ReactComponentClass[WrappedFieldProps with P] = js.native
  
  var name: String = js.native
  
  var pristine: Boolean = js.native
  
  var value: js.Any = js.native
}
