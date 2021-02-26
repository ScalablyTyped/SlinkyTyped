package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.Collation
import typingsSlinky.mongodb.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.BulkWriteInsertOneOperation[TSchema]
  - typingsSlinky.mongodb.mod.BulkWriteUpdateOneOperation[TSchema]
  - typingsSlinky.mongodb.mod.BulkWriteUpdateManyOperation[TSchema]
  - typingsSlinky.mongodb.mod.BulkWriteReplaceOneOperation[TSchema]
  - typingsSlinky.mongodb.mod.BulkWriteDeleteOneOperation[TSchema]
  - typingsSlinky.mongodb.mod.BulkWriteDeleteManyOperation[TSchema]
*/
trait BulkWriteOperation[TSchema] extends StObject
object BulkWriteOperation {
  
  @scala.inline
  def BulkWriteDeleteManyOperation[TSchema](deleteMany: BulkWriteDeleteOperation[TSchema]): typingsSlinky.mongodb.mod.BulkWriteDeleteManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.BulkWriteDeleteManyOperation[TSchema]]
  }
  
  @scala.inline
  def BulkWriteDeleteOneOperation[TSchema](deleteOne: BulkWriteDeleteOperation[TSchema]): typingsSlinky.mongodb.mod.BulkWriteDeleteOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.BulkWriteDeleteOneOperation[TSchema]]
  }
  
  @scala.inline
  def BulkWriteInsertOneOperation[TSchema](insertOne: Document[TSchema]): typingsSlinky.mongodb.mod.BulkWriteInsertOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.BulkWriteInsertOneOperation[TSchema]]
  }
  
  @scala.inline
  def BulkWriteReplaceOneOperation[TSchema](replaceOne: Collation[TSchema]): typingsSlinky.mongodb.mod.BulkWriteReplaceOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.BulkWriteReplaceOneOperation[TSchema]]
  }
  
  @scala.inline
  def BulkWriteUpdateManyOperation[TSchema](updateMany: BulkWriteUpdateOperation[TSchema]): typingsSlinky.mongodb.mod.BulkWriteUpdateManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.BulkWriteUpdateManyOperation[TSchema]]
  }
  
  @scala.inline
  def BulkWriteUpdateOneOperation[TSchema](updateOne: BulkWriteUpdateOperation[TSchema]): typingsSlinky.mongodb.mod.BulkWriteUpdateOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mongodb.mod.BulkWriteUpdateOneOperation[TSchema]]
  }
}
