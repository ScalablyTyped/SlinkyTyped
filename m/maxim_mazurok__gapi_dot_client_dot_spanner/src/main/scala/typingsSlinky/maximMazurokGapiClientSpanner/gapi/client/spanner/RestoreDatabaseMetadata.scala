package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDatabaseMetadata extends StObject {
  
  /** Information about the backup used to restore the database. */
  var backupInfo: js.UndefOr[BackupInfo] = js.native
  
  /**
    * The time at which cancellation of this operation was received. Operations.CancelOperation starts asynchronous cancellation on a long-running operation. The server makes a best
    * effort to cancel the operation, but success is not guaranteed. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  var cancelTime: js.UndefOr[String] = js.native
  
  /** Name of the database being created and restored to. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If exists, the name of the long-running operation that will be used to track the post-restore optimization process to optimize the performance of the restored database, and remove
    * the dependency on the restore source. The name is of the form `projects//instances//databases//operations/` where the is the name of database being created and restored to. The
    * metadata type of the long-running operation is OptimizeRestoredDatabaseMetadata. This long-running operation will be automatically created by the system after the RestoreDatabase
    * long-running operation completes successfully. This operation will not be created if the restore was not successful.
    */
  var optimizeDatabaseOperationName: js.UndefOr[String] = js.native
  
  /** The progress of the RestoreDatabase operation. */
  var progress: js.UndefOr[OperationProgress] = js.native
  
  /** The type of the restore source. */
  var sourceType: js.UndefOr[String] = js.native
}
object RestoreDatabaseMetadata {
  
  @scala.inline
  def apply(): RestoreDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDatabaseMetadata]
  }
  
  @scala.inline
  implicit class RestoreDatabaseMetadataMutableBuilder[Self <: RestoreDatabaseMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupInfo(value: BackupInfo): Self = StObject.set(x, "backupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupInfoUndefined: Self = StObject.set(x, "backupInfo", js.undefined)
    
    @scala.inline
    def setCancelTime(value: String): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptimizeDatabaseOperationName(value: String): Self = StObject.set(x, "optimizeDatabaseOperationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeDatabaseOperationNameUndefined: Self = StObject.set(x, "optimizeDatabaseOperationName", js.undefined)
    
    @scala.inline
    def setProgress(value: OperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
