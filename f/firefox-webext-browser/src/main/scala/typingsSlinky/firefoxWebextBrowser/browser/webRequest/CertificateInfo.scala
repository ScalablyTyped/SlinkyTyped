package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import typingsSlinky.firefoxWebextBrowser.anon.End
import typingsSlinky.firefoxWebextBrowser.anon.Sha1
import typingsSlinky.firefoxWebextBrowser.anon.Sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the certificate properties of the request if it is a secure request. */
@js.native
trait CertificateInfo extends js.Object {
  var fingerprint: Sha1 = js.native
  var isBuiltInRoot: Boolean = js.native
  var issuer: String = js.native
  var rawDER: js.UndefOr[js.Array[Double]] = js.native
  var serialNumber: String = js.native
  var subject: String = js.native
  var subjectPublicKeyInfoDigest: Sha256 = js.native
  /** Contains start and end timestamps. */
  var validity: End = js.native
}

object CertificateInfo {
  @scala.inline
  def apply(
    fingerprint: Sha1,
    isBuiltInRoot: Boolean,
    issuer: String,
    serialNumber: String,
    subject: String,
    subjectPublicKeyInfoDigest: Sha256,
    validity: End
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], isBuiltInRoot = isBuiltInRoot.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfoDigest = subjectPublicKeyInfoDigest.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
  @scala.inline
  implicit class CertificateInfoOps[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: Sha1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBuiltInRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuiltInRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectPublicKeyInfoDigest(value: Sha256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectPublicKeyInfoDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidity(value: End): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawDER(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawDER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawDER: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawDER")(js.undefined)
        ret
    }
  }
  
}

