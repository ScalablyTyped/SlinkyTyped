package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetAddress extends js.Object {
  /**
    * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
    */
  var Ip: typingsSlinky.awsSdk.route53resolverMod.Ip = js.native
  /**
    * The port at Ip that you want to forward DNS queries to.
    */
  var Port: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Port] = js.native
}

object TargetAddress {
  @scala.inline
  def apply(Ip: Ip): TargetAddress = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetAddress]
  }
  @scala.inline
  implicit class TargetAddressOps[Self <: TargetAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp(value: Ip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
  }
  
}

