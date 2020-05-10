package typingsSlinky.pkijs.signerInfoMod

import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignerInfo extends js.Object {
  var digestAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var sid: js.Any = js.native
  var signature: OctetString = js.native
  var signatureAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var signedAttrs: js.UndefOr[typingsSlinky.pkijs.signedAndUnsignedAttributesMod.default] = js.native
  var unsignedAttrs: js.UndefOr[typingsSlinky.pkijs.signedAndUnsignedAttributesMod.default] = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object SignerInfo {
  @scala.inline
  def apply(
    digestAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    sid: js.Any,
    signature: OctetString,
    signatureAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): SignerInfo = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), sid = sid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerInfo]
  }
  @scala.inline
  implicit class SignerInfoOps[Self <: SignerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigestAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedAttrs(value: typingsSlinky.pkijs.signedAndUnsignedAttributesMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsignedAttrs(value: typingsSlinky.pkijs.signedAndUnsignedAttributesMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsignedAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsignedAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsignedAttrs")(js.undefined)
        ret
    }
  }
  
}

