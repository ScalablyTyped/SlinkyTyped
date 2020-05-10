package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkInterfaceResult extends js.Object {
  /**
    * Information about the network interface.
    */
  var NetworkInterface: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NetworkInterface] = js.native
}

object CreateNetworkInterfaceResult {
  @scala.inline
  def apply(): CreateNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInterfaceResult]
  }
  @scala.inline
  implicit class CreateNetworkInterfaceResultOps[Self <: CreateNetworkInterfaceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkInterface(value: NetworkInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterface")(js.undefined)
        ret
    }
  }
  
}

