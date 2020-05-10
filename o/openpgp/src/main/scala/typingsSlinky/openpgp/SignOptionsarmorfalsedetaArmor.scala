package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.UserID
import typingsSlinky.openpgp.mod.cleartext.CleartextMessage
import typingsSlinky.openpgp.mod.key.Key
import typingsSlinky.openpgp.mod.message.Message
import typingsSlinky.openpgp.openpgpBooleans.`false`
import typingsSlinky.openpgp.openpgpBooleans.`true`
import typingsSlinky.openpgp.openpgpStrings.node
import typingsSlinky.openpgp.openpgpStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.SignOptions & {  armor  :false,   detached  :true} */
@js.native
trait SignOptionsarmorfalsedetaArmor extends js.Object {
  /**
    * (optional) if the return value should be ascii armored or the message object
    */
  var armor: js.UndefOr[Boolean with `false`] = js.native
  /**
    * (optional) override the creation date of the signature
    */
  var date: js.UndefOr[js.Date] = js.native
  /**
    * (optional) if the return value should contain a detached signature
    */
  var detached: js.UndefOr[Boolean with `true`] = js.native
  /**
    *  (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.native
  /**
    * (cleartext) message to be signed
    */
  var message: CleartextMessage | Message = js.native
  /**
    * array of keys or single key with decrypted secret key data to sign cleartext
    */
  var privateKeys: Key | js.Array[_] = js.native
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.native
}

object SignOptionsarmorfalsedetaArmor {
  @scala.inline
  def apply(message: CleartextMessage | Message, privateKeys: Key | js.Array[_]): SignOptionsarmorfalsedetaArmor = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], privateKeys = privateKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptionsarmorfalsedetaArmor]
  }
  @scala.inline
  implicit class SignOptionsarmorfalsedetaArmorOps[Self <: SignOptionsarmorfalsedetaArmor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: CleartextMessage | Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeys(value: Key | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeys")(value.asInstanceOf[js.Any])
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

