package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/array/ArrayUnique", JSImport.Namespace)
@js.native
object arrayUniqueMod extends js.Object {
  
  val ARRAY_UNIQUE: /* "arrayUnique" */ String = js.native
  
  @JSName("ArrayUnique")
  def ArrayUnique_(): PropertyDecorator = js.native
  @JSName("ArrayUnique")
  def ArrayUnique_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def arrayUnique(array: js.Any): Boolean = js.native
}
