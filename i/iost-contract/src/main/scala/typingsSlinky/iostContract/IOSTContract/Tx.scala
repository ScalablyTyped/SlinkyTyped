package typingsSlinky.iostContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tx extends js.Object {
  var auth_list: js.Object = js.native
  var expiration: Double = js.native
  var gas_limit: Double = js.native
  var gas_ratio: Double = js.native
  var hash: String = js.native
  var publisher: String = js.native
  var time: Double = js.native
}

object Tx {
  @scala.inline
  def apply(
    auth_list: js.Object,
    expiration: Double,
    gas_limit: Double,
    gas_ratio: Double,
    hash: String,
    publisher: String,
    time: Double
  ): Tx = {
    val __obj = js.Dynamic.literal(auth_list = auth_list.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], gas_ratio = gas_ratio.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tx]
  }
  @scala.inline
  implicit class TxOps[Self <: Tx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth_list(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGas_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gas_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGas_ratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gas_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

