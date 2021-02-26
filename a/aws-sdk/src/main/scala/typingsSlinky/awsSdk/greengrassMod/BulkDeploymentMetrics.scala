package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkDeploymentMetrics extends StObject {
  
  /**
    * The total number of records that returned a non-retryable error. For example, this can occur if a group record from the input file uses an invalid format or specifies a nonexistent group version, or if the execution role doesn't grant permission to deploy a group or group version.
    */
  var InvalidInputRecords: js.UndefOr[integer] = js.native
  
  /**
    * The total number of group records from the input file that have been processed so far, or attempted.
    */
  var RecordsProcessed: js.UndefOr[integer] = js.native
  
  /**
    * The total number of deployment attempts that returned a retryable error. For example, a retry is triggered if the attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a group deployment up to five times.
    */
  var RetryAttempts: js.UndefOr[integer] = js.native
}
object BulkDeploymentMetrics {
  
  @scala.inline
  def apply(): BulkDeploymentMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkDeploymentMetrics]
  }
  
  @scala.inline
  implicit class BulkDeploymentMetricsMutableBuilder[Self <: BulkDeploymentMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidInputRecords(value: integer): Self = StObject.set(x, "InvalidInputRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidInputRecordsUndefined: Self = StObject.set(x, "InvalidInputRecords", js.undefined)
    
    @scala.inline
    def setRecordsProcessed(value: integer): Self = StObject.set(x, "RecordsProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsProcessedUndefined: Self = StObject.set(x, "RecordsProcessed", js.undefined)
    
    @scala.inline
    def setRetryAttempts(value: integer): Self = StObject.set(x, "RetryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryAttemptsUndefined: Self = StObject.set(x, "RetryAttempts", js.undefined)
  }
}
