package typingsSlinky.ipfsCore.gcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ipfsCore.gcMod.Err
  - typingsSlinky.ipfsCore.gcMod.BlockID
*/
trait Notification extends js.Object
object Notification {
  
  @scala.inline
  def Err(err: js.Error): Notification = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  def BlockID(cid: typingsSlinky.cids.mod.^): Notification = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}
