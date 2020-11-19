package typingsSlinky.openpgp.mod.key

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "key.reformat")
@js.native
object reformat extends js.Object {
  
  /**
    * Reformats and signs an OpenPGP key with a given User ID. Currently only supports RSA keys.
    * @param options.privateKey The private key to reformat
    * @param options.keyType
    * @param options.userIds Assumes already in form of "User Name <username@email.com>"
    *        If array is used, the first userId is set as primary user Id
    * @param options.passphrase The passphrase used to encrypt the resulting private key
    * @param options.keyExpirationTime The number of seconds after the key creation time that the key expires
    * @param date Override the creation date of the key and the key signatures
    * @param subkeys (optional) options for each subkey, default to main key options. e.g. [ {sign: true, passphrase: '123'}]
    * @returns
    */
  def apply(date: js.Date, subkeys: js.Array[_]): js.Promise[Key] = js.native
}
