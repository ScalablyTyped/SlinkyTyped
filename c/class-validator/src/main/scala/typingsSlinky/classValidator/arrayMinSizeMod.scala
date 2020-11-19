package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/array/ArrayMinSize", JSImport.Namespace)
@js.native
object arrayMinSizeMod extends js.Object {
  
  val ARRAY_MIN_SIZE: /* "arrayMinSize" */ String = js.native
  
  @JSName("ArrayMinSize")
  def ArrayMinSize_(min: Double): PropertyDecorator = js.native
  @JSName("ArrayMinSize")
  def ArrayMinSize_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def arrayMinSize(array: js.Any, min: Double): Boolean = js.native
}
