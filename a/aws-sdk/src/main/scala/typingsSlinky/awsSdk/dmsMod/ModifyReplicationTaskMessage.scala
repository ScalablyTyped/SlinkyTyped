package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationTaskMessage extends StObject {
  
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”  When you use this task setting with a source PostgreSQL database, a logical replication slot should already be created and associated with the source endpoint. You can verify this by setting the slotName extra connection attribute to the name of this logical replication slot. For more information, see Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS. 
    */
  var CdcStartPosition: js.UndefOr[String] = js.native
  
  /**
    * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an error. Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
    */
  var CdcStartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:2018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 2018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.native
  
  /**
    * The migration type. Valid values: full-load | cdc | full-load-and-cdc 
    */
  var MigrationType: js.UndefOr[MigrationTypeValue] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: String = js.native
  
  /**
    * The replication task identifier. Constraints:   Must contain 1-255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.native
  
  /**
    * JSON file that contains settings for the task, such as task metadata settings.
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.native
  
  /**
    * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the path with file://. When working with the DMS API, provide the JSON as the parameter value, for example: --table-mappings file://mappingfile.json 
    */
  var TableMappings: js.UndefOr[String] = js.native
  
  /**
    * Supplemental information that the task requires to migrate the data for certain source and target endpoints. For more information, see Specifying Supplemental Data for Task Settings in the AWS Database Migration Service User Guide. 
    */
  var TaskData: js.UndefOr[String] = js.native
}
object ModifyReplicationTaskMessage {
  
  @scala.inline
  def apply(ReplicationTaskArn: String): ModifyReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationTaskMessage]
  }
  
  @scala.inline
  implicit class ModifyReplicationTaskMessageMutableBuilder[Self <: ModifyReplicationTaskMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdcStartPosition(value: String): Self = StObject.set(x, "CdcStartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdcStartPositionUndefined: Self = StObject.set(x, "CdcStartPosition", js.undefined)
    
    @scala.inline
    def setCdcStartTime(value: js.Date): Self = StObject.set(x, "CdcStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdcStartTimeUndefined: Self = StObject.set(x, "CdcStartTime", js.undefined)
    
    @scala.inline
    def setCdcStopPosition(value: String): Self = StObject.set(x, "CdcStopPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdcStopPositionUndefined: Self = StObject.set(x, "CdcStopPosition", js.undefined)
    
    @scala.inline
    def setMigrationType(value: MigrationTypeValue): Self = StObject.set(x, "MigrationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationTypeUndefined: Self = StObject.set(x, "MigrationType", js.undefined)
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskIdentifier(value: String): Self = StObject.set(x, "ReplicationTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskIdentifierUndefined: Self = StObject.set(x, "ReplicationTaskIdentifier", js.undefined)
    
    @scala.inline
    def setReplicationTaskSettings(value: String): Self = StObject.set(x, "ReplicationTaskSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskSettingsUndefined: Self = StObject.set(x, "ReplicationTaskSettings", js.undefined)
    
    @scala.inline
    def setTableMappings(value: String): Self = StObject.set(x, "TableMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableMappingsUndefined: Self = StObject.set(x, "TableMappings", js.undefined)
    
    @scala.inline
    def setTaskData(value: String): Self = StObject.set(x, "TaskData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDataUndefined: Self = StObject.set(x, "TaskData", js.undefined)
  }
}
