package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCACertificateResponse extends js.Object {
  /**
    * The CA certificate description.
    */
  var certificateDescription: js.UndefOr[CACertificateDescription] = js.native
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.native
}

object DescribeCACertificateResponse {
  @scala.inline
  def apply(): DescribeCACertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCACertificateResponse]
  }
  @scala.inline
  implicit class DescribeCACertificateResponseOps[Self <: DescribeCACertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateDescription(value: CACertificateDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationConfig(value: RegistrationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationConfig")(js.undefined)
        ret
    }
  }
  
}

