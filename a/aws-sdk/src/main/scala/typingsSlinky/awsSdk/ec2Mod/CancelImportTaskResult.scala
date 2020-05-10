package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelImportTaskResult extends js.Object {
  /**
    * The ID of the task being canceled.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  /**
    * The current state of the task being canceled.
    */
  var PreviousState: js.UndefOr[String] = js.native
  /**
    * The current state of the task being canceled.
    */
  var State: js.UndefOr[String] = js.native
}

object CancelImportTaskResult {
  @scala.inline
  def apply(): CancelImportTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelImportTaskResult]
  }
  @scala.inline
  implicit class CancelImportTaskResultOps[Self <: CancelImportTaskResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTaskId")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreviousState")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

