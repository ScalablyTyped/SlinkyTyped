package typingsSlinky.angularForms.mod

import typingsSlinky.angularCore.mod.OnChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "MinLengthValidator")
@js.native
class MinLengthValidator ()
  extends Validator
     with OnChanges {
  
  var _createValidator: js.Any = js.native
  
  var _onChange: js.Any = js.native
  
  var _validator: js.Any = js.native
  
  /**
    * @description
    * Tracks changes to the the minimum length bound to this directive.
    */
  var minlength: String | Double = js.native
  
  /**
    * Registers a callback function to call when the validator inputs change.
    * @nodoc
    */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MMinLengthValidator(fn: js.Function0[Unit]): Unit = js.native
}
