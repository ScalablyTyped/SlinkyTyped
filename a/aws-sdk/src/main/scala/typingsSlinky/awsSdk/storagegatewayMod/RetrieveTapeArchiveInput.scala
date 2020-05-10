package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveTapeArchiveInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the ListGateways operation to return a list of gateways for your account and AWS Region. You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
    */
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf (VTS).
    */
  var TapeARN: typingsSlinky.awsSdk.storagegatewayMod.TapeARN = js.native
}

object RetrieveTapeArchiveInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): RetrieveTapeArchiveInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveTapeArchiveInput]
  }
  @scala.inline
  implicit class RetrieveTapeArchiveInputOps[Self <: RetrieveTapeArchiveInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTapeARN(value: TapeARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

