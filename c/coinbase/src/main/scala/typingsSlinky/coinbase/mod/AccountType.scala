package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbase.coinbaseStrings.wallet
  - typingsSlinky.coinbase.coinbaseStrings.fiat
  - typingsSlinky.coinbase.coinbaseStrings.multisig
  - typingsSlinky.coinbase.coinbaseStrings.vault
  - typingsSlinky.coinbase.coinbaseStrings.multisig_vault
*/
trait AccountType extends js.Object

object AccountType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fiat: typingsSlinky.coinbase.coinbaseStrings.fiat = this.cast("fiat")
  @scala.inline
  def multisig: typingsSlinky.coinbase.coinbaseStrings.multisig = this.cast("multisig")
  @scala.inline
  def multisig_vault: typingsSlinky.coinbase.coinbaseStrings.multisig_vault = this.cast("multisig_vault")
  @scala.inline
  def vault: typingsSlinky.coinbase.coinbaseStrings.vault = this.cast("vault")
  @scala.inline
  def wallet: typingsSlinky.coinbase.coinbaseStrings.wallet = this.cast("wallet")
}

