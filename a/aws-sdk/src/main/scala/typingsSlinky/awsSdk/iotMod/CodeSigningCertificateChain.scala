package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeSigningCertificateChain extends js.Object {
  /**
    * The name of the certificate.
    */
  var certificateName: js.UndefOr[CertificateName] = js.native
  /**
    * A base64 encoded binary representation of the code signing certificate chain.
    */
  var inlineDocument: js.UndefOr[InlineDocument] = js.native
}

object CodeSigningCertificateChain {
  @scala.inline
  def apply(): CodeSigningCertificateChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningCertificateChain]
  }
  @scala.inline
  implicit class CodeSigningCertificateChainOps[Self <: CodeSigningCertificateChain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateName(value: CertificateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateName")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineDocument(value: InlineDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDocument")(js.undefined)
        ret
    }
  }
  
}

