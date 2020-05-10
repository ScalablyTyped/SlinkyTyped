package typingsSlinky.coinbaseCommerceNode

import typingsSlinky.coinbaseCommerceNode.mod.CryptoName
import typingsSlinky.coinbaseCommerceNode.mod.PaymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlock extends js.Object {
  var block: AnonConfirmationsaccumulated = js.native
  var network: CryptoName = js.native
  var status: PaymentStatus = js.native
  var transaction_id: String = js.native
  var value: AnonCrypto = js.native
}

object AnonBlock {
  @scala.inline
  def apply(
    block: AnonConfirmationsaccumulated,
    network: CryptoName,
    status: PaymentStatus,
    transaction_id: String,
    value: AnonCrypto
  ): AnonBlock = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlock]
  }
  @scala.inline
  implicit class AnonBlockOps[Self <: AnonBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: AnonConfirmationsaccumulated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetwork(value: CryptoName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: PaymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransaction_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: AnonCrypto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

