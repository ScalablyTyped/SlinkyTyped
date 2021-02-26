package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBackupVaultAccessPolicyInput extends StObject {
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typingsSlinky.awsSdk.backupMod.BackupVaultName = js.native
}
object DeleteBackupVaultAccessPolicyInput {
  
  @scala.inline
  def apply(BackupVaultName: BackupVaultName): DeleteBackupVaultAccessPolicyInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupVaultAccessPolicyInput]
  }
  
  @scala.inline
  implicit class DeleteBackupVaultAccessPolicyInputMutableBuilder[Self <: DeleteBackupVaultAccessPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
  }
}
