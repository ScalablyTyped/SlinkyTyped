package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportClientVpnClientCertificateRevocationListResult extends js.Object {
  /**
    * Information about the client certificate revocation list.
    */
  var CertificateRevocationList: js.UndefOr[String] = js.native
  /**
    * The current state of the client certificate revocation list.
    */
  var Status: js.UndefOr[ClientCertificateRevocationListStatus] = js.native
}

object ExportClientVpnClientCertificateRevocationListResult {
  @scala.inline
  def apply(): ExportClientVpnClientCertificateRevocationListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportClientVpnClientCertificateRevocationListResult]
  }
  @scala.inline
  implicit class ExportClientVpnClientCertificateRevocationListResultOps[Self <: ExportClientVpnClientCertificateRevocationListResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateRevocationList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateRevocationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateRevocationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateRevocationList")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ClientCertificateRevocationListStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

