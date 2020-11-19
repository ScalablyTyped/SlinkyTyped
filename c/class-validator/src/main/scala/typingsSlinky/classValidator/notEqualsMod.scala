package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/common/NotEquals", JSImport.Namespace)
@js.native
object notEqualsMod extends js.Object {
  
  val NOT_EQUALS: /* "notEquals" */ String = js.native
  
  @JSName("NotEquals")
  def NotEquals_(comparison: js.Any): PropertyDecorator = js.native
  @JSName("NotEquals")
  def NotEquals_(comparison: js.Any, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def notEquals(value: js.Any, comparison: js.Any): Boolean = js.native
}
