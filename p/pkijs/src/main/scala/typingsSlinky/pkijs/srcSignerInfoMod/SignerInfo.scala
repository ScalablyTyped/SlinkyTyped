package typingsSlinky.pkijs.srcSignerInfoMod

import typingsSlinky.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerInfo extends js.Object {
  var digestAlgorithm: typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default
  var sid: js.Any
  var signature: OctetString
  var signatureAlgorithm: typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default
  var signedAttrs: js.UndefOr[typingsSlinky.pkijs.srcSignedAndUnsignedAttributesMod.default] = js.undefined
  var unsignedAttrs: js.UndefOr[typingsSlinky.pkijs.srcSignedAndUnsignedAttributesMod.default] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SignerInfo {
  @scala.inline
  def apply(
    digestAlgorithm: typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    sid: js.Any,
    signature: OctetString,
    signatureAlgorithm: typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    signedAttrs: typingsSlinky.pkijs.srcSignedAndUnsignedAttributesMod.default = null,
    unsignedAttrs: typingsSlinky.pkijs.srcSignedAndUnsignedAttributesMod.default = null
  ): SignerInfo = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), sid = sid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    if (signedAttrs != null) __obj.updateDynamic("signedAttrs")(signedAttrs.asInstanceOf[js.Any])
    if (unsignedAttrs != null) __obj.updateDynamic("unsignedAttrs")(unsignedAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerInfo]
  }
}

