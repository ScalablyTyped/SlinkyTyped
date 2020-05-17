package typingsSlinky.expressValidator.schemaMod

import typingsSlinky.expressValidator.anon.ErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressValidator.expressValidatorBooleans.`true`
  - typingsSlinky.expressValidator.anon.ErrorMessage[K]
*/
trait ValidatorSchemaOptions[K /* <: /* keyof express-validator.express-validator/src/chain/validators.Validators<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 70 */ js.Any */] extends js.Object

object ValidatorSchemaOptions {
  @scala.inline
  def `true`[K]: typingsSlinky.expressValidator.expressValidatorBooleans.`true` = true.asInstanceOf[typingsSlinky.expressValidator.expressValidatorBooleans.`true`]
  @scala.inline
  implicit def apply[K](value: ErrorMessage[K]): ValidatorSchemaOptions[K] = value.asInstanceOf[ValidatorSchemaOptions[K]]
}

