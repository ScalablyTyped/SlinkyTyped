package typingsSlinky.openpgp.mod.crypto

import typingsSlinky.openpgp.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see
  * @see
  */
@JSImport("openpgp", "crypto.hash")
@js.native
object hash extends js.Object {
  
  /**
    * Create a hash on the specified data using the specified algorithm
    * @param algo Hash algorithm type (see {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4})
    * @param data Data to be hashed
    * @returns hash value
    */
  def digest(algo: typingsSlinky.openpgp.mod.enums.hash, data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * Returns the hash size in bytes of the specified hash algorithm type
    * @param algo Hash algorithm type (See {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC 4880 9.4})
    * @returns Size in bytes of the resulting hash
    */
  def getHashByteLength(algo: typingsSlinky.openpgp.mod.enums.hash): Integer = js.native
  
  /**
    * @see module:md5
    */
  var md5: js.Any = js.native
  
  /**
    * @see hash.js
    */
  var ripemd: js.Any = js.native
  
  /**
    * @see asmCrypto
    */
  var sha1: js.Any = js.native
  
  /**
    * @see hash.js
    */
  var sha224: js.Any = js.native
  
  /**
    * @see asmCrypto
    */
  var sha256: js.Any = js.native
  
  /**
    * @see hash.js
    */
  var sha384: js.Any = js.native
  
  /**
    * @see asmCrypto
    */
  var sha512: js.Any = js.native
}
