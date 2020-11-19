package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.validator.mod.validator.IdentityCardLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsIdentityCard", JSImport.Namespace)
@js.native
object isIdentityCardMod extends js.Object {
  
  val IS_IDENTITY_CARD: /* "isIdentityCard" */ String = js.native
  
  @JSName("IsIdentityCard")
  def IsIdentityCard_(): PropertyDecorator = js.native
  @JSName("IsIdentityCard")
  def IsIdentityCard_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsIdentityCard")
  def IsIdentityCard_(locale: IdentityCardLocale): PropertyDecorator = js.native
  @JSName("IsIdentityCard")
  def IsIdentityCard_(locale: IdentityCardLocale, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isIdentityCard(value: js.Any, locale: IdentityCardLocale): Boolean = js.native
}
