package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateInfo extends js.Object {
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.CertificateId] = js.native
  /**
    * The common name for the certificate.
    */
  var CommonName: js.UndefOr[CertificateCN] = js.native
  /**
    * The date and time when the certificate will expire.
    */
  var ExpiryDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The state of the certificate.
    */
  var State: js.UndefOr[CertificateState] = js.native
}

object CertificateInfo {
  @scala.inline
  def apply(): CertificateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateInfo]
  }
  @scala.inline
  implicit class CertificateInfoOps[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonName(value: CertificateCN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommonName")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiryDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiryDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpiryDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CertificateState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

