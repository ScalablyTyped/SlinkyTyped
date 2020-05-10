package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificateAuthoritiesResponse extends js.Object {
  /**
    * Summary information about each certificate authority you have created.
    */
  var CertificateAuthorities: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.CertificateAuthorities] = js.native
  /**
    * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.acmpcaMod.NextToken] = js.native
}

object ListCertificateAuthoritiesResponse {
  @scala.inline
  def apply(): ListCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateAuthoritiesResponse]
  }
  @scala.inline
  implicit class ListCertificateAuthoritiesResponseOps[Self <: ListCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorities(value: CertificateAuthorities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorities")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

