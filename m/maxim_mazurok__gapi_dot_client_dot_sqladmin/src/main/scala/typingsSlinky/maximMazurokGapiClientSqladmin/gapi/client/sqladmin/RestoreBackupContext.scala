package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreBackupContext extends StObject {
  
  /** The ID of the backup run to restore from. */
  var backupRunId: js.UndefOr[String] = js.native
  
  /** The ID of the instance that the backup was taken from. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** This is always *sql#restoreBackupContext*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The full project ID of the source instance. */
  var project: js.UndefOr[String] = js.native
}
object RestoreBackupContext {
  
  @scala.inline
  def apply(): RestoreBackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreBackupContext]
  }
  
  @scala.inline
  implicit class RestoreBackupContextMutableBuilder[Self <: RestoreBackupContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupRunId(value: String): Self = StObject.set(x, "backupRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRunIdUndefined: Self = StObject.set(x, "backupRunId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
