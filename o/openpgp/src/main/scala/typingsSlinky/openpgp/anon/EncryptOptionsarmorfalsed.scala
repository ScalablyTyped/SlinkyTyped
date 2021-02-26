package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.mod.UserID
import typingsSlinky.openpgp.mod.enums.compression
import typingsSlinky.openpgp.openpgpBooleans.`false`
import typingsSlinky.openpgp.openpgpStrings.node
import typingsSlinky.openpgp.openpgpStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.EncryptOptions & {  armor :false,   detached :false | undefined} */
@js.native
trait EncryptOptionsarmorfalsed extends StObject {
  
  /**
    * (optional) if the return values should be ascii armored or the message/signature objects
    */
  var armor: js.UndefOr[Boolean] with `false` = js.native
  
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
  var detached: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
  
  /**
    * (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.native
  
  /**
    * message to be encrypted as created by openpgp.message.fromText or openpgp.message.fromBinary
    */
  var message: typingsSlinky.openpgp.mod.message.Message = js.native
  
  /**
    * (optional) array of passwords or a single password to encrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[_]] = js.native
  
  /**
    * (optional) private keys for signing. If omitted message will not be signed
    */
  var privateKeys: js.UndefOr[typingsSlinky.openpgp.mod.key.Key | js.Array[_]] = js.native
  
  /**
    * (optional) array of keys or single key, used to encrypt the message
    */
  var publicKeys: js.UndefOr[typingsSlinky.openpgp.mod.key.Key | js.Array[_]] = js.native
  
  /**
    * (optional) if the unencrypted session key should be added to returned object
    */
  var returnSessionKey: js.UndefOr[Boolean] = js.native
  
  /**
    * (optional) session key in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKey: js.UndefOr[Algorithm] = js.native
  
  /**
    * (optional) a detached signature to add to the encrypted message
    */
  var signature: js.UndefOr[typingsSlinky.openpgp.mod.signature.Signature] = js.native
  
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
object EncryptOptionsarmorfalsed {
  
  @scala.inline
  def apply(
    armor: js.UndefOr[Boolean] with `false`,
    detached: js.UndefOr[Boolean] with js.UndefOr[`false`],
    message: typingsSlinky.openpgp.mod.message.Message
  ): EncryptOptionsarmorfalsed = {
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptOptionsarmorfalsed]
  }
  
  @scala.inline
  implicit class EncryptOptionsarmorfalsedMutableBuilder[Self <: EncryptOptionsarmorfalsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArmor(value: js.UndefOr[Boolean] with `false`): Self = StObject.set(x, "armor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDetached(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUserIds(value: js.Array[UserID]): Self = StObject.set(x, "fromUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUserIdsUndefined: Self = StObject.set(x, "fromUserIds", js.undefined)
    
    @scala.inline
    def setFromUserIdsVarargs(value: UserID*): Self = StObject.set(x, "fromUserIds", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: typingsSlinky.openpgp.mod.message.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswords(value: String | js.Array[_]): Self = StObject.set(x, "passwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordsUndefined: Self = StObject.set(x, "passwords", js.undefined)
    
    @scala.inline
    def setPasswordsVarargs(value: js.Any*): Self = StObject.set(x, "passwords", js.Array(value :_*))
    
    @scala.inline
    def setPrivateKeys(value: typingsSlinky.openpgp.mod.key.Key | js.Array[_]): Self = StObject.set(x, "privateKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeysUndefined: Self = StObject.set(x, "privateKeys", js.undefined)
    
    @scala.inline
    def setPrivateKeysVarargs(value: js.Any*): Self = StObject.set(x, "privateKeys", js.Array(value :_*))
    
    @scala.inline
    def setPublicKeys(value: typingsSlinky.openpgp.mod.key.Key | js.Array[_]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    @scala.inline
    def setPublicKeysVarargs(value: js.Any*): Self = StObject.set(x, "publicKeys", js.Array(value :_*))
    
    @scala.inline
    def setReturnSessionKey(value: Boolean): Self = StObject.set(x, "returnSessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnSessionKeyUndefined: Self = StObject.set(x, "returnSessionKey", js.undefined)
    
    @scala.inline
    def setSessionKey(value: Algorithm): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
    
    @scala.inline
    def setSignature(value: typingsSlinky.openpgp.mod.signature.Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setStreaming(value: web | node | `false`): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
    
    @scala.inline
    def setToUserIds(value: js.Array[UserID]): Self = StObject.set(x, "toUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUserIdsUndefined: Self = StObject.set(x, "toUserIds", js.undefined)
    
    @scala.inline
    def setToUserIdsVarargs(value: UserID*): Self = StObject.set(x, "toUserIds", js.Array(value :_*))
    
    @scala.inline
    def setWildcard(value: Boolean): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
  }
}
