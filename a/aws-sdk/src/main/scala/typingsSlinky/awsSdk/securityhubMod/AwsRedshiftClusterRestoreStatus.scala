package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterRestoreStatus extends StObject {
  
  /**
    * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a completed backup. This field is only updated when you restore to DC2 and DS2 node types.
    */
  var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.native
  
  /**
    * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to finish. This field is only updated when you restore to DC2 and DS2 node types.
    */
  var ElapsedTimeInSeconds: js.UndefOr[Long] = js.native
  
  /**
    * The estimate of the time remaining before the restore is complete. Returns 0 for a completed restore. This field is only updated when you restore to DC2 and DS2 node types.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[Long] = js.native
  
  /**
    * The number of megabytes that were transferred from snapshot storage. This field is only updated when you restore to DC2 and DS2 node types.
    */
  var ProgressInMegaBytes: js.UndefOr[Long] = js.native
  
  /**
    * The size of the set of snapshot data that was used to restore the cluster. This field is only updated when you restore to DC2 and DS2 node types.
    */
  var SnapshotSizeInMegaBytes: js.UndefOr[Long] = js.native
  
  /**
    * The status of the restore action. Valid values: starting | restoring | completed | failed 
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterRestoreStatus {
  
  @scala.inline
  def apply(): AwsRedshiftClusterRestoreStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterRestoreStatus]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterRestoreStatusMutableBuilder[Self <: AwsRedshiftClusterRestoreStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentRestoreRateInMegaBytesPerSecond(value: Double): Self = StObject.set(x, "CurrentRestoreRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRestoreRateInMegaBytesPerSecondUndefined: Self = StObject.set(x, "CurrentRestoreRateInMegaBytesPerSecond", js.undefined)
    
    @scala.inline
    def setElapsedTimeInSeconds(value: Long): Self = StObject.set(x, "ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeInSecondsUndefined: Self = StObject.set(x, "ElapsedTimeInSeconds", js.undefined)
    
    @scala.inline
    def setEstimatedTimeToCompletionInSeconds(value: Long): Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedTimeToCompletionInSecondsUndefined: Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", js.undefined)
    
    @scala.inline
    def setProgressInMegaBytes(value: Long): Self = StObject.set(x, "ProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressInMegaBytesUndefined: Self = StObject.set(x, "ProgressInMegaBytes", js.undefined)
    
    @scala.inline
    def setSnapshotSizeInMegaBytes(value: Long): Self = StObject.set(x, "SnapshotSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotSizeInMegaBytesUndefined: Self = StObject.set(x, "SnapshotSizeInMegaBytes", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
