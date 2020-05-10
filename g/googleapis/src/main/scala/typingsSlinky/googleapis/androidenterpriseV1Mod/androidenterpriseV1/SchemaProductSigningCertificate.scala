package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductSigningCertificate extends js.Object {
  /**
    * The base64 urlsafe encoded SHA1 hash of the certificate. (This field is
    * deprecated in favor of SHA2-256. It should not be used and may be removed
    * at any time.)
    */
  var certificateHashSha1: js.UndefOr[String] = js.native
  /**
    * The base64 urlsafe encoded SHA2-256 hash of the certificate.
    */
  var certificateHashSha256: js.UndefOr[String] = js.native
}

object SchemaProductSigningCertificate {
  @scala.inline
  def apply(): SchemaProductSigningCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSigningCertificate]
  }
  @scala.inline
  implicit class SchemaProductSigningCertificateOps[Self <: SchemaProductSigningCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateHashSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateHashSha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateHashSha1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateHashSha1")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateHashSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateHashSha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateHashSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateHashSha256")(js.undefined)
        ret
    }
  }
  
}

