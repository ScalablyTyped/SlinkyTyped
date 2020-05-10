package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkDeploymentMetrics extends js.Object {
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
  implicit class BulkDeploymentMetricsOps[Self <: BulkDeploymentMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidInputRecords(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidInputRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidInputRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidInputRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordsProcessed(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordsProcessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordsProcessed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordsProcessed")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryAttempts(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryAttempts")(js.undefined)
        ret
    }
  }
  
}

