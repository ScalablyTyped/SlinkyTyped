package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBackupVaultInput extends StObject {
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: String = js.native
}
object DeleteBackupVaultInput {
  
  @scala.inline
  def apply(BackupVaultName: String): DeleteBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupVaultInput]
  }
  
  @scala.inline
  implicit class DeleteBackupVaultInputMutableBuilder[Self <: DeleteBackupVaultInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupVaultName(value: String): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
  }
}
