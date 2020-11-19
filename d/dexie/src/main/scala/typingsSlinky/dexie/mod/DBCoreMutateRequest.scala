package typingsSlinky.dexie.mod

import typingsSlinky.dexie.dexieStrings.add
import typingsSlinky.dexie.dexieStrings.delete
import typingsSlinky.dexie.dexieStrings.deleteRange
import typingsSlinky.dexie.dexieStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dexie.mod.DBCoreAddRequest
  - typingsSlinky.dexie.mod.DBCorePutRequest
  - typingsSlinky.dexie.mod.DBCoreDeleteRequest
  - typingsSlinky.dexie.mod.DBCoreDeleteRangeRequest
*/
trait DBCoreMutateRequest extends js.Object
object DBCoreMutateRequest {
  
  @scala.inline
  def DBCoreAddRequest(trans: DBCoreTransaction, `type`: add, values: js.Array[_]): DBCoreMutateRequest = {
    val __obj = js.Dynamic.literal(trans = trans.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateRequest]
  }
  
  @scala.inline
  def DBCorePutRequest(trans: DBCoreTransaction, `type`: put, values: js.Array[_]): DBCoreMutateRequest = {
    val __obj = js.Dynamic.literal(trans = trans.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateRequest]
  }
  
  @scala.inline
  def DBCoreDeleteRequest(keys: js.Array[_], trans: DBCoreTransaction, `type`: delete): DBCoreMutateRequest = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateRequest]
  }
  
  @scala.inline
  def DBCoreDeleteRangeRequest(range: DBCoreKeyRange, trans: DBCoreTransaction, `type`: deleteRange): DBCoreMutateRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreMutateRequest]
  }
}
