package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/common/Equals", JSImport.Namespace)
@js.native
object equalsMod extends js.Object {
  
  val EQUALS: /* "equals" */ String = js.native
  
  @JSName("Equals")
  def Equals_(comparison: js.Any): PropertyDecorator = js.native
  @JSName("Equals")
  def Equals_(comparison: js.Any, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def equals(value: js.Any, comparison: js.Any): Boolean = js.native
}
