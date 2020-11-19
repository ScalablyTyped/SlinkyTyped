package typingsSlinky.openpgp.mod.`type`

import typingsSlinky.openpgp.mod.enums.symmetric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implementation of type KDF parameters
  * {@link https://tools.ietf.org/html/rfc6637#section-7|RFC 6637 7}:
  * A key derivation function (KDF) is necessary to implement the EC
  * encryption.  The Concatenation Key Derivation Function (Approved
  * Alternative 1) [NIST-SP800-56A] with the KDF hash function that is
  * SHA2-256 [FIPS-180-3] or stronger is REQUIRED.
  */
@JSImport("openpgp", "type.kdf_params")
@js.native
object kdfParams extends js.Object {
  
  @js.native
  class KDFParams protected () extends js.Object {
    /**
      * @param hash Hash algorithm
      * @param cipher Symmetric algorithm
      */
    def this(hash: typingsSlinky.openpgp.mod.enums.hash, cipher: symmetric) = this()
    
    /**
      * Read KDFParams from an Uint8Array
      * @param input Where to read the KDFParams from
      * @returns Number of read bytes
      */
    def read(input: js.typedarray.Uint8Array): Double = js.native
    
    /**
      * Write KDFParams to an Uint8Array
      * @returns Array with the KDFParams value
      */
    def write(): js.typedarray.Uint8Array = js.native
  }
}
