package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.UserID
import typingsSlinky.openpgp.mod.enums.compression
import typingsSlinky.openpgp.mod.key.Key
import typingsSlinky.openpgp.mod.message.Message
import typingsSlinky.openpgp.mod.signature.Signature
import typingsSlinky.openpgp.openpgpBooleans.`false`
import typingsSlinky.openpgp.openpgpBooleans.`true`
import typingsSlinky.openpgp.openpgpStrings.node
import typingsSlinky.openpgp.openpgpStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.EncryptOptions & {  armor  :false,   detached  :true} */
@js.native
trait EncryptOptionsarmorfalsedArmor extends js.Object {
  /**
    * (optional) if the return values should be ascii armored or the message/signature objects
    */
  var armor: js.UndefOr[Boolean with `false`] = js.native
  /**
    * (optional) which compression algorithm to compress the message with, defaults to what is specified in config
    */
  var compression: js.UndefOr[typingsSlinky.openpgp.mod.enums.compression] = js.native
  /**
    * (optional) override the creation date of the message signature
    */
  var date: js.UndefOr[js.Date] = js.native
  /**
    * (optional) if the signature should be detached (if true, signature will be added to returned object)
    */
  var detached: js.UndefOr[Boolean with `true`] = js.native
  /**
    * (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.native
  /**
    * message to be encrypted as created by openpgp.message.fromText or openpgp.message.fromBinary
    */
  var message: Message = js.native
  /**
    * (optional) array of passwords or a single password to encrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[_]] = js.native
  /**
    * (optional) private keys for signing. If omitted message will not be signed
    */
  var privateKeys: js.UndefOr[Key | js.Array[_]] = js.native
  /**
    * (optional) array of keys or single key, used to encrypt the message
    */
  var publicKeys: js.UndefOr[Key | js.Array[_]] = js.native
  /**
    * (optional) if the unencrypted session key should be added to returned object
    */
  var returnSessionKey: js.UndefOr[Boolean] = js.native
  /**
    * (optional) session key in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKey: js.UndefOr[AnonAlgorithm] = js.native
  /**
    * (optional) a detached signature to add to the encrypted message
    */
  var signature: js.UndefOr[Signature] = js.native
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.native
  /**
    * (optional) array of user IDs to encrypt for, one per key in `publicKeys`, e.g. [ { name:'Robert Receiver', email:'robert@openpgp.org' }]
    */
  var toUserIds: js.UndefOr[js.Array[UserID]] = js.native
  /**
    * (optional) use a key ID of 0 instead of the public key IDs
    */
  var wildcard: js.UndefOr[Boolean] = js.native
}

object EncryptOptionsarmorfalsedArmor {
  @scala.inline
  def apply(message: Message): EncryptOptionsarmorfalsedArmor = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOptionsarmorfalsedArmor]
  }
  @scala.inline
  implicit class EncryptOptionsarmorfalsedArmorOps[Self <: EncryptOptionsarmorfalsedArmor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArmor(value: Boolean with `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArmor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("armor")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: compression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDetached(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
        ret
    }
    @scala.inline
    def withFromUserIds(value: js.Array[UserID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromUserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUserIds")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswords(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwords")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKeys(value: Key | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeys(value: Key | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnSessionKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSessionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnSessionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSessionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionKey(value: AnonAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: Signature): Self = {
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
    def withStreaming(value: web | node | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streaming")(js.undefined)
        ret
    }
    @scala.inline
    def withToUserIds(value: js.Array[UserID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToUserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUserIds")(js.undefined)
        ret
    }
    @scala.inline
    def withWildcard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWildcard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(js.undefined)
        ret
    }
  }
  
}

