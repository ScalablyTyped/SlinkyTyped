package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecoveryPointCreator extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.native
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  
  /**
    * Version IDs are unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be edited.
    */
  var BackupPlanVersion: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies a rule used to schedule the backup of a selection of resources.
    */
  var BackupRuleId: js.UndefOr[String] = js.native
}
object RecoveryPointCreator {
  
  @scala.inline
  def apply(): RecoveryPointCreator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryPointCreator]
  }
  
  @scala.inline
  implicit class RecoveryPointCreatorMutableBuilder[Self <: RecoveryPointCreator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanArn(value: ARN): Self = StObject.set(x, "BackupPlanArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanArnUndefined: Self = StObject.set(x, "BackupPlanArn", js.undefined)
    
    @scala.inline
    def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanIdUndefined: Self = StObject.set(x, "BackupPlanId", js.undefined)
    
    @scala.inline
    def setBackupPlanVersion(value: String): Self = StObject.set(x, "BackupPlanVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanVersionUndefined: Self = StObject.set(x, "BackupPlanVersion", js.undefined)
    
    @scala.inline
    def setBackupRuleId(value: String): Self = StObject.set(x, "BackupRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRuleIdUndefined: Self = StObject.set(x, "BackupRuleId", js.undefined)
  }
}
