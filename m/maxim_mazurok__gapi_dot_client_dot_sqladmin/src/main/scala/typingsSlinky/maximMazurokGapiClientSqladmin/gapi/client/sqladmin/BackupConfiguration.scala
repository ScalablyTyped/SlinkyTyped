package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupConfiguration extends js.Object {
  
  /** Backup retention settings. */
  var backupRetentionSettings: js.UndefOr[BackupRetentionSettings] = js.native
  
  /** (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well. */
  var binaryLogEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether this configuration is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** This is always *sql#backupConfiguration*. */
  var kind: js.UndefOr[String] = js.native
  
  /** Location of the backup */
  var location: js.UndefOr[String] = js.native
  
  /** Reserved for future use. */
  var pointInTimeRecoveryEnabled: js.UndefOr[Boolean] = js.native
  
  /** Reserved for future use. */
  var replicationLogArchivingEnabled: js.UndefOr[Boolean] = js.native
  
  /** Start time for the daily backup configuration in UTC timezone in the 24 hour format - *HH:MM*. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The number of days of transaction logs we retain for point in time restore, from 1-7. */
  var transactionLogRetentionDays: js.UndefOr[Double] = js.native
}
object BackupConfiguration {
  
  @scala.inline
  def apply(): BackupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupConfiguration]
  }
  
  @scala.inline
  implicit class BackupConfigurationOps[Self <: BackupConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackupRetentionSettings(value: BackupRetentionSettings): Self = this.set("backupRetentionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionSettings: Self = this.set("backupRetentionSettings", js.undefined)
    
    @scala.inline
    def setBinaryLogEnabled(value: Boolean): Self = this.set("binaryLogEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryLogEnabled: Self = this.set("binaryLogEnabled", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPointInTimeRecoveryEnabled(value: Boolean): Self = this.set("pointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointInTimeRecoveryEnabled: Self = this.set("pointInTimeRecoveryEnabled", js.undefined)
    
    @scala.inline
    def setReplicationLogArchivingEnabled(value: Boolean): Self = this.set("replicationLogArchivingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationLogArchivingEnabled: Self = this.set("replicationLogArchivingEnabled", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTransactionLogRetentionDays(value: Double): Self = this.set("transactionLogRetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionLogRetentionDays: Self = this.set("transactionLogRetentionDays", js.undefined)
  }
}
