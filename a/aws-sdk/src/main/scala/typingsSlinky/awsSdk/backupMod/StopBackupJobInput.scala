package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopBackupJobInput extends StObject {
  
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: String = js.native
}
object StopBackupJobInput {
  
  @scala.inline
  def apply(BackupJobId: String): StopBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBackupJobInput]
  }
  
  @scala.inline
  implicit class StopBackupJobInputMutableBuilder[Self <: StopBackupJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
  }
}
