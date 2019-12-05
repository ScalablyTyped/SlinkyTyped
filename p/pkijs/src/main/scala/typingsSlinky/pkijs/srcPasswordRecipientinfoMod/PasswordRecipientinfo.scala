package typingsSlinky.pkijs.srcPasswordRecipientinfoMod

import typingsSlinky.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRecipientinfo extends js.Object {
  var encryptedKey: OctetString
  var keyDerivationAlgorithm: js.UndefOr[typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default] = js.undefined
  var keyEncryptionAlgorithm: typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default
  var password: scala.scalajs.js.typedarray.ArrayBuffer
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PasswordRecipientinfo {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default,
    password: scala.scalajs.js.typedarray.ArrayBuffer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    keyDerivationAlgorithm: typingsSlinky.pkijs.srcAlgorithmIdentifierMod.default = null
  ): PasswordRecipientinfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    if (keyDerivationAlgorithm != null) __obj.updateDynamic("keyDerivationAlgorithm")(keyDerivationAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRecipientinfo]
  }
}

