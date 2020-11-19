package typingsSlinky.classValidator

import typingsSlinky.classValidator.anon.Async
import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/common/Validate", JSImport.Namespace)
@js.native
object validateMod extends js.Object {
  
  def Validate(constraintClass: js.Function): PropertyDecorator = js.native
  def Validate(
    constraintClass: js.Function,
    constraints: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  def Validate(constraintClass: js.Function, constraints: js.Array[_]): PropertyDecorator = js.native
  def Validate(constraintClass: js.Function, constraints: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  def Validate(constraintClass: js.Function, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def ValidatorConstraint(): js.Function1[/* target */ js.Function, Unit] = js.native
  def ValidatorConstraint(options: Async): js.Function1[/* target */ js.Function, Unit] = js.native
}
