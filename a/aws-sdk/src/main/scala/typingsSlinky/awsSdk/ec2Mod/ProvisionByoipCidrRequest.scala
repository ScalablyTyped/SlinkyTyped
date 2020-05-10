package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionByoipCidrRequest extends js.Object {
  /**
    * The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can specify is /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap with another address range that you've brought to this or another Region.
    */
  var Cidr: String = js.native
  /**
    * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP.
    */
  var CidrAuthorizationContext: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CidrAuthorizationContext] = js.native
  /**
    * A description for the address range and the address pool.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * (IPv6 only) Indicate whether the address range will be publicly advertised to the internet. Default: true
    */
  var PubliclyAdvertisable: js.UndefOr[Boolean] = js.native
}

object ProvisionByoipCidrRequest {
  @scala.inline
  def apply(Cidr: String): ProvisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionByoipCidrRequest]
  }
  @scala.inline
  implicit class ProvisionByoipCidrRequestOps[Self <: ProvisionByoipCidrRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrAuthorizationContext(value: CidrAuthorizationContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrAuthorizationContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrAuthorizationContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrAuthorizationContext")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withPubliclyAdvertisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAdvertisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubliclyAdvertisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAdvertisable")(js.undefined)
        ret
    }
  }
  
}

