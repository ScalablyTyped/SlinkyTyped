package typingsSlinky.multibase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase", "encodingFromData")
@js.native
object encodingFromData extends js.Object {
  
  /**
    * Get encoding from data
    *
    * @param {string|Uint8Array} data
    * @returns {Base}
    * @throws {Error} Will throw if the encoding is not supported
    */
  def apply(data: String): Base = js.native
  def apply(data: js.typedarray.Uint8Array): Base = js.native
}
