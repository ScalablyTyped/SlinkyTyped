package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationTaskSummary extends StObject {
  
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.MigrationTaskName] = js.native
  
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ProgressPercent] = js.native
  
  /**
    * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all updates made by the tool.
    */
  var ProgressUpdateStream: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ProgressUpdateStream] = js.native
  
  /**
    * Status of the task.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.Status] = js.native
  
  /**
    * Detail information of what is being done within the overall status state.
    */
  var StatusDetail: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.StatusDetail] = js.native
  
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[js.Date] = js.native
}
object MigrationTaskSummary {
  
  @scala.inline
  def apply(): MigrationTaskSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationTaskSummary]
  }
  
  @scala.inline
  implicit class MigrationTaskSummaryMutableBuilder[Self <: MigrationTaskSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationTaskNameUndefined: Self = StObject.set(x, "MigrationTaskName", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: ProgressPercent): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUpdateStreamUndefined: Self = StObject.set(x, "ProgressUpdateStream", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetail(value: StatusDetail): Self = StObject.set(x, "StatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailUndefined: Self = StObject.set(x, "StatusDetail", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "UpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDateTimeUndefined: Self = StObject.set(x, "UpdateDateTime", js.undefined)
  }
}
