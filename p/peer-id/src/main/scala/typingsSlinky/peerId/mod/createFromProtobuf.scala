package typingsSlinky.peerId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-id", "createFromProtobuf")
@js.native
object createFromProtobuf extends js.Object {
  
  def apply(buf: String): js.Promise[PeerId] = js.native
  /**
    * Create PeerId from Protobuf bytes.
    * @param buf Protobuf bytes, as Uint8Array or hex-encoded string.
    */
  def apply(buf: js.typedarray.Uint8Array): js.Promise[PeerId] = js.native
}
