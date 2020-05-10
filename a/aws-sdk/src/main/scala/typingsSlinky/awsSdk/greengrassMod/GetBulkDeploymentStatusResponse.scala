package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBulkDeploymentStatusResponse extends js.Object {
  /**
    * Relevant metrics on input records processed during bulk deployment.
    */
  var BulkDeploymentMetrics: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.BulkDeploymentMetrics] = js.native
  /**
    * The status of the bulk deployment.
    */
  var BulkDeploymentStatus: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.BulkDeploymentStatus] = js.native
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.ErrorDetails] = js.native
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  /**
    * Tag(s) attached to the resource arn.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object GetBulkDeploymentStatusResponse {
  @scala.inline
  def apply(): GetBulkDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBulkDeploymentStatusResponse]
  }
  @scala.inline
  implicit class GetBulkDeploymentStatusResponseOps[Self <: GetBulkDeploymentStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulkDeploymentMetrics(value: BulkDeploymentMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkDeploymentMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulkDeploymentMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkDeploymentMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withBulkDeploymentStatus(value: BulkDeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkDeploymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulkDeploymentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkDeploymentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorDetails(value: ErrorDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

