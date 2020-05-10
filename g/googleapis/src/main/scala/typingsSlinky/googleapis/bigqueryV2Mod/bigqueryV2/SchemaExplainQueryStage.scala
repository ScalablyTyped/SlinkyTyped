package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExplainQueryStage extends js.Object {
  /**
    * Number of parallel input segments completed.
    */
  var completedParallelInputs: js.UndefOr[String] = js.native
  /**
    * Milliseconds the average shard spent on CPU-bound tasks.
    */
  var computeMsAvg: js.UndefOr[String] = js.native
  /**
    * Milliseconds the slowest shard spent on CPU-bound tasks.
    */
  var computeMsMax: js.UndefOr[String] = js.native
  /**
    * Relative amount of time the average shard spent on CPU-bound tasks.
    */
  var computeRatioAvg: js.UndefOr[Double] = js.native
  /**
    * Relative amount of time the slowest shard spent on CPU-bound tasks.
    */
  var computeRatioMax: js.UndefOr[Double] = js.native
  /**
    * Stage end time represented as milliseconds since epoch.
    */
  var endMs: js.UndefOr[String] = js.native
  /**
    * Unique ID for stage within plan.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * IDs for stages that are inputs to this stage.
    */
  var inputStages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Human-readable name for stage.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of parallel input segments to be processed.
    */
  var parallelInputs: js.UndefOr[String] = js.native
  /**
    * Milliseconds the average shard spent reading input.
    */
  var readMsAvg: js.UndefOr[String] = js.native
  /**
    * Milliseconds the slowest shard spent reading input.
    */
  var readMsMax: js.UndefOr[String] = js.native
  /**
    * Relative amount of time the average shard spent reading input.
    */
  var readRatioAvg: js.UndefOr[Double] = js.native
  /**
    * Relative amount of time the slowest shard spent reading input.
    */
  var readRatioMax: js.UndefOr[Double] = js.native
  /**
    * Number of records read into the stage.
    */
  var recordsRead: js.UndefOr[String] = js.native
  /**
    * Number of records written by the stage.
    */
  var recordsWritten: js.UndefOr[String] = js.native
  /**
    * Total number of bytes written to shuffle.
    */
  var shuffleOutputBytes: js.UndefOr[String] = js.native
  /**
    * Total number of bytes written to shuffle and spilled to disk.
    */
  var shuffleOutputBytesSpilled: js.UndefOr[String] = js.native
  /**
    * Stage start time represented as milliseconds since epoch.
    */
  var startMs: js.UndefOr[String] = js.native
  /**
    * Current status for the stage.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * List of operations within the stage in dependency order (approximately
    * chronological).
    */
  var steps: js.UndefOr[js.Array[SchemaExplainQueryStep]] = js.native
  /**
    * Milliseconds the average shard spent waiting to be scheduled.
    */
  var waitMsAvg: js.UndefOr[String] = js.native
  /**
    * Milliseconds the slowest shard spent waiting to be scheduled.
    */
  var waitMsMax: js.UndefOr[String] = js.native
  /**
    * Relative amount of time the average shard spent waiting to be scheduled.
    */
  var waitRatioAvg: js.UndefOr[Double] = js.native
  /**
    * Relative amount of time the slowest shard spent waiting to be scheduled.
    */
  var waitRatioMax: js.UndefOr[Double] = js.native
  /**
    * Milliseconds the average shard spent on writing output.
    */
  var writeMsAvg: js.UndefOr[String] = js.native
  /**
    * Milliseconds the slowest shard spent on writing output.
    */
  var writeMsMax: js.UndefOr[String] = js.native
  /**
    * Relative amount of time the average shard spent on writing output.
    */
  var writeRatioAvg: js.UndefOr[Double] = js.native
  /**
    * Relative amount of time the slowest shard spent on writing output.
    */
  var writeRatioMax: js.UndefOr[Double] = js.native
}

object SchemaExplainQueryStage {
  @scala.inline
  def apply(): SchemaExplainQueryStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplainQueryStage]
  }
  @scala.inline
  implicit class SchemaExplainQueryStageOps[Self <: SchemaExplainQueryStage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletedParallelInputs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedParallelInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedParallelInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedParallelInputs")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeMsAvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeMsAvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeMsAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeMsAvg")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeMsMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeMsMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeMsMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeMsMax")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeRatioAvg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeRatioAvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeRatioAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeRatioAvg")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeRatioMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeRatioMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeRatioMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeRatioMax")(js.undefined)
        ret
    }
    @scala.inline
    def withEndMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMs")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStages")(js.undefined)
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
    def withParallelInputs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelInputs")(js.undefined)
        ret
    }
    @scala.inline
    def withReadMsAvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readMsAvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadMsAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readMsAvg")(js.undefined)
        ret
    }
    @scala.inline
    def withReadMsMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readMsMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadMsMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readMsMax")(js.undefined)
        ret
    }
    @scala.inline
    def withReadRatioAvg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRatioAvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadRatioAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRatioAvg")(js.undefined)
        ret
    }
    @scala.inline
    def withReadRatioMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRatioMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadRatioMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRatioMax")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordsRead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordsRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsRead")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordsWritten(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsWritten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordsWritten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsWritten")(js.undefined)
        ret
    }
    @scala.inline
    def withShuffleOutputBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffleOutputBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShuffleOutputBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffleOutputBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withShuffleOutputBytesSpilled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffleOutputBytesSpilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShuffleOutputBytesSpilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffleOutputBytesSpilled")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMs")(js.undefined)
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
    def withSteps(value: js.Array[SchemaExplainQueryStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitMsAvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsAvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitMsAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsAvg")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitMsMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitMsMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsMax")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitRatioAvg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitRatioAvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitRatioAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitRatioAvg")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitRatioMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitRatioMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitRatioMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitRatioMax")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteMsAvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeMsAvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteMsAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeMsAvg")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteMsMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeMsMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteMsMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeMsMax")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteRatioAvg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRatioAvg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteRatioAvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRatioAvg")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteRatioMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRatioMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteRatioMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRatioMax")(js.undefined)
        ret
    }
  }
  
}

