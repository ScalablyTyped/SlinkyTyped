package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesResult extends js.Object {
  /**
    * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
    */
  var CertificatesInfo: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.CertificatesInfo] = js.native
  /**
    * Indicates whether another page of certificates is available when the number of available certificates exceeds the page limit.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
}

object ListCertificatesResult {
  @scala.inline
  def apply(): ListCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResult]
  }
  @scala.inline
  implicit class ListCertificatesResultOps[Self <: ListCertificatesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificatesInfo(value: CertificatesInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificatesInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatesInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificatesInfo")(js.undefined)
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

