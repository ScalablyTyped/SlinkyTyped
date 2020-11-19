package typingsSlinky.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackupPlanOutput extends js.Object {
  
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
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be edited.
    */
  var VersionId: js.UndefOr[String] = js.native
}
object CreateBackupPlanOutput {
  
  @scala.inline
  def apply(): CreateBackupPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupPlanOutput]
  }
  
  @scala.inline
  implicit class CreateBackupPlanOutputOps[Self <: CreateBackupPlanOutput] (val x: Self) extends AnyVal {
    
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
    def setBackupPlanArn(value: ARN): Self = this.set("BackupPlanArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupPlanArn: Self = this.set("BackupPlanArn", js.undefined)
    
    @scala.inline
    def setBackupPlanId(value: String): Self = this.set("BackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupPlanId: Self = this.set("BackupPlanId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}
