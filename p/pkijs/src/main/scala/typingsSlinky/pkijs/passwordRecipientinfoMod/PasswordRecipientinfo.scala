package typingsSlinky.pkijs.passwordRecipientinfoMod

import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordRecipientinfo extends js.Object {
  var encryptedKey: OctetString = js.native
  var keyDerivationAlgorithm: js.UndefOr[typingsSlinky.pkijs.algorithmIdentifierMod.default] = js.native
  var keyEncryptionAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var password: js.typedarray.ArrayBuffer = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PasswordRecipientinfo {
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    password: js.typedarray.ArrayBuffer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): PasswordRecipientinfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRecipientinfo]
  }
  @scala.inline
  implicit class PasswordRecipientinfoOps[Self <: PasswordRecipientinfo] (val x: Self) extends AnyVal {
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
    def withPassword(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
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
    def withKeyDerivationAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDerivationAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyDerivationAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDerivationAlgorithm")(js.undefined)
        ret
    }
  }
  
}

