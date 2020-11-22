package typingsSlinky.peerId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("peer-id", "createFromCID")
@js.native
object createFromCID extends js.Object {
  
  def apply(cid: String): PeerId = js.native
  def apply(cid: js.Object): PeerId = js.native
  /**
    * Create PeerId from CID.
    * @param cid The CID.
    */
  def apply(cid: typingsSlinky.cids.mod.^): PeerId = js.native
  def apply(cid: js.typedarray.Uint8Array): PeerId = js.native
}
