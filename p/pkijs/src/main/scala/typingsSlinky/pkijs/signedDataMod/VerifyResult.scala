package typingsSlinky.pkijs.signedDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyResult extends js.Object {
  var code: Double = js.native
  var date: js.Date = js.native
  var message: String = js.native
  var signatureVerified: js.UndefOr[Boolean] = js.native
  var signerCertificate: js.UndefOr[typingsSlinky.pkijs.certificateMod.default] = js.native
  var signerCertificateVerified: js.UndefOr[Boolean] = js.native
}

object VerifyResult {
  @scala.inline
  def apply(code: Double, date: js.Date, message: String): VerifyResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResult]
  }
  @scala.inline
  implicit class VerifyResultOps[Self <: VerifyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureVerified")(js.undefined)
        ret
    }
    @scala.inline
    def withSignerCertificate(value: typingsSlinky.pkijs.certificateMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignerCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withSignerCertificateVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerCertificateVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignerCertificateVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signerCertificateVerified")(js.undefined)
        ret
    }
  }
  
}

