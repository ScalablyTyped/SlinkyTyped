package typingsSlinky.peerId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-id", "createFromPrivKey")
@js.native
object createFromPrivKey extends js.Object {
  
  def apply(key: String): js.Promise[PeerId] = js.native
  /**
    * Create PeerId from private key.
    * @param key Private key, as Uint8Array or base64-encoded string.
    */
  def apply(key: js.typedarray.Uint8Array): js.Promise[PeerId] = js.native
}
