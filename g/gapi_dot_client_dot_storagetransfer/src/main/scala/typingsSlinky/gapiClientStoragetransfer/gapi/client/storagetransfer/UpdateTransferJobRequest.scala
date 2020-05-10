package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTransferJobRequest extends js.Object {
  /**
    * The ID of the Google Cloud Platform Console project that owns the job.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The job to update. `transferJob` is expected to specify only three fields:
    * `description`, `transferSpec`, and `status`.  An UpdateTransferJobRequest
    * that specifies other fields will be rejected with an error
    * `INVALID_ARGUMENT`.
    * Required.
    */
  var transferJob: js.UndefOr[TransferJob] = js.native
  /**
    * The field mask of the fields in `transferJob` that are to be updated in
    * this request.  Fields in `transferJob` that can be updated are:
    * `description`, `transferSpec`, and `status`.  To update the `transferSpec`
    * of the job, a complete transfer specification has to be provided. An
    * incomplete specification which misses any required fields will be rejected
    * with the error `INVALID_ARGUMENT`.
    */
  var updateTransferJobFieldMask: js.UndefOr[String] = js.native
}

object UpdateTransferJobRequest {
  @scala.inline
  def apply(): UpdateTransferJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTransferJobRequest]
  }
  @scala.inline
  implicit class UpdateTransferJobRequestOps[Self <: UpdateTransferJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferJob(value: TransferJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferJob")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTransferJobFieldMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTransferJobFieldMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTransferJobFieldMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTransferJobFieldMask")(js.undefined)
        ret
    }
  }
  
}

