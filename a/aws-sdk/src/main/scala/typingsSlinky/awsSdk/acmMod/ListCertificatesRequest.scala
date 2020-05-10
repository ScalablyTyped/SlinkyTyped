package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesRequest extends js.Object {
  /**
    * Filter the certificate list by status value.
    */
  var CertificateStatuses: js.UndefOr[typingsSlinky.awsSdk.acmMod.CertificateStatuses] = js.native
  /**
    * Filter the certificate list. For more information, see the Filters structure.
    */
  var Includes: js.UndefOr[Filters] = js.native
  /**
    * Use this parameter when paginating results to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxItems: js.UndefOr[typingsSlinky.awsSdk.acmMod.MaxItems] = js.native
  /**
    * Use this parameter only when paginating results and only in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.acmMod.NextToken] = js.native
}

object ListCertificatesRequest {
  @scala.inline
  def apply(): ListCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesRequest]
  }
  @scala.inline
  implicit class ListCertificatesRequestOps[Self <: ListCertificatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateStatuses(value: CertificateStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludes(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Includes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: MaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(js.undefined)
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

