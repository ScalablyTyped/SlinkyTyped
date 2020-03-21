package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbase.coinbaseStrings.account
  - typingsSlinky.coinbase.coinbaseStrings.transaction
  - typingsSlinky.coinbase.coinbaseStrings.address
  - typingsSlinky.coinbase.coinbaseStrings.user
  - typingsSlinky.coinbase.coinbaseStrings.buy
  - typingsSlinky.coinbase.coinbaseStrings.sell
  - typingsSlinky.coinbase.coinbaseStrings.deposit
  - typingsSlinky.coinbase.coinbaseStrings.withdrawal
  - typingsSlinky.coinbase.coinbaseStrings.payment_method
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  def account: typingsSlinky.coinbase.coinbaseStrings.account = this.cast("account")
  @scala.inline
  def address: typingsSlinky.coinbase.coinbaseStrings.address = this.cast("address")
  @scala.inline
  def buy: typingsSlinky.coinbase.coinbaseStrings.buy = this.cast("buy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deposit: typingsSlinky.coinbase.coinbaseStrings.deposit = this.cast("deposit")
  @scala.inline
  def payment_method: typingsSlinky.coinbase.coinbaseStrings.payment_method = this.cast("payment_method")
  @scala.inline
  def sell: typingsSlinky.coinbase.coinbaseStrings.sell = this.cast("sell")
  @scala.inline
  def transaction: typingsSlinky.coinbase.coinbaseStrings.transaction = this.cast("transaction")
  @scala.inline
  def user: typingsSlinky.coinbase.coinbaseStrings.user = this.cast("user")
  @scala.inline
  def withdrawal: typingsSlinky.coinbase.coinbaseStrings.withdrawal = this.cast("withdrawal")
}

