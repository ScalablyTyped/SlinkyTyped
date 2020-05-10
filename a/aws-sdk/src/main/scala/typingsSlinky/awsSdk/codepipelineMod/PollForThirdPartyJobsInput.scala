package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForThirdPartyJobsInput extends js.Object {
  /**
    * Represents information about an action type.
    */
  var actionTypeId: ActionTypeId = js.native
  /**
    * The maximum number of jobs to return in a poll for jobs call.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.native
}

object PollForThirdPartyJobsInput {
  @scala.inline
  def apply(actionTypeId: ActionTypeId): PollForThirdPartyJobsInput = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForThirdPartyJobsInput]
  }
  @scala.inline
  implicit class PollForThirdPartyJobsInputOps[Self <: PollForThirdPartyJobsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTypeId(value: ActionTypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxBatchSize(value: MaxBatchSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchSize")(js.undefined)
        ret
    }
  }
  
}

