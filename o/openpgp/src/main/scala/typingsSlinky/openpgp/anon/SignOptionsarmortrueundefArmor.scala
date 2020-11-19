package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.mod.UserID
import typingsSlinky.openpgp.mod.cleartext.CleartextMessage
import typingsSlinky.openpgp.openpgpBooleans.`false`
import typingsSlinky.openpgp.openpgpBooleans.`true`
import typingsSlinky.openpgp.openpgpStrings.node
import typingsSlinky.openpgp.openpgpStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.SignOptions & {  armor :true | undefined,   detached :true} */
@js.native
trait SignOptionsarmortrueundefArmor extends js.Object {
  
  /**
    * (optional) if the return value should be ascii armored or the message object
    */
  var armor: js.UndefOr[Boolean] with js.UndefOr[`true`] = js.native
  
  /**
    * (optional) override the creation date of the signature
    */
  var date: js.UndefOr[js.Date] = js.native
  
  /**
    * (optional) if the return value should contain a detached signature
    */
  var detached: js.UndefOr[Boolean] with `true` = js.native
  
  /**
    *  (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.native
  
  /**
    * (cleartext) message to be signed
    */
  var message: CleartextMessage | typingsSlinky.openpgp.mod.message.Message = js.native
  
  /**
    * array of keys or single key with decrypted secret key data to sign cleartext
    */
  var privateKeys: typingsSlinky.openpgp.mod.key.Key | js.Array[_] = js.native
  
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.native
}
object SignOptionsarmortrueundefArmor {
  
  @scala.inline
  def apply(
    armor: js.UndefOr[Boolean] with js.UndefOr[`true`],
    detached: js.UndefOr[Boolean] with `true`,
    message: CleartextMessage | typingsSlinky.openpgp.mod.message.Message,
    privateKeys: typingsSlinky.openpgp.mod.key.Key | js.Array[_]
  ): SignOptionsarmortrueundefArmor = {
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], privateKeys = privateKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptionsarmortrueundefArmor]
  }
  
  @scala.inline
  implicit class SignOptionsarmortrueundefArmorOps[Self <: SignOptionsarmortrueundefArmor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArmor(value: js.UndefOr[Boolean] with js.UndefOr[`true`]): Self = this.set("armor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetached(value: js.UndefOr[Boolean] with `true`): Self = this.set("detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: CleartextMessage | typingsSlinky.openpgp.mod.message.Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeysVarargs(value: js.Any*): Self = this.set("privateKeys", js.Array(value :_*))
    
    @scala.inline
    def setPrivateKeys(value: typingsSlinky.openpgp.mod.key.Key | js.Array[_]): Self = this.set("privateKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setFromUserIdsVarargs(value: UserID*): Self = this.set("fromUserIds", js.Array(value :_*))
    
    @scala.inline
    def setFromUserIds(value: js.Array[UserID]): Self = this.set("fromUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromUserIds: Self = this.set("fromUserIds", js.undefined)
    
    @scala.inline
    def setStreaming(value: web | node | `false`): Self = this.set("streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
  }
}
