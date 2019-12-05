package typingsSlinky.coinbaseDashCommerceDashNode

import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.CryptoCurrency
import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.FiatCurrency
import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.Price
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Crypto extends js.Object {
  var crypto: Price[CryptoCurrency]
  var local: Price[FiatCurrency]
}

object Anon_Crypto {
  @scala.inline
  def apply(crypto: Price[CryptoCurrency], local: Price[FiatCurrency]): Anon_Crypto = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Crypto]
  }
}

