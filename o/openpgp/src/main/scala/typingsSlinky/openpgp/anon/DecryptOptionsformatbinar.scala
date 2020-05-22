package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.openpgpBooleans.`false`
import typingsSlinky.openpgp.openpgpStrings.binary
import typingsSlinky.openpgp.openpgpStrings.node
import typingsSlinky.openpgp.openpgpStrings.utf8
import typingsSlinky.openpgp.openpgpStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.DecryptOptions & {  format  :'binary'} */
trait DecryptOptionsformatbinar extends js.Object {
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[js.Date] = js.undefined
  /**
    * (optional) whether to return data as a string(Stream) or Uint8Array(Stream). If 'utf8' (the default), also normalize newlines.
    */
  var format: js.UndefOr[(utf8 | binary) with binary] = js.undefined
  /**
    * the message object with the encrypted data
    */
  var message: typingsSlinky.openpgp.mod.message.Message
  /**
    * (optional) passwords to decrypt the message
    */
  var passwords: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * (optional) private keys with decrypted secret key data or session key
    */
  var privateKeys: js.UndefOr[typingsSlinky.openpgp.mod.key.Key | js.Array[typingsSlinky.openpgp.mod.key.Key]] = js.undefined
  /**
    * (optional) array of public keys or single key, to verify signatures
    */
  var publicKeys: js.UndefOr[typingsSlinky.openpgp.mod.key.Key | js.Array[typingsSlinky.openpgp.mod.key.Key]] = js.undefined
  /**
    * (optional) session keys in the form: { data:Uint8Array, algorithm:String }
    */
  var sessionKeys: js.UndefOr[Algorithm | js.Array[Algorithm]] = js.undefined
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[typingsSlinky.openpgp.mod.signature.Signature] = js.undefined
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}

object DecryptOptionsformatbinar {
  @scala.inline
  def apply(
    message: typingsSlinky.openpgp.mod.message.Message,
    date: js.Date = null,
    format: (utf8 | binary) with binary = null,
    passwords: String | js.Array[String] = null,
    privateKeys: typingsSlinky.openpgp.mod.key.Key | js.Array[typingsSlinky.openpgp.mod.key.Key] = null,
    publicKeys: typingsSlinky.openpgp.mod.key.Key | js.Array[typingsSlinky.openpgp.mod.key.Key] = null,
    sessionKeys: Algorithm | js.Array[Algorithm] = null,
    signature: typingsSlinky.openpgp.mod.signature.Signature = null,
    streaming: web | node | `false` = null
  ): DecryptOptionsformatbinar = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (passwords != null) __obj.updateDynamic("passwords")(passwords.asInstanceOf[js.Any])
    if (privateKeys != null) __obj.updateDynamic("privateKeys")(privateKeys.asInstanceOf[js.Any])
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (sessionKeys != null) __obj.updateDynamic("sessionKeys")(sessionKeys.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptionsformatbinar]
  }
}

