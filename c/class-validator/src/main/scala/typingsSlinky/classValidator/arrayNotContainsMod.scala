package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/array/ArrayNotContains", JSImport.Namespace)
@js.native
object arrayNotContainsMod extends js.Object {
  val ARRAY_NOT_CONTAINS: /* "arrayNotContains" */ String = js.native
  @JSName("ArrayNotContains")
  def ArrayNotContains_(values: js.Array[_]): PropertyDecorator = js.native
  @JSName("ArrayNotContains")
  def ArrayNotContains_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  def arrayNotContains(array: js.Any, values: js.Array[_]): Boolean = js.native
}

