package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDevicePolicyConfigurationRequest extends js.Object {
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  var DeviceCaCertificate: js.UndefOr[CertificateChain] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
}

object UpdateDevicePolicyConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): UpdateDevicePolicyConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevicePolicyConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateDevicePolicyConfigurationRequestOps[Self <: UpdateDevicePolicyConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetArn(value: FleetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceCaCertificate(value: CertificateChain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceCaCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCaCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceCaCertificate")(js.undefined)
        ret
    }
  }
  
}

