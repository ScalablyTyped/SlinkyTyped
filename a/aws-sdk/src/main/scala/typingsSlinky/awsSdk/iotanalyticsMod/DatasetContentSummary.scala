package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetContentSummary extends js.Object {
  /**
    * The time the dataset content status was updated to SUCCEEDED or FAILED.
    */
  var completionTime: js.UndefOr[js.Date] = js.native
  /**
    * The actual time the creation of the data set contents was started.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  /**
    * The time the creation of the data set contents was scheduled to start.
    */
  var scheduleTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the data set contents.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.native
  /**
    * The version of the data set contents.
    */
  var version: js.UndefOr[DatasetContentVersion] = js.native
}

object DatasetContentSummary {
  @scala.inline
  def apply(): DatasetContentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentSummary]
  }
  @scala.inline
  implicit class DatasetContentSummaryOps[Self <: DatasetContentSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
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
    def withScheduleTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DatasetContentStatus): Self = {
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
    def withVersion(value: DatasetContentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

