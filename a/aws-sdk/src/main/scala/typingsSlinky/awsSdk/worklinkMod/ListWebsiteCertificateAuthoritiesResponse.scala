package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebsiteCertificateAuthoritiesResponse extends js.Object {
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.NextToken] = js.native
  /**
    * Information about the certificates.
    */
  var WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList] = js.native
}

object ListWebsiteCertificateAuthoritiesResponse {
  @scala.inline
  def apply(): ListWebsiteCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebsiteCertificateAuthoritiesResponse]
  }
  @scala.inline
  implicit class ListWebsiteCertificateAuthoritiesResponseOps[Self <: ListWebsiteCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withWebsiteCertificateAuthorities(value: WebsiteCaSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteCertificateAuthorities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteCertificateAuthorities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteCertificateAuthorities")(js.undefined)
        ret
    }
  }
  
}

