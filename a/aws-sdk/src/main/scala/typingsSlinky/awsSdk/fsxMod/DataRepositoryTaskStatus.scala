package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRepositoryTaskStatus extends js.Object {
  /**
    * A running total of the number of files that the task failed to process.
    */
  var FailedCount: js.UndefOr[typingsSlinky.awsSdk.fsxMod.FailedCount] = js.native
  /**
    * The time at which the task status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * A running total of the number of files that the task has successfully processed.
    */
  var SucceededCount: js.UndefOr[typingsSlinky.awsSdk.fsxMod.SucceededCount] = js.native
  /**
    * The total number of files that the task will process. While a task is executing, the sum of SucceededCount plus FailedCount may not equal TotalCount. When the task is complete, TotalCount equals the sum of SucceededCount plus FailedCount.
    */
  var TotalCount: js.UndefOr[typingsSlinky.awsSdk.fsxMod.TotalCount] = js.native
}

object DataRepositoryTaskStatus {
  @scala.inline
  def apply(): DataRepositoryTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryTaskStatus]
  }
  @scala.inline
  implicit class DataRepositoryTaskStatusOps[Self <: DataRepositoryTaskStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedCount(value: FailedCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSucceededCount(value: SucceededCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SucceededCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSucceededCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SucceededCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCount(value: TotalCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCount")(js.undefined)
        ret
    }
  }
  
}

