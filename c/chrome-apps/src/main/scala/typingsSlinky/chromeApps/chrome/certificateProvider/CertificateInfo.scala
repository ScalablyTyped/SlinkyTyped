package typingsSlinky.chromeApps.chrome.certificateProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateInfo extends js.Object {
  /**
    * Must be the DER encoding of a X.509 certificate. Currently, only
    * certificates of RSA keys are supported.
    */
  var certificate: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  /**
    * Must be set to all hashes supported for this certificate. This app
    * will only be asked for signatures of digests calculated with one of these
    * hash algorithms. This should be in order of decreasing hash preference.
    * @see Hash
    */
  var supportedHashes: js.UndefOr[js.Array[Hash]] = js.native
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
    def withCertificate(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedHashes(value: js.Array[Hash]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedHashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedHashes")(js.undefined)
        ret
    }
  }
  
}

