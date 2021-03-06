package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `taskHistoryRecordCollection.toJSON()`. */
@js.native
trait TaskHistoryRecordCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[TaskHistoryRecordData]] = js.native
}
object TaskHistoryRecordCollectionData {
  
  @scala.inline
  def apply(): TaskHistoryRecordCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskHistoryRecordCollectionData]
  }
  
  @scala.inline
  implicit class TaskHistoryRecordCollectionDataMutableBuilder[Self <: TaskHistoryRecordCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[TaskHistoryRecordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TaskHistoryRecordData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
