package typingsSlinky.openpgp.mod.`type`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encoded symmetric key for ECDH
  */
@JSImport("openpgp", "type.ecdh_symkey")
@js.native
object ecdhSymkey extends js.Object {
  
  @js.native
  class ECDHSymmetricKey () extends js.Object {
    
    /**
      * Read an ECDHSymmetricKey from an Uint8Array
      * @param input Where to read the encoded symmetric key from
      * @returns Number of read bytes
      */
    def read(input: js.typedarray.Uint8Array): Double = js.native
    
    /**
      * Write an ECDHSymmetricKey as an Uint8Array
      * @returns An array containing the value
      */
    def write(): js.typedarray.Uint8Array = js.native
  }
}
