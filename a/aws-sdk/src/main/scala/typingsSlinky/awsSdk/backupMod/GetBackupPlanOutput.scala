package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackupPlanOutput extends StObject {
  
  /**
    * Contains a list of BackupOptions for each resource type. The list is populated only if the advanced option is set for the backup plan.
    */
  var AdvancedBackupSettings: js.UndefOr[typingsSlinky.awsSdk.backupMod.AdvancedBackupSettings] = js.native
  
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: js.UndefOr[typingsSlinky.awsSdk.backupMod.BackupPlan] = js.native
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.native
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  
  /**
    * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of running the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
  
  /**
    * The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value of DeletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var DeletionDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The last time a job to back up resources was run with this backup plan. A date and time, in Unix format and Coordinated Universal Time (UTC). The value of LastExecutionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot be edited.
    */
  var VersionId: js.UndefOr[String] = js.native
}
object GetBackupPlanOutput {
  
  @scala.inline
  def apply(): GetBackupPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupPlanOutput]
  }
  
  @scala.inline
  implicit class GetBackupPlanOutputMutableBuilder[Self <: GetBackupPlanOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvancedBackupSettings(value: AdvancedBackupSettings): Self = StObject.set(x, "AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "AdvancedBackupSettings", js.undefined)
    
    @scala.inline
    def setAdvancedBackupSettingsVarargs(value: AdvancedBackupSetting*): Self = StObject.set(x, "AdvancedBackupSettings", js.Array(value :_*))
    
    @scala.inline
    def setBackupPlan(value: BackupPlan): Self = StObject.set(x, "BackupPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanArn(value: ARN): Self = StObject.set(x, "BackupPlanArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanArnUndefined: Self = StObject.set(x, "BackupPlanArn", js.undefined)
    
    @scala.inline
    def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanIdUndefined: Self = StObject.set(x, "BackupPlanId", js.undefined)
    
    @scala.inline
    def setBackupPlanUndefined: Self = StObject.set(x, "BackupPlan", js.undefined)
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: String): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    @scala.inline
    def setLastExecutionDate(value: js.Date): Self = StObject.set(x, "LastExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastExecutionDateUndefined: Self = StObject.set(x, "LastExecutionDate", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
