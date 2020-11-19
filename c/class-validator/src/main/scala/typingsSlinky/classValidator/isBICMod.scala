package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsBIC", JSImport.Namespace)
@js.native
object isBICMod extends js.Object {
  
  val IS_BIC: /* "isBIC" */ String = js.native
  
  @JSName("IsBIC")
  def IsBIC_(): PropertyDecorator = js.native
  @JSName("IsBIC")
  def IsBIC_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isBIC(value: js.Any): Boolean = js.native
}
