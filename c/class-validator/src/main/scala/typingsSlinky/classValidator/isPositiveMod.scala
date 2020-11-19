package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/number/IsPositive", JSImport.Namespace)
@js.native
object isPositiveMod extends js.Object {
  
  val IS_POSITIVE: /* "isPositive" */ String = js.native
  
  @JSName("IsPositive")
  def IsPositive_(): PropertyDecorator = js.native
  @JSName("IsPositive")
  def IsPositive_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isPositive(value: js.Any): Boolean = js.native
}
