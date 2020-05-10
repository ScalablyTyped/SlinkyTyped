package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesResponse extends js.Object {
  /**
    * A list of ACM certificates.
    */
  var CertificateSummaryList: js.UndefOr[typingsSlinky.awsSdk.acmMod.CertificateSummaryList] = js.native
  /**
    * When the list is truncated, this value is present and contains the value to use for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.acmMod.NextToken] = js.native
}

object ListCertificatesResponse {
  @scala.inline
  def apply(): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResponse]
  }
  @scala.inline
  implicit class ListCertificatesResponseOps[Self <: ListCertificatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateSummaryList(value: CertificateSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateSummaryList")(js.undefined)
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

