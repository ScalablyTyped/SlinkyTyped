package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkOutput extends js.Object {
  /**
    * An object containing network configuration parameters.
    */
  var Network: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.Network] = js.native
}

object GetNetworkOutput {
  @scala.inline
  def apply(): GetNetworkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkOutput]
  }
  @scala.inline
  implicit class GetNetworkOutputOps[Self <: GetNetworkOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Network")(js.undefined)
        ret
    }
  }
  
}

