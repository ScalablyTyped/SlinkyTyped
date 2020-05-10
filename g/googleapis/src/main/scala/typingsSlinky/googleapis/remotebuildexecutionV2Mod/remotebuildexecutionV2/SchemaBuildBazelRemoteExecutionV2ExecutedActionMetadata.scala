package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExecutedActionMetadata contains details about a completed execution.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata extends js.Object {
  /**
    * When the worker completed executing the action command.
    */
  var executionCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker started executing the action command.
    */
  var executionStartTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker finished fetching action inputs.
    */
  var inputFetchCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker started fetching action inputs.
    */
  var inputFetchStartTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker finished uploading action outputs.
    */
  var outputUploadCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker started uploading action outputs.
    */
  var outputUploadStartTimestamp: js.UndefOr[String] = js.native
  /**
    * When was the action added to the queue.
    */
  var queuedTimestamp: js.UndefOr[String] = js.native
  /**
    * The name of the worker which ran the execution.
    */
  var worker: js.UndefOr[String] = js.native
  /**
    * When the worker completed the action, including all stages.
    */
  var workerCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker received the action.
    */
  var workerStartTimestamp: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadataOps[Self <: SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionCompletedTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionCompletedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionCompletedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionCompletedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionStartTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStartTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStartTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStartTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFetchCompletedTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFetchCompletedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFetchCompletedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFetchCompletedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFetchStartTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFetchStartTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFetchStartTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFetchStartTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputUploadCompletedTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUploadCompletedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUploadCompletedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUploadCompletedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputUploadStartTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUploadStartTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUploadStartTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUploadStartTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withQueuedTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueuedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withWorker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerCompletedTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCompletedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerCompletedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCompletedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerStartTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerStartTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerStartTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerStartTimestamp")(js.undefined)
        ret
    }
  }
  
}

