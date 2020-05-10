package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateIpAddressSpecification extends js.Object {
  /**
    * Indicates whether the private IPv4 address is the primary private IPv4 address. Only one IPv4 address can be designated as primary.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  /**
    * The private IPv4 addresses.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object PrivateIpAddressSpecification {
  @scala.inline
  def apply(): PrivateIpAddressSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateIpAddressSpecification]
  }
  @scala.inline
  implicit class PrivateIpAddressSpecificationOps[Self <: PrivateIpAddressSpecification] (val x: Self) extends AnyVal {
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

