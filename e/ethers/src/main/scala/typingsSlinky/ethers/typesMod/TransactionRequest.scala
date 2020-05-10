package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionRequest extends js.Object {
  var chainId: js.UndefOr[Double | js.Promise[Double]] = js.native
  var data: js.UndefOr[Arrayish | js.Promise[Arrayish]] = js.native
  var from: js.UndefOr[String | js.Promise[String]] = js.native
  var gasLimit: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.native
  var gasPrice: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.native
  var nonce: js.UndefOr[Double | String | (js.Promise[Double | String])] = js.native
  var to: js.UndefOr[String | js.Promise[String]] = js.native
  var value: js.UndefOr[BigNumberish | js.Promise[BigNumberish]] = js.native
}

object TransactionRequest {
  @scala.inline
  def apply(): TransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionRequest]
  }
  @scala.inline
  implicit class TransactionRequestOps[Self <: TransactionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChainId(value: Double | js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChainId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chainId")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Arrayish | js.Promise[Arrayish]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withGasLimit(value: BigNumberish | js.Promise[BigNumberish]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGasLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withGasPrice(value: BigNumberish | js.Promise[BigNumberish]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGasPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: Double | String | (js.Promise[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String | js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: BigNumberish | js.Promise[BigNumberish]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

