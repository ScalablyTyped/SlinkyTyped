package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworking extends js.Object {
  /**
    * The amount of data in GB allocated for monthly data transfers.
    */
  var monthlyTransfer: js.UndefOr[MonthlyTransfer] = js.native
  /**
    * An array of key-value pairs containing information about the ports on the instance.
    */
  var ports: js.UndefOr[InstancePortInfoList] = js.native
}

object InstanceNetworking {
  @scala.inline
  def apply(): InstanceNetworking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworking]
  }
  @scala.inline
  implicit class InstanceNetworkingOps[Self <: InstanceNetworking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonthlyTransfer(value: MonthlyTransfer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthlyTransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthlyTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthlyTransfer")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: InstancePortInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
  }
  
}

