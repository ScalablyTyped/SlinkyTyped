package typingsSlinky.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Crypto pricing object.
  */
/* Inlined {[ key in coinbase-commerce-node.coinbase-commerce-node.CryptoName ]:? coinbase-commerce-node.coinbase-commerce-node.Price<coinbase-commerce-node.coinbase-commerce-node.CryptoCurrency>} */
@js.native
trait CryptoPricing extends js.Object {
  var bitcoin: js.UndefOr[Price[CryptoCurrency]] = js.native
  var bitcoincash: js.UndefOr[Price[CryptoCurrency]] = js.native
  var ethereum: js.UndefOr[Price[CryptoCurrency]] = js.native
  var litecoin: js.UndefOr[Price[CryptoCurrency]] = js.native
  var usdc: js.UndefOr[Price[CryptoCurrency]] = js.native
}

object CryptoPricing {
  @scala.inline
  def apply(): CryptoPricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoPricing]
  }
  @scala.inline
  implicit class CryptoPricingOps[Self <: CryptoPricing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitcoin(value: Price[CryptoCurrency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitcoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin")(js.undefined)
        ret
    }
    @scala.inline
    def withBitcoincash(value: Price[CryptoCurrency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoincash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitcoincash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoincash")(js.undefined)
        ret
    }
    @scala.inline
    def withEthereum(value: Price[CryptoCurrency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ethereum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEthereum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ethereum")(js.undefined)
        ret
    }
    @scala.inline
    def withLitecoin(value: Price[CryptoCurrency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("litecoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLitecoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("litecoin")(js.undefined)
        ret
    }
    @scala.inline
    def withUsdc(value: Price[CryptoCurrency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usdc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsdc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usdc")(js.undefined)
        ret
    }
  }
  
}

