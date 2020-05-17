package typingsSlinky.baseui.paymentCardMod

import typingsSlinky.cardValidator.anon.MinLength
import typingsSlinky.cardValidator.anon.Month
import typingsSlinky.cardValidator.mod.validExpirationDate
import typingsSlinky.cardValidator.mod.validExpirationMonth
import typingsSlinky.cardValidator.mod.validExpirationYear
import typingsSlinky.cardValidator.mod.validNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/payment-card", "valid")
@js.native
object valid extends js.Object {
  def cvv(value: String): typingsSlinky.cardValidator.mod.valid = js.native
  def cvv(value: String, maxLength: Double): typingsSlinky.cardValidator.mod.valid = js.native
  def expirationDate(value: String): validExpirationDate = js.native
  def expirationDate(value: Month): validExpirationDate = js.native
  def expirationMonth(value: String): validExpirationMonth = js.native
  def expirationYear(value: String): validExpirationYear = js.native
  def number(value: String): validNumber = js.native
  def postalCode(value: String): typingsSlinky.cardValidator.mod.valid = js.native
  def postalCode(value: String, options: MinLength): typingsSlinky.cardValidator.mod.valid = js.native
}

