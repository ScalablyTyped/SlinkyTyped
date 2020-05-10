package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomCodeSigning extends js.Object {
  /**
    * The certificate chain.
    */
  var certificateChain: js.UndefOr[CodeSigningCertificateChain] = js.native
  /**
    * The hash algorithm used to code sign the file.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.native
  /**
    * The signature for the file.
    */
  var signature: js.UndefOr[CodeSigningSignature] = js.native
  /**
    * The signature algorithm used to code sign the file.
    */
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.native
}

object CustomCodeSigning {
  @scala.inline
  def apply(): CustomCodeSigning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomCodeSigning]
  }
  @scala.inline
  implicit class CustomCodeSigningOps[Self <: CustomCodeSigning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateChain(value: CodeSigningCertificateChain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(js.undefined)
        ret
    }
    @scala.inline
    def withHashAlgorithm(value: HashAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: CodeSigningSignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: SignatureAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(js.undefined)
        ret
    }
  }
  
}

