package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingModifiedRelationalDatabaseValues extends StObject {
  
  /**
    * A Boolean value indicating whether automated backup retention is enabled.
    */
  var backupRetentionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The database engine version.
    */
  var engineVersion: js.UndefOr[String] = js.native
  
  /**
    * The password for the master user of the database.
    */
  var masterUserPassword: js.UndefOr[String] = js.native
}
object PendingModifiedRelationalDatabaseValues {
  
  @scala.inline
  def apply(): PendingModifiedRelationalDatabaseValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedRelationalDatabaseValues]
  }
  
  @scala.inline
  implicit class PendingModifiedRelationalDatabaseValuesMutableBuilder[Self <: PendingModifiedRelationalDatabaseValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupRetentionEnabled(value: Boolean): Self = StObject.set(x, "backupRetentionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionEnabledUndefined: Self = StObject.set(x, "backupRetentionEnabled", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: String): Self = StObject.set(x, "masterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserPasswordUndefined: Self = StObject.set(x, "masterUserPassword", js.undefined)
  }
}
