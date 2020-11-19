package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationArgumentsMod.ValidationArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/validation/ValidatorConstraintInterface", JSImport.Namespace)
@js.native
object validatorConstraintInterfaceMod extends js.Object {
  
  @js.native
  trait ValidatorConstraintInterface extends js.Object {
    
    /**
      * Gets default message when validation for this constraint fail.
      */
    var defaultMessage: js.UndefOr[js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String]] = js.native
    
    /**
      * Method to be called to perform custom validation over given value.
      */
    def validate(value: js.Any): js.Promise[Boolean] | Boolean = js.native
    def validate(value: js.Any, validationArguments: ValidationArguments): js.Promise[Boolean] | Boolean = js.native
  }
}
