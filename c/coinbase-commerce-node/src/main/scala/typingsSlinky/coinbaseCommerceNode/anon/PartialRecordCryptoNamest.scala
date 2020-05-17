package typingsSlinky.coinbaseCommerceNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<coinbase-commerce-node.coinbase-commerce-node.CryptoName, string>> */
@js.native
trait PartialRecordCryptoNamest extends js.Object {
  var bitcoin: js.UndefOr[String] = js.native
  var bitcoincash: js.UndefOr[String] = js.native
  var ethereum: js.UndefOr[String] = js.native
  var litecoin: js.UndefOr[String] = js.native
  var usdc: js.UndefOr[String] = js.native
}

object PartialRecordCryptoNamest {
  @scala.inline
  def apply(): PartialRecordCryptoNamest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordCryptoNamest]
  }
  @scala.inline
  implicit class PartialRecordCryptoNamestOps[Self <: PartialRecordCryptoNamest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitcoin(value: String): Self = {
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
    def withBitcoincash(value: String): Self = {
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
    def withEthereum(value: String): Self = {
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
    def withLitecoin(value: String): Self = {
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
    def withUsdc(value: String): Self = {
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

