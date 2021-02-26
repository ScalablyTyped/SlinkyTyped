package typingsSlinky.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backup extends StObject {
  
  /** Output only. `end_time` is the time that the backup was finished. The row data in the backup will be no newer than this timestamp. */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Required. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 30 days from the time the request is received. Once the
    * `expire_time` has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
    */
  var expireTime: js.UndefOr[String] = js.native
  
  /**
    * A globally unique identifier for the backup which cannot be changed. Values are of the form `projects/{project}/instances/{instance}/clusters/{cluster}/ backups/_a-zA-Z0-9*` The
    * final segment of the name must be between 1 and 50 characters in length. The backup is stored in the cluster identified by the prefix of the backup name of the form
    * `projects/{project}/instances/{instance}/clusters/{cluster}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Size of the backup in bytes. */
  var sizeBytes: js.UndefOr[String] = js.native
  
  /**
    * Required. Immutable. Name of the table from which this backup was created. This needs to be in the same instance as the backup. Values are of the form
    * `projects/{project}/instances/{instance}/tables/{source_table}`.
    */
  var sourceTable: js.UndefOr[String] = js.native
  
  /**
    * Output only. `start_time` is the time that the backup was started (i.e. approximately the time the CreateBackup request is received). The row data in this backup will be no older
    * than this timestamp.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. The current state of the backup. */
  var state: js.UndefOr[String] = js.native
}
object Backup {
  
  @scala.inline
  def apply(): Backup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backup]
  }
  
  @scala.inline
  implicit class BackupMutableBuilder[Self <: Backup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    @scala.inline
    def setSourceTable(value: String): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
