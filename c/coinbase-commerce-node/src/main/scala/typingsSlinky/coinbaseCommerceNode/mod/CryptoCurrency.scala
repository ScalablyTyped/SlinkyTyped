package typingsSlinky.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Crypto currency.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BTC
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ETH
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BCH
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.LTC
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USDC
*/
trait CryptoCurrency extends js.Object

object CryptoCurrency {
  @scala.inline
  def BCH: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BCH = this.cast("BCH")
  @scala.inline
  def BTC: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.BTC = this.cast("BTC")
  @scala.inline
  def ETH: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ETH = this.cast("ETH")
  @scala.inline
  def LTC: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.LTC = this.cast("LTC")
  @scala.inline
  def USDC: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USDC = this.cast("USDC")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

