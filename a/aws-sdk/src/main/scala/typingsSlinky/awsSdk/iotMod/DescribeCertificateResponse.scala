package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCertificateResponse extends js.Object {
  /**
    * The description of the certificate.
    */
  var certificateDescription: js.UndefOr[CertificateDescription] = js.native
}

object DescribeCertificateResponse {
  @scala.inline
  def apply(): DescribeCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateResponse]
  }
  @scala.inline
  implicit class DescribeCertificateResponseOps[Self <: DescribeCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateDescription(value: CertificateDescription): Self = {
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
  }
  
}

