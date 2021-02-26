package typingsSlinky.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBackupJobInput extends StObject {
  
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: String = js.native
}
object DescribeBackupJobInput {
  
  @scala.inline
  def apply(BackupJobId: String): DescribeBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupJobInput]
  }
  
  @scala.inline
  implicit class DescribeBackupJobInputMutableBuilder[Self <: DescribeBackupJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
  }
}
