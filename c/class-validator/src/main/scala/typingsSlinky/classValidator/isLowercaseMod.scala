package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsLowercase", JSImport.Namespace)
@js.native
object isLowercaseMod extends js.Object {
  
  val IS_LOWERCASE: /* "isLowercase" */ String = js.native
  
  @JSName("IsLowercase")
  def IsLowercase_(): PropertyDecorator = js.native
  @JSName("IsLowercase")
  def IsLowercase_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isLowercase(value: js.Any): Boolean = js.native
}
