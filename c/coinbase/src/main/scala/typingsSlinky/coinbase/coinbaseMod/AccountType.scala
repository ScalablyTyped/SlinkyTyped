package typingsSlinky.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.coinbase.coinbaseStrings.wallet
  - typings.coinbase.coinbaseStrings.fiat
  - typings.coinbase.coinbaseStrings.multisig
  - typings.coinbase.coinbaseStrings.vault
  - typings.coinbase.coinbaseStrings.multisig_vault
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

