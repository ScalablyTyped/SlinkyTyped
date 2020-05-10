package typingsSlinky.contractProxyKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionResult extends js.Object {
  var hash: String = js.native
  var promiEvent: js.UndefOr[js.Object] = js.native
  var transactionResponse: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.providers.TransactionResponse */ js.Any
  ] = js.native
}

object TransactionResult {
  @scala.inline
  def apply(hash: String): TransactionResult = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResult]
  }
  @scala.inline
  implicit class TransactionResultOps[Self <: TransactionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromiEvent(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromiEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionResponse(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.providers.TransactionResponse */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionResponse")(js.undefined)
        ret
    }
  }
  
}

