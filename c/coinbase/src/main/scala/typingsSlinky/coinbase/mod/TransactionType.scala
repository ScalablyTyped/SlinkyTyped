package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbase.coinbaseStrings.send
  - typingsSlinky.coinbase.coinbaseStrings.request
  - typingsSlinky.coinbase.coinbaseStrings.transfer
  - typingsSlinky.coinbase.coinbaseStrings.buy
  - typingsSlinky.coinbase.coinbaseStrings.sell
  - typingsSlinky.coinbase.coinbaseStrings.fiat_deposit
  - typingsSlinky.coinbase.coinbaseStrings.fiat_withdrawal
  - typingsSlinky.coinbase.coinbaseStrings.exchange_deposit
  - typingsSlinky.coinbase.coinbaseStrings.exchange_withdrawal
  - typingsSlinky.coinbase.coinbaseStrings.vault_withdrawal
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  def buy: typingsSlinky.coinbase.coinbaseStrings.buy = this.cast("buy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exchange_deposit: typingsSlinky.coinbase.coinbaseStrings.exchange_deposit = this.cast("exchange_deposit")
  @scala.inline
  def exchange_withdrawal: typingsSlinky.coinbase.coinbaseStrings.exchange_withdrawal = this.cast("exchange_withdrawal")
  @scala.inline
  def fiat_deposit: typingsSlinky.coinbase.coinbaseStrings.fiat_deposit = this.cast("fiat_deposit")
  @scala.inline
  def fiat_withdrawal: typingsSlinky.coinbase.coinbaseStrings.fiat_withdrawal = this.cast("fiat_withdrawal")
  @scala.inline
  def request: typingsSlinky.coinbase.coinbaseStrings.request = this.cast("request")
  @scala.inline
  def sell: typingsSlinky.coinbase.coinbaseStrings.sell = this.cast("sell")
  @scala.inline
  def send: typingsSlinky.coinbase.coinbaseStrings.send = this.cast("send")
  @scala.inline
  def transfer: typingsSlinky.coinbase.coinbaseStrings.transfer = this.cast("transfer")
  @scala.inline
  def vault_withdrawal: typingsSlinky.coinbase.coinbaseStrings.vault_withdrawal = this.cast("vault_withdrawal")
}

