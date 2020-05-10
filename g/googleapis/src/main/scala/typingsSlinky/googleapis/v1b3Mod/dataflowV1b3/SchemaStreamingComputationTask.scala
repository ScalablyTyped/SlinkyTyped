package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task which describes what action should be performed for the specified
  * streaming computation ranges.
  */
@js.native
trait SchemaStreamingComputationTask extends js.Object {
  /**
    * Contains ranges of a streaming computation this task should apply to.
    */
  var computationRanges: js.UndefOr[js.Array[SchemaStreamingComputationRanges]] = js.native
  /**
    * Describes the set of data disks this task should apply to.
    */
  var dataDisks: js.UndefOr[js.Array[SchemaMountedDataDisk]] = js.native
  /**
    * A type of streaming computation task.
    */
  var taskType: js.UndefOr[String] = js.native
}

object SchemaStreamingComputationTask {
  @scala.inline
  def apply(): SchemaStreamingComputationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationTask]
  }
  @scala.inline
  implicit class SchemaStreamingComputationTaskOps[Self <: SchemaStreamingComputationTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputationRanges(value: js.Array[SchemaStreamingComputationRanges]): Self = {
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
    def withDataDisks(value: js.Array[SchemaMountedDataDisk]): Self = {
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

