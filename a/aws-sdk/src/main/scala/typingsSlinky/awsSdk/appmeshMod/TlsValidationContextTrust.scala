package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsValidationContextTrust extends js.Object {
  /**
    * A reference to an object that represents a TLS validation context trust for an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[TlsValidationContextAcmTrust] = js.native
  /**
    * An object that represents a TLS validation context trust for a local file.
    */
  var file: js.UndefOr[TlsValidationContextFileTrust] = js.native
}

object TlsValidationContextTrust {
  @scala.inline
  def apply(): TlsValidationContextTrust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsValidationContextTrust]
  }
  @scala.inline
  implicit class TlsValidationContextTrustOps[Self <: TlsValidationContextTrust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcm(value: TlsValidationContextAcmTrust): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acm")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: TlsValidationContextFileTrust): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
  }
  
}

