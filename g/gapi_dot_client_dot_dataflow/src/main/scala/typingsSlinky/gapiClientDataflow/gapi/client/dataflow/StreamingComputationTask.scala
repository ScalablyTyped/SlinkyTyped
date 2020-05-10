package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingComputationTask extends js.Object {
  /** Contains ranges of a streaming computation this task should apply to. */
  var computationRanges: js.UndefOr[js.Array[StreamingComputationRanges]] = js.native
  /** Describes the set of data disks this task should apply to. */
  var dataDisks: js.UndefOr[js.Array[MountedDataDisk]] = js.native
  /** A type of streaming computation task. */
  var taskType: js.UndefOr[String] = js.native
}

object StreamingComputationTask {
  @scala.inline
  def apply(): StreamingComputationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingComputationTask]
  }
  @scala.inline
  implicit class StreamingComputationTaskOps[Self <: StreamingComputationTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputationRanges(value: js.Array[StreamingComputationRanges]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputationRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDisks(value: js.Array[MountedDataDisk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDisks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDisks")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskType")(js.undefined)
        ret
    }
  }
  
}

