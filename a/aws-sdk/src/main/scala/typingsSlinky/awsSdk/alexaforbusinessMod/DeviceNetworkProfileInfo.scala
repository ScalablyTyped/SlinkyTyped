package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceNetworkProfileInfo extends js.Object {
  /**
    * The ARN of the certificate associated with a device.
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  /**
    * The time (in epoch) when the certificate expires.
    */
  var CertificateExpirationTime: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.native
}

object DeviceNetworkProfileInfo {
  @scala.inline
  def apply(): DeviceNetworkProfileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceNetworkProfileInfo]
  }
  @scala.inline
  implicit class DeviceNetworkProfileInfoOps[Self <: DeviceNetworkProfileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateExpirationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateExpirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProfileArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkProfileArn")(js.undefined)
        ret
    }
  }
  
}

