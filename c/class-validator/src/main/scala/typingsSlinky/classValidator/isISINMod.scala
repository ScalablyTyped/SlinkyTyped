package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsISIN", JSImport.Namespace)
@js.native
object isISINMod extends js.Object {
  val IS_ISIN: /* "isIsin" */ String = js.native
  @JSName("IsISIN")
  def IsISIN_(): PropertyDecorator = js.native
  @JSName("IsISIN")
  def IsISIN_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isISIN(value: js.Any): Boolean = js.native
}

