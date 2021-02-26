package typingsSlinky.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreBackupRequest extends StObject {
  
  /**
    * The ID of the backup to be restored. To find the ID of a backup, use the DescribeBackups operation.
    */
  var BackupId: typingsSlinky.awsSdk.cloudhsmv2Mod.BackupId = js.native
}
object RestoreBackupRequest {
  
  @scala.inline
  def apply(BackupId: BackupId): RestoreBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreBackupRequest]
  }
  
  @scala.inline
  implicit class RestoreBackupRequestMutableBuilder[Self <: RestoreBackupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
  }
}
