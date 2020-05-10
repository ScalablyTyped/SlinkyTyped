package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSigningCertificateResponse extends js.Object {
  /**
    * The signing certificate.
    */
  var Certificate: js.UndefOr[StringType] = js.native
}

object GetSigningCertificateResponse {
  @scala.inline
  def apply(): GetSigningCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningCertificateResponse]
  }
  @scala.inline
  implicit class GetSigningCertificateResponseOps[Self <: GetSigningCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(js.undefined)
        ret
    }
  }
  
}

