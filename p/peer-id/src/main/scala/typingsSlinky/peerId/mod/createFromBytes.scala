package typingsSlinky.peerId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-id", "createFromBytes")
@js.native
object createFromBytes extends js.Object {
  
  /**
    * Create PeerId from raw bytes.
    * @param buf The raw bytes.
    */
  def apply(buf: js.typedarray.Uint8Array): PeerId = js.native
}
