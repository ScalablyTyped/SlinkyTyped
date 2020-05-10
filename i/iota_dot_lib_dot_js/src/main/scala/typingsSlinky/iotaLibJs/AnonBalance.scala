package typingsSlinky.iotaLibJs

import typingsSlinky.iotaLibJs.mod.InputObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBalance extends js.Object {
  var addresses: js.Array[String] = js.native
  var balance: Double = js.native
  var inputs: js.Array[InputObject] = js.native
  var latestAddress: String = js.native
  var transfers: js.Array[String] = js.native
}

object AnonBalance {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    balance: Double,
    inputs: js.Array[InputObject],
    latestAddress: String,
    transfers: js.Array[String]
  ): AnonBalance = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], latestAddress = latestAddress.asInstanceOf[js.Any], transfers = transfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBalance]
  }
  @scala.inline
  implicit class AnonBalanceOps[Self <: AnonBalance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[InputObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransfers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

