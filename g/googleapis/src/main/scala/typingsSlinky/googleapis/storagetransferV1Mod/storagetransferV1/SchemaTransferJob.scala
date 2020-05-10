package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents the configuration of a transfer job that runs
  * periodically.
  */
@js.native
trait SchemaTransferJob extends js.Object {
  /**
    * This field cannot be changed by user requests.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * This field cannot be changed by user requests.
    */
  var deletionTime: js.UndefOr[String] = js.native
  /**
    * A description provided by the user for the job. Its max length is 1024
    * bytes when Unicode-encoded.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This field cannot be changed by user requests.
    */
  var lastModificationTime: js.UndefOr[String] = js.native
  /**
    * A globally unique name assigned by Storage Transfer Service when the job
    * is created. This field should be left empty in requests to create a new
    * transfer job; otherwise, the requests result in an `INVALID_ARGUMENT`
    * error.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the Google Cloud Platform Project that owns the job.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Schedule specification.
    */
  var schedule: js.UndefOr[SchemaSchedule] = js.native
  /**
    * Status of the job. This value MUST be specified for
    * `CreateTransferJobRequests`.  NOTE: The effect of the new job status
    * takes place during a subsequent job run. For example, if you change the
    * job status from `ENABLED` to `DISABLED`, and an operation spawned by the
    * transfer is running, the status change would not affect the current
    * operation.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Transfer specification.
    */
  var transferSpec: js.UndefOr[SchemaTransferSpec] = js.native
}

object SchemaTransferJob {
  @scala.inline
  def apply(): SchemaTransferJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferJob]
  }
  @scala.inline
  implicit class SchemaTransferJobOps[Self <: SchemaTransferJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModificationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModificationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModificationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
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
    def withSchedule(value: SchemaSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferSpec(value: SchemaTransferSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferSpec")(js.undefined)
        ret
    }
  }
  
}

