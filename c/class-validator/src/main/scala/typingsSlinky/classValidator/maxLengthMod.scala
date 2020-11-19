package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/MaxLength", JSImport.Namespace)
@js.native
object maxLengthMod extends js.Object {
  
  val MAX_LENGTH: /* "maxLength" */ String = js.native
  
  @JSName("MaxLength")
  def MaxLength_(max: Double): PropertyDecorator = js.native
  @JSName("MaxLength")
  def MaxLength_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def maxLength(value: js.Any, max: Double): Boolean = js.native
}
