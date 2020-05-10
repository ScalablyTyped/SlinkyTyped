package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesPrivateIpAddressConfig extends js.Object {
  /**
    * Indicates whether this is a primary IPv4 address. Otherwise, this is a secondary IPv4 address.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  /**
    * The IPv4 address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object ScheduledInstancesPrivateIpAddressConfig {
  @scala.inline
  def apply(): ScheduledInstancesPrivateIpAddressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesPrivateIpAddressConfig]
  }
  @scala.inline
  implicit class ScheduledInstancesPrivateIpAddressConfigOps[Self <: ScheduledInstancesPrivateIpAddressConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Primary")(js.undefined)
        ret
    }
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

