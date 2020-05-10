package typingsSlinky.coinbaseCommerceNode

import typingsSlinky.coinbaseCommerceNode.mod.CryptoCurrency
import typingsSlinky.coinbaseCommerceNode.mod.FiatCurrency
import typingsSlinky.coinbaseCommerceNode.mod.Price
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCrypto extends js.Object {
  var crypto: Price[CryptoCurrency] = js.native
  var local: Price[FiatCurrency] = js.native
}

object AnonCrypto {
  @scala.inline
  def apply(crypto: Price[CryptoCurrency], local: Price[FiatCurrency]): AnonCrypto = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCrypto]
  }
  @scala.inline
  implicit class AnonCryptoOps[Self <: AnonCrypto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrypto(value: Price[CryptoCurrency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal(value: Price[FiatCurrency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

