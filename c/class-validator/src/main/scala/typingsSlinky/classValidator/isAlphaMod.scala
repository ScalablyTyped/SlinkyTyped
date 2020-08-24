package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.validator.mod.validator.AlphaLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsAlpha", JSImport.Namespace)
@js.native
object isAlphaMod extends js.Object {
  val IS_ALPHA: /* "isAlpha" */ String = js.native
  @JSName("IsAlpha")
  def IsAlpha_(): PropertyDecorator = js.native
  @JSName("IsAlpha")
  def IsAlpha_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsAlpha")
  def IsAlpha_(locale: String): PropertyDecorator = js.native
  @JSName("IsAlpha")
  def IsAlpha_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isAlpha(value: js.Any): Boolean = js.native
  def isAlpha(value: js.Any, locale: AlphaLocale): Boolean = js.native
}

