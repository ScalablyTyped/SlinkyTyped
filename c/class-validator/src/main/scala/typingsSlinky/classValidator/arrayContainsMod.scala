package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/array/ArrayContains", JSImport.Namespace)
@js.native
object arrayContainsMod extends js.Object {
  
  val ARRAY_CONTAINS: /* "arrayContains" */ String = js.native
  
  @JSName("ArrayContains")
  def ArrayContains_(values: js.Array[_]): PropertyDecorator = js.native
  @JSName("ArrayContains")
  def ArrayContains_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def arrayContains(array: js.Any, values: js.Array[_]): Boolean = js.native
}
