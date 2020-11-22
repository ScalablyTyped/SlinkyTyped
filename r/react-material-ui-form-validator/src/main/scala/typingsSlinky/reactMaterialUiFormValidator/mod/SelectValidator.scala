package typingsSlinky.reactMaterialUiFormValidator.mod

import typingsSlinky.materialUi.MaterialUI.SelectFieldProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-material-ui-form-validator", "SelectValidator")
@js.native
class SelectValidator ()
  extends Component[ValidatorComponentProps with SelectFieldProps, js.Object, js.Any] {
  
  def getErrorMessage(): String | Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  def makeInvalid(): Unit = js.native
  
  def makeValid(): Unit = js.native
  
  def validate(value: String): Unit = js.native
  def validate(value: String, includeRequired: js.UndefOr[scala.Nothing], dryRun: Boolean): Unit = js.native
  def validate(value: String, includeRequired: Boolean): Unit = js.native
  def validate(value: String, includeRequired: Boolean, dryRun: Boolean): Unit = js.native
}
