package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteOpResultObject extends js.Object {
  
  var deletedCount: js.UndefOr[scala.Double] = js.native
  
  var insertedCount: js.UndefOr[scala.Double] = js.native
  
  var insertedIds: js.UndefOr[NumberDictionary[js.Any]] = js.native
  
  var matchedCount: js.UndefOr[scala.Double] = js.native
  
  var modifiedCount: js.UndefOr[scala.Double] = js.native
  
  var result: js.UndefOr[js.Any] = js.native
  
  var upsertedCount: js.UndefOr[scala.Double] = js.native
  
  var upsertedIds: js.UndefOr[NumberDictionary[js.Any]] = js.native
}
object BulkWriteOpResultObject {
  
  @scala.inline
  def apply(): BulkWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkWriteOpResultObject]
  }
  
  @scala.inline
  implicit class BulkWriteOpResultObjectOps[Self <: BulkWriteOpResultObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeletedCount(value: scala.Double): Self = this.set("deletedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedCount: Self = this.set("deletedCount", js.undefined)
    
    @scala.inline
    def setInsertedCount(value: scala.Double): Self = this.set("insertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertedCount: Self = this.set("insertedCount", js.undefined)
    
    @scala.inline
    def setInsertedIds(value: NumberDictionary[js.Any]): Self = this.set("insertedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertedIds: Self = this.set("insertedIds", js.undefined)
    
    @scala.inline
    def setMatchedCount(value: scala.Double): Self = this.set("matchedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchedCount: Self = this.set("matchedCount", js.undefined)
    
    @scala.inline
    def setModifiedCount(value: scala.Double): Self = this.set("modifiedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedCount: Self = this.set("modifiedCount", js.undefined)
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setUpsertedCount(value: scala.Double): Self = this.set("upsertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsertedCount: Self = this.set("upsertedCount", js.undefined)
    
    @scala.inline
    def setUpsertedIds(value: NumberDictionary[js.Any]): Self = this.set("upsertedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsertedIds: Self = this.set("upsertedIds", js.undefined)
  }
}
