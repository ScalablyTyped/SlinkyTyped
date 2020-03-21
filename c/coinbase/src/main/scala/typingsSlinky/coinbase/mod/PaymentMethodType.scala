package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbase.coinbaseStrings.ach_bank_account
  - typingsSlinky.coinbase.coinbaseStrings.sepa_bank_account
  - typingsSlinky.coinbase.coinbaseStrings.ideal_bank_account
  - typingsSlinky.coinbase.coinbaseStrings.fiat_account
  - typingsSlinky.coinbase.coinbaseStrings.bank_wire
  - typingsSlinky.coinbase.coinbaseStrings.credit_card
  - typingsSlinky.coinbase.coinbaseStrings.secure3d_card
  - typingsSlinky.coinbase.coinbaseStrings.eft_bank_account
  - typingsSlinky.coinbase.coinbaseStrings.interac
*/
trait PaymentMethodType extends js.Object

object PaymentMethodType {
  @scala.inline
  def ach_bank_account: typingsSlinky.coinbase.coinbaseStrings.ach_bank_account = this.cast("ach_bank_account")
  @scala.inline
  def bank_wire: typingsSlinky.coinbase.coinbaseStrings.bank_wire = this.cast("bank_wire")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit_card: typingsSlinky.coinbase.coinbaseStrings.credit_card = this.cast("credit_card")
  @scala.inline
  def eft_bank_account: typingsSlinky.coinbase.coinbaseStrings.eft_bank_account = this.cast("eft_bank_account")
  @scala.inline
  def fiat_account: typingsSlinky.coinbase.coinbaseStrings.fiat_account = this.cast("fiat_account")
  @scala.inline
  def ideal_bank_account: typingsSlinky.coinbase.coinbaseStrings.ideal_bank_account = this.cast("ideal_bank_account")
  @scala.inline
  def interac: typingsSlinky.coinbase.coinbaseStrings.interac = this.cast("interac")
  @scala.inline
  def secure3d_card: typingsSlinky.coinbase.coinbaseStrings.secure3d_card = this.cast("secure3d_card")
  @scala.inline
  def sepa_bank_account: typingsSlinky.coinbase.coinbaseStrings.sepa_bank_account = this.cast("sepa_bank_account")
}

