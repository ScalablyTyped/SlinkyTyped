package typingsSlinky.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackupMetadata extends StObject {
  
  /** If set, the time at which this operation finished or was cancelled. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The name of the backup being created. */
  var name: js.UndefOr[String] = js.native
  
  /** The name of the table the backup is created from. */
  var sourceTable: js.UndefOr[String] = js.native
  
  /** The time at which this operation started. */
  var startTime: js.UndefOr[String] = js.native
}
object CreateBackupMetadata {
  
  @scala.inline
  def apply(): CreateBackupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupMetadata]
  }
  
  @scala.inline
  implicit class CreateBackupMetadataMutableBuilder[Self <: CreateBackupMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSourceTable(value: String): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
