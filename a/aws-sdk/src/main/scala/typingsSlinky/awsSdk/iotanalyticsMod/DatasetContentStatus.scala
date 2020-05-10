package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetContentStatus extends js.Object {
  /**
    * The reason the data set contents are in this state.
    */
  var reason: js.UndefOr[Reason] = js.native
  /**
    * The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
    */
  var state: js.UndefOr[DatasetContentState] = js.native
}

object DatasetContentStatus {
  @scala.inline
  def apply(): DatasetContentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentStatus]
  }
  @scala.inline
  implicit class DatasetContentStatusOps[Self <: DatasetContentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: Reason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: DatasetContentState): Self = {
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
  }
  
}

