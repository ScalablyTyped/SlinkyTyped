package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupPolicy extends StObject {
  
  /**
    * Describes the status of the file system's backup policy.     ENABLED - EFS is automatically backing up the file system.      ENABLING - EFS is turning on automatic backups for the file system.      DISABLED - automatic back ups are turned off for the file system.      DISABLED - EFS is turning off automatic backups for the file system.   
    */
  var Status: typingsSlinky.awsSdk.efsMod.Status = js.native
}
object BackupPolicy {
  
  @scala.inline
  def apply(Status: Status): BackupPolicy = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPolicy]
  }
  
  @scala.inline
  implicit class BackupPolicyMutableBuilder[Self <: BackupPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
