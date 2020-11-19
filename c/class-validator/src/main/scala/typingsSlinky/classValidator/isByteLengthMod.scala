package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsByteLength", JSImport.Namespace)
@js.native
object isByteLengthMod extends js.Object {
  
  val IS_BYTE_LENGTH: /* "isByteLength" */ String = js.native
  
  @JSName("IsByteLength")
  def IsByteLength_(min: Double): PropertyDecorator = js.native
  @JSName("IsByteLength")
  def IsByteLength_(min: Double, max: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsByteLength")
  def IsByteLength_(min: Double, max: Double): PropertyDecorator = js.native
  @JSName("IsByteLength")
  def IsByteLength_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isByteLength(value: js.Any, min: Double): Boolean = js.native
  def isByteLength(value: js.Any, min: Double, max: Double): Boolean = js.native
}
