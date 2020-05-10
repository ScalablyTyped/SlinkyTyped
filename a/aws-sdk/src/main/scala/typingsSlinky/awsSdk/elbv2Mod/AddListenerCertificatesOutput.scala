package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddListenerCertificatesOutput extends js.Object {
  /**
    * Information about the certificates in the certificate list.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
}

object AddListenerCertificatesOutput {
  @scala.inline
  def apply(): AddListenerCertificatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddListenerCertificatesOutput]
  }
  @scala.inline
  implicit class AddListenerCertificatesOutputOps[Self <: AddListenerCertificatesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificates(value: CertificateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificates")(js.undefined)
        ret
    }
  }
  
}

