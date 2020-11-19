package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.validator.mod.validator.IsISSNOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsISSN", JSImport.Namespace)
@js.native
object isISSNMod extends js.Object {
  
  val IS_ISSN: /* "isISSN" */ String = js.native
  
  @JSName("IsISSN")
  def IsISSN_(): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(options: IsISSNOptions): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(options: IsISSNOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isISSN(value: js.Any): Boolean = js.native
  def isISSN(value: js.Any, options: IsISSNOptions): Boolean = js.native
}
