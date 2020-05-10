package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BqmlTrainingRun extends js.Object {
  var iterationResults: js.UndefOr[js.Array[BqmlIterationResult]] = js.native
  var startTime: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var trainingOptions: js.UndefOr[BqmlTrainingRunTrainingOptions] = js.native
}

object BqmlTrainingRun {
  @scala.inline
  def apply(): BqmlTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlTrainingRun]
  }
  @scala.inline
  implicit class BqmlTrainingRunOps[Self <: BqmlTrainingRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIterationResults(value: js.Array[BqmlIterationResult]): Self = {
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
    def withTrainingOptions(value: BqmlTrainingRunTrainingOptions): Self = {
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

