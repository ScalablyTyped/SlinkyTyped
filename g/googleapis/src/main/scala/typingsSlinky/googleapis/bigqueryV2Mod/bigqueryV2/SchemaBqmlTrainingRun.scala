package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleapis.AnonEarlyStop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBqmlTrainingRun extends js.Object {
  /**
    * [Output-only, Beta] List of each iteration results.
    */
  var iterationResults: js.UndefOr[js.Array[SchemaBqmlIterationResult]] = js.native
  /**
    * [Output-only, Beta] Training run start time in milliseconds since the
    * epoch.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * [Output-only, Beta] Different state applicable for a training run. IN
    * PROGRESS: Training run is in progress. FAILED: Training run ended due to
    * a non-retryable failure. SUCCEEDED: Training run successfully completed.
    * CANCELLED: Training run cancelled by the user.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * [Output-only, Beta] Training options used by this training run. These
    * options are mutable for subsequent training runs. Default values are
    * explicitly stored for options not specified in the input query of the
    * first training run. For subsequent training runs, any option not
    * explicitly specified in the input query will be copied from the previous
    * training run.
    */
  var trainingOptions: js.UndefOr[AnonEarlyStop] = js.native
}

object SchemaBqmlTrainingRun {
  @scala.inline
  def apply(): SchemaBqmlTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBqmlTrainingRun]
  }
  @scala.inline
  implicit class SchemaBqmlTrainingRunOps[Self <: SchemaBqmlTrainingRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIterationResults(value: js.Array[SchemaBqmlIterationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterationResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationResults")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingOptions(value: AnonEarlyStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingOptions")(js.undefined)
        ret
    }
  }
  
}

