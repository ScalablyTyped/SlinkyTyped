package typingsSlinky.ipfsCore.rmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ipfsCore.rmMod.RmSucceess
  - typingsSlinky.ipfsCore.rmMod.RmFailure
*/
trait RmResult extends js.Object
object RmResult {
  
  @scala.inline
  def RmSucceess(cid: typingsSlinky.cids.mod.^): RmResult = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmResult]
  }
  
  @scala.inline
  def RmFailure(cid: typingsSlinky.cids.mod.^, error: js.Error): RmResult = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmResult]
  }
}
