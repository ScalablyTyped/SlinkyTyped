package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCertificateAuthorityResponse extends js.Object {
  /**
    * A CertificateAuthority structure that contains information about your private CA.
    */
  var CertificateAuthority: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.CertificateAuthority] = js.native
}

object DescribeCertificateAuthorityResponse {
  @scala.inline
  def apply(): DescribeCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateAuthorityResponse]
  }
  @scala.inline
  implicit class DescribeCertificateAuthorityResponseOps[Self <: DescribeCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthority(value: CertificateAuthority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthority")(js.undefined)
        ret
    }
  }
  
}

