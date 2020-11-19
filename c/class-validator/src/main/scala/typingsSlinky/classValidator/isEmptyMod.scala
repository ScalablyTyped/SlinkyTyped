package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/common/IsEmpty", JSImport.Namespace)
@js.native
object isEmptyMod extends js.Object {
  
  val IS_EMPTY: /* "isEmpty" */ String = js.native
  
  @JSName("IsEmpty")
  def IsEmpty_(): PropertyDecorator = js.native
  @JSName("IsEmpty")
  def IsEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isEmpty(value: js.Any): Boolean = js.native
}
