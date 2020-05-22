package typingsSlinky.coinbaseCommerceNode.anon

import typingsSlinky.coinbaseCommerceNode.mod.CryptoCurrency
import typingsSlinky.coinbaseCommerceNode.mod.FiatCurrency
import typingsSlinky.coinbaseCommerceNode.mod.Price
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crypto extends js.Object {
  var crypto: Price[CryptoCurrency]
  var local: Price[FiatCurrency]
}

object Crypto {
  @scala.inline
  def apply(crypto: Price[CryptoCurrency], local: Price[FiatCurrency]): Crypto = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crypto]
  }
}

