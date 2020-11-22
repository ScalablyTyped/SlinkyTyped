package typingsSlinky.multibase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase", "encode")
@js.native
object encode extends js.Object {
  
  /**
    * Encode data with the specified base and add the multibase prefix.
    *
    * @param {BaseNameOrCode} nameOrCode - The multibase name or code number.
    * @param {Uint8Array} buf - The data to be encoded.
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    *
    */
  def apply(nameOrCode: BaseNameOrCode, buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}
