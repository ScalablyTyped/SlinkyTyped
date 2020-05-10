package typingsSlinky.saml.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamlOpts extends js.Object {
  var attributes: js.UndefOr[SamlAttributes] = js.native
  var audiences: js.UndefOr[String | js.Array[String]] = js.native
  var authnContextClassRef: js.UndefOr[String] = js.native
  var cert: Buffer = js.native
  var digestAlgorithm: js.UndefOr[String] = js.native
  var encryptionAlgorithm: js.UndefOr[String] = js.native
  var encryptionCert: js.UndefOr[Buffer] = js.native
  var encryptionPublicKey: js.UndefOr[Buffer] = js.native
  var holderOfKeyProofSecret: js.UndefOr[String] = js.native
  var inResponseTo: js.UndefOr[String] = js.native
  var includeAttributeNameFormat: js.UndefOr[Boolean] = js.native
  var issuer: js.UndefOr[String] = js.native
  var key: Buffer = js.native
  var keyEncryptionAlgorighm: js.UndefOr[String] = js.native
   // sic https://github.com/auth0/node-xml-encryption/issues/17
  var keyInfoProvider: js.UndefOr[KeyInfoProvider] = js.native
  var lifetimeInSeconds: js.UndefOr[Double] = js.native
  var nameIdentifier: js.UndefOr[String] = js.native
  var nameIdentifierFormat: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var recipient: js.UndefOr[String] = js.native
  var sessionIndex: js.UndefOr[String] = js.native
  var signatureAlgorithm: js.UndefOr[String] = js.native
  var signatureNamespacePrefix: js.UndefOr[String] = js.native
  var subjectConfirmationMethod: js.UndefOr[String] = js.native
  var typedAttributes: js.UndefOr[Boolean] = js.native
  var uid: js.UndefOr[String] = js.native
  var xpathToNodeBeforeSignature: js.UndefOr[String] = js.native
}

object SamlOpts {
  @scala.inline
  def apply(cert: Buffer, key: Buffer): SamlOpts = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamlOpts]
  }
  @scala.inline
  implicit class SamlOptsOps[Self <: SamlOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCert(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: SamlAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAudiences(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudiences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audiences")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthnContextClassRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnContextClassRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthnContextClassRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnContextClassRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDigestAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigestAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionCert(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionCert")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionPublicKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withHolderOfKeyProofSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderOfKeyProofSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolderOfKeyProofSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderOfKeyProofSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withInResponseTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inResponseTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInResponseTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inResponseTo")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAttributeNameFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttributeNameFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAttributeNameFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttributeNameFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyEncryptionAlgorighm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncryptionAlgorighm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyEncryptionAlgorighm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncryptionAlgorighm")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyInfoProvider(value: KeyInfoProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyInfoProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyInfoProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyInfoProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withLifetimeInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifetimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetimeInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withNameIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withNameIdentifierFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIdentifierFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameIdentifierFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIdentifierFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: String): Self = {
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
    @scala.inline
    def withSignatureNamespacePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureNamespacePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureNamespacePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureNamespacePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectConfirmationMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectConfirmationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectConfirmationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectConfirmationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withTypedAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typedAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withXpathToNodeBeforeSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpathToNodeBeforeSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpathToNodeBeforeSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpathToNodeBeforeSignature")(js.undefined)
        ret
    }
  }
  
}

