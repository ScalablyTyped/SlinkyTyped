package typingsSlinky.ethereumProtocol.mod

import typingsSlinky.bignumberJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallTxDataBase extends js.Object {
  var data: js.UndefOr[String] = js.native
  var gas: js.UndefOr[Double | String | default] = js.native
  var gasPrice: js.UndefOr[Double | String | default] = js.native
  var nonce: js.UndefOr[Double] = js.native
  var to: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double | String | default] = js.native
}

object CallTxDataBase {
  @scala.inline
  def apply(): CallTxDataBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallTxDataBase]
  }
  @scala.inline
  implicit class CallTxDataBaseOps[Self <: CallTxDataBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
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
    def withGas(value: Double | String | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gas")(js.undefined)
        ret
    }
    @scala.inline
    def withGasPrice(value: Double | String | default): Self = {
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
    def withNonce(value: Double): Self = {
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
    def withTo(value: String): Self = {
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
    def withValue(value: Double | String | default): Self = {
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

