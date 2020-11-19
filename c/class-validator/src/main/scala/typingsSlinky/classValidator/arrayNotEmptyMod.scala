package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/array/ArrayNotEmpty", JSImport.Namespace)
@js.native
object arrayNotEmptyMod extends js.Object {
  
  val ARRAY_NOT_EMPTY: /* "arrayNotEmpty" */ String = js.native
  
  @JSName("ArrayNotEmpty")
  def ArrayNotEmpty_(): PropertyDecorator = js.native
  @JSName("ArrayNotEmpty")
  def ArrayNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def arrayNotEmpty(array: js.Any): Boolean = js.native
}
