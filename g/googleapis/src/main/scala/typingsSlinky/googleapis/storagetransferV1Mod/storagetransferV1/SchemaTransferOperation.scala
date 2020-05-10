package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of the execution of a transfer.
  */
@js.native
trait SchemaTransferOperation extends js.Object {
  /**
    * Information about the progress of the transfer operation.
    */
  var counters: js.UndefOr[SchemaTransferCounters] = js.native
  /**
    * End time of this transfer execution.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Summarizes errors encountered with sample error log entries.
    */
  var errorBreakdowns: js.UndefOr[js.Array[SchemaErrorSummary]] = js.native
  /**
    * A globally unique ID assigned by the system.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the Google Cloud Platform Project that owns the operation.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Start time of this transfer execution.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Status of the transfer operation.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The name of the transfer job that triggers this transfer operation.
    */
  var transferJobName: js.UndefOr[String] = js.native
  /**
    * Transfer specification. Required.
    */
  var transferSpec: js.UndefOr[SchemaTransferSpec] = js.native
}

object SchemaTransferOperation {
  @scala.inline
  def apply(): SchemaTransferOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferOperation]
  }
  @scala.inline
  implicit class SchemaTransferOperationOps[Self <: SchemaTransferOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounters(value: SchemaTransferCounters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorBreakdowns(value: js.Array[SchemaErrorSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBreakdowns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorBreakdowns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBreakdowns")(js.undefined)
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
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
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
    def withTransferJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferJobName")(js.undefined)
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

