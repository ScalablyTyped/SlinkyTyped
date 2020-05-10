package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.key.Key
import typingsSlinky.openpgp.mod.message.Message
import typingsSlinky.openpgp.mod.signature.Signature
import typingsSlinky.openpgp.openpgpBooleans.`false`
import typingsSlinky.openpgp.openpgpStrings.binary
import typingsSlinky.openpgp.openpgpStrings.node
import typingsSlinky.openpgp.openpgpStrings.utf8
import typingsSlinky.openpgp.openpgpStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.DecryptOptions & {  format  :'binary'} */
@js.native
trait DecryptOptionsformatbinar extends js.Object {
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[js.Date] = js.native
  /**
    * (optional) whether to return data as a string(Stream) or Uint8Array(Stream). If 'utf8' (the default), also normalize newlines.
    */
  var format: js.UndefOr[(utf8 | binary) with binary] = js.native
  /**
    * the message object with the encrypted data
    */
  var message: Message = js.native
  /**
    * (optional) passwords to decrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * (optional) private keys with decrypted secret key data or session key
    */
  var privateKeys: js.UndefOr[Key | js.Array[Key]] = js.native
  /**
    * (optional) array of public keys or single key, to verify signatures
    */
  var publicKeys: js.UndefOr[Key | js.Array[Key]] = js.native
  /**
    * (optional) session keys in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKeys: js.UndefOr[AnonAlgorithm | js.Array[AnonAlgorithm]] = js.native
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[Signature] = js.native
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.native
}

object DecryptOptionsformatbinar {
  @scala.inline
  def apply(message: Message): DecryptOptionsformatbinar = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptionsformatbinar]
  }
  @scala.inline
  implicit class DecryptOptionsformatbinarOps[Self <: DecryptOptionsformatbinar] (val x: Self) extends AnyVal {
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
    def withFormat(value: (utf8 | binary) with binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswords(value: String | js.Array[String]): Self = {
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
    def withPrivateKeys(value: Key | js.Array[Key]): Self = {
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
    def withPublicKeys(value: Key | js.Array[Key]): Self = {
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
    def withSessionKeys(value: AnonAlgorithm | js.Array[AnonAlgorithm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionKeys")(js.undefined)
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
  }
  
}

