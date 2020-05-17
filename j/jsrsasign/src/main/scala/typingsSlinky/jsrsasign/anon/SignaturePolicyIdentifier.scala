package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.TypeParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaturePolicyIdentifier extends js.Object {
  var SignaturePolicyIdentifier: Oid = js.native
  var SigningCertificateV2: ArrayParam[String] | Array | typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cms.SigningCertificateV2 = js.native
  var SigningTime: TypeParam | StringParam = js.native
}

object SignaturePolicyIdentifier {
  @scala.inline
  def apply(
    SignaturePolicyIdentifier: Oid,
    SigningCertificateV2: ArrayParam[String] | Array | SigningCertificateV2,
    SigningTime: TypeParam | StringParam
  ): SignaturePolicyIdentifier = {
    val __obj = js.Dynamic.literal(SignaturePolicyIdentifier = SignaturePolicyIdentifier.asInstanceOf[js.Any], SigningCertificateV2 = SigningCertificateV2.asInstanceOf[js.Any], SigningTime = SigningTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaturePolicyIdentifier]
  }
  @scala.inline
  implicit class SignaturePolicyIdentifierOps[Self <: SignaturePolicyIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignaturePolicyIdentifier(value: Oid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignaturePolicyIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningCertificateV2(value: ArrayParam[String] | Array | SigningCertificateV2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningCertificateV2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningTime(value: TypeParam | StringParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

