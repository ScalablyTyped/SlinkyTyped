package typingsSlinky.pkijs.keyAgreeRecipientInfoMod

import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyAgreeRecipientInfo extends js.Object {
  var keyEncryptionAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var originator: typingsSlinky.pkijs.originatorIdentifierOrKeyMod.default = js.native
  var recipientCertificate: typingsSlinky.pkijs.certificateMod.default = js.native
  var recipientEncryptedKeys: typingsSlinky.pkijs.recipientEncryptedKeysMod.default = js.native
  var ukm: js.UndefOr[OctetString] = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object KeyAgreeRecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    originator: typingsSlinky.pkijs.originatorIdentifierOrKeyMod.default,
    recipientCertificate: typingsSlinky.pkijs.certificateMod.default,
    recipientEncryptedKeys: typingsSlinky.pkijs.recipientEncryptedKeysMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): KeyAgreeRecipientInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientEncryptedKeys = recipientEncryptedKeys.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAgreeRecipientInfo]
  }
  @scala.inline
  implicit class KeyAgreeRecipientInfoOps[Self <: KeyAgreeRecipientInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withOriginator(value: typingsSlinky.pkijs.originatorIdentifierOrKeyMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientCertificate(value: typingsSlinky.pkijs.certificateMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientEncryptedKeys(value: typingsSlinky.pkijs.recipientEncryptedKeysMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientEncryptedKeys")(value.asInstanceOf[js.Any])
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
    def withUkm(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ukm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUkm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ukm")(js.undefined)
        ret
    }
  }
  
}

