package typingsSlinky.coinbaseCommerceNode.mod

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.usdc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full crypto currency name.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoin
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ethereum
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoincash
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.litecoin
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.usdc_
*/
trait CryptoName extends js.Object

object CryptoName {
  @scala.inline
  def bitcoin: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoin = this.cast("bitcoin")
  @scala.inline
  def bitcoincash: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.bitcoincash = this.cast("bitcoincash")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ethereum: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.ethereum = this.cast("ethereum")
  @scala.inline
  def litecoin: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.litecoin = this.cast("litecoin")
  @scala.inline
  def usdc: usdc_ = this.cast("usdc")
}

