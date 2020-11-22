package typingsSlinky.multibase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase", "decode")
@js.native
object decode extends js.Object {
  
  def apply(data: String): js.typedarray.Uint8Array = js.native
  /**
    * Takes a Uint8Array or string encoded with multibase header, decodes it and
    * returns the decoded buffer
    *
    * @param {Uint8Array|string} data
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    *
    */
  def apply(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}
