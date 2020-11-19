package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/Length", JSImport.Namespace)
@js.native
object lengthMod extends js.Object {
  
  val LENGTH: /* "length" */ String = js.native
  
  @JSName("Length")
  def Length_(min: Double): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double, max: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double, max: Double): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def length(value: js.Any, min: Double): Boolean = js.native
  def length(value: js.Any, min: Double, max: Double): Boolean = js.native
}
