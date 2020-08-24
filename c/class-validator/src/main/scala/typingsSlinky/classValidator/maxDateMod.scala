package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/date/MaxDate", JSImport.Namespace)
@js.native
object maxDateMod extends js.Object {
  val MAX_DATE: /* "maxDate" */ String = js.native
  @JSName("MaxDate")
  def MaxDate_(date: js.Date): PropertyDecorator = js.native
  @JSName("MaxDate")
  def MaxDate_(date: js.Date, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def maxDate(date: js.Any, maxDate: js.Date): Boolean = js.native
}

