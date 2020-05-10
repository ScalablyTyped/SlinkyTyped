package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignedPrivateIpAddress extends js.Object {
  /**
    * The private IP address assigned to the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object AssignedPrivateIpAddress {
  @scala.inline
  def apply(): AssignedPrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedPrivateIpAddress]
  }
  @scala.inline
  implicit class AssignedPrivateIpAddressOps[Self <: AssignedPrivateIpAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivateIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(js.undefined)
        ret
    }
  }
  
}

