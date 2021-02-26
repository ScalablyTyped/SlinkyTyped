package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreSummary extends StObject {
  
  /**
    * Point in time or source backup time.
    */
  var RestoreDateTime: js.Date = js.native
  
  /**
    * Indicates if a restore is in progress or not.
    */
  var RestoreInProgress: typingsSlinky.awsSdk.dynamodbMod.RestoreInProgress = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the backup from which the table was restored.
    */
  var SourceBackupArn: js.UndefOr[BackupArn] = js.native
  
  /**
    * The ARN of the source table of the backup that is being restored.
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.native
}
object RestoreSummary {
  
  @scala.inline
  def apply(RestoreDateTime: js.Date, RestoreInProgress: RestoreInProgress): RestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSummary]
  }
  
  @scala.inline
  implicit class RestoreSummaryMutableBuilder[Self <: RestoreSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestoreDateTime(value: js.Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreInProgress(value: RestoreInProgress): Self = StObject.set(x, "RestoreInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupArn(value: BackupArn): Self = StObject.set(x, "SourceBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupArnUndefined: Self = StObject.set(x, "SourceBackupArn", js.undefined)
    
    @scala.inline
    def setSourceTableArn(value: TableArn): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
  }
}
