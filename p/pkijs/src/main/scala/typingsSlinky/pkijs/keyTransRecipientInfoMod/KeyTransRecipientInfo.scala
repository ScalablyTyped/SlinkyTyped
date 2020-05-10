package typingsSlinky.pkijs.keyTransRecipientInfoMod

import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyTransRecipientInfo extends js.Object {
  var encryptedKey: OctetString = js.native
  var keyEncryptionAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  /**
    * For some reasons we need to store recipient's certificate here
    *
    * @type {Certificate}
    * @memberOf KeyTransRecipientInfo
    */
  var recipientCertificate: typingsSlinky.pkijs.certificateMod.default = js.native
  var rid: typingsSlinky.pkijs.recipientIdentifierMod.default = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object KeyTransRecipientInfo {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    recipientCertificate: typingsSlinky.pkijs.certificateMod.default,
    rid: typingsSlinky.pkijs.recipientIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): KeyTransRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyTransRecipientInfo]
  }
  @scala.inline
  implicit class KeyTransRecipientInfoOps[Self <: KeyTransRecipientInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptedKey(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyEncryptionAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientCertificate(value: typingsSlinky.pkijs.certificateMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRid(value: typingsSlinky.pkijs.recipientIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rid")(value.asInstanceOf[js.Any])
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
  }
  
}

