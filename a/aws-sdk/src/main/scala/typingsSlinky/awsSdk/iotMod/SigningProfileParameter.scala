package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningProfileParameter extends js.Object {
  /**
    * Certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The location of the code-signing certificate on your device.
    */
  var certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice] = js.native
  /**
    * The hardware platform of your device.
    */
  var platform: js.UndefOr[Platform] = js.native
}

object SigningProfileParameter {
  @scala.inline
  def apply(): SigningProfileParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningProfileParameter]
  }
  @scala.inline
  implicit class SigningProfileParameterOps[Self <: SigningProfileParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: CertificateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificatePathOnDevice(value: CertificatePathOnDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePathOnDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePathOnDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePathOnDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: Platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
  }
  
}

