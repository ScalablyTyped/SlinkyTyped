package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBInstanceAutomatedBackupMessage extends StObject {
  
  /**
    *  A list of DBInstanceAutomatedBackup instances. 
    */
  var DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.native
}
object DBInstanceAutomatedBackupMessage {
  
  @scala.inline
  def apply(): DBInstanceAutomatedBackupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceAutomatedBackupMessage]
  }
  
  @scala.inline
  implicit class DBInstanceAutomatedBackupMessageMutableBuilder[Self <: DBInstanceAutomatedBackupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceAutomatedBackups(value: DBInstanceAutomatedBackupList): Self = StObject.set(x, "DBInstanceAutomatedBackups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceAutomatedBackupsUndefined: Self = StObject.set(x, "DBInstanceAutomatedBackups", js.undefined)
    
    @scala.inline
    def setDBInstanceAutomatedBackupsVarargs(value: DBInstanceAutomatedBackup*): Self = StObject.set(x, "DBInstanceAutomatedBackups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
