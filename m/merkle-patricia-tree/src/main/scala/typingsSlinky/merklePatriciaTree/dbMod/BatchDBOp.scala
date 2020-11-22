package typingsSlinky.merklePatriciaTree.dbMod

import typingsSlinky.merklePatriciaTree.merklePatriciaTreeStrings.del
import typingsSlinky.merklePatriciaTree.merklePatriciaTreeStrings.put
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.merklePatriciaTree.dbMod.PutBatch
  - typingsSlinky.merklePatriciaTree.dbMod.DelBatch
*/
trait BatchDBOp extends js.Object
object BatchDBOp {
  
  @scala.inline
  def PutBatch(key: Buffer, `type`: put, value: Buffer): BatchDBOp = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDBOp]
  }
  
  @scala.inline
  def DelBatch(key: Buffer, `type`: del): BatchDBOp = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDBOp]
  }
}
