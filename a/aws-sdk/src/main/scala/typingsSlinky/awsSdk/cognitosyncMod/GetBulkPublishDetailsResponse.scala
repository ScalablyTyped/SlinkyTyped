package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBulkPublishDetailsResponse extends js.Object {
  /**
    * If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
    */
  var BulkPublishCompleteTime: js.UndefOr[js.Date] = js.native
  /**
    * The date/time at which the last bulk publish was initiated.
    */
  var BulkPublishStartTime: js.UndefOr[js.Date] = js.native
  /**
    * Status of the last bulk publish operation, valid values are: NOT_STARTED - No bulk publish has been requested for this identity pool IN_PROGRESS - Data is being published to the configured stream SUCCEEDED - All data for the identity pool has been published to the configured stream FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
    */
  var BulkPublishStatus: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.BulkPublishStatus] = js.native
  /**
    * If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to fail.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
}

object GetBulkPublishDetailsResponse {
  @scala.inline
  def apply(): GetBulkPublishDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBulkPublishDetailsResponse]
  }
  @scala.inline
  implicit class GetBulkPublishDetailsResponseOps[Self <: GetBulkPublishDetailsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulkPublishCompleteTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkPublishCompleteTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulkPublishCompleteTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkPublishCompleteTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBulkPublishStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkPublishStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulkPublishStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkPublishStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBulkPublishStatus(value: BulkPublishStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkPublishStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulkPublishStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BulkPublishStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(js.undefined)
        ret
    }
  }
  
}

