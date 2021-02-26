package typingsSlinky.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupRun extends StObject {
  
  /** Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT. */
  var backupKind: js.UndefOr[String] = js.native
  
  /** The description of this run, only applicable to on-demand backups. */
  var description: js.UndefOr[String] = js.native
  
  /** Encryption configuration specific to a backup. Applies only to Second Generation instances. */
  var diskEncryptionConfiguration: js.UndefOr[DiskEncryptionConfiguration] = js.native
  
  /** Encryption status specific to a backup. Applies only to Second Generation instances. */
  var diskEncryptionStatus: js.UndefOr[DiskEncryptionStatus] = js.native
  
  /** The time the backup operation completed in UTC timezone in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The time the run was enqueued in UTC timezone in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*. */
  var enqueuedTime: js.UndefOr[String] = js.native
  
  /** Information about why the backup operation failed. This is only present if the run has the FAILED status. */
  var error: js.UndefOr[OperationError] = js.native
  
  /** The identifier for this backup run. Unique only for a specific Cloud SQL instance. */
  var id: js.UndefOr[String] = js.native
  
  /** Name of the database instance. */
  var instance: js.UndefOr[String] = js.native
  
  /** This is always *sql#backupRun*. */
  var kind: js.UndefOr[String] = js.native
  
  /** Location of the backups. */
  var location: js.UndefOr[String] = js.native
  
  /** The URI of this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** The time the backup operation actually started in UTC timezone in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The status of this run. */
  var status: js.UndefOr[String] = js.native
  
  /** The type of this run; can be either "AUTOMATED" or "ON_DEMAND". */
  var `type`: js.UndefOr[String] = js.native
  
  /** The start time of the backup window during which this the backup was attempted in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*. */
  var windowStartTime: js.UndefOr[String] = js.native
}
object BackupRun {
  
  @scala.inline
  def apply(): BackupRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupRun]
  }
  
  @scala.inline
  implicit class BackupRunMutableBuilder[Self <: BackupRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupKind(value: String): Self = StObject.set(x, "backupKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupKindUndefined: Self = StObject.set(x, "backupKind", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDiskEncryptionConfiguration(value: DiskEncryptionConfiguration): Self = StObject.set(x, "diskEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskEncryptionConfigurationUndefined: Self = StObject.set(x, "diskEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setDiskEncryptionStatus(value: DiskEncryptionStatus): Self = StObject.set(x, "diskEncryptionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskEncryptionStatusUndefined: Self = StObject.set(x, "diskEncryptionStatus", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEnqueuedTime(value: String): Self = StObject.set(x, "enqueuedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnqueuedTimeUndefined: Self = StObject.set(x, "enqueuedTime", js.undefined)
    
    @scala.inline
    def setError(value: OperationError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWindowStartTime(value: String): Self = StObject.set(x, "windowStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowStartTimeUndefined: Self = StObject.set(x, "windowStartTime", js.undefined)
  }
}
