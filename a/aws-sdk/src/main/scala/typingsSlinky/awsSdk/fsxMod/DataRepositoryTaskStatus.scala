package typingsSlinky.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRepositoryTaskStatus extends StObject {
  
  /**
    * A running total of the number of files that the task failed to process.
    */
  var FailedCount: js.UndefOr[typingsSlinky.awsSdk.fsxMod.FailedCount] = js.native
  
  /**
    * The time at which the task status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * A running total of the number of files that the task has successfully processed.
    */
  var SucceededCount: js.UndefOr[typingsSlinky.awsSdk.fsxMod.SucceededCount] = js.native
  
  /**
    * The total number of files that the task will process. While a task is executing, the sum of SucceededCount plus FailedCount may not equal TotalCount. When the task is complete, TotalCount equals the sum of SucceededCount plus FailedCount.
    */
  var TotalCount: js.UndefOr[typingsSlinky.awsSdk.fsxMod.TotalCount] = js.native
}
object DataRepositoryTaskStatus {
  
  @scala.inline
  def apply(): DataRepositoryTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryTaskStatus]
  }
  
  @scala.inline
  implicit class DataRepositoryTaskStatusMutableBuilder[Self <: DataRepositoryTaskStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedCount(value: FailedCount): Self = StObject.set(x, "FailedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedCountUndefined: Self = StObject.set(x, "FailedCount", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setSucceededCount(value: SucceededCount): Self = StObject.set(x, "SucceededCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededCountUndefined: Self = StObject.set(x, "SucceededCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
