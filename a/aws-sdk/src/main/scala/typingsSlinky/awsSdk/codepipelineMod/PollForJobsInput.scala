package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForJobsInput extends js.Object {
  /**
    * Represents information about an action type.
    */
  var actionTypeId: ActionTypeId = js.native
  /**
    * The maximum number of jobs to return in a poll for jobs call.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.native
  /**
    * A map of property names and values. For an action type with no queryable properties, this value must be null or an empty map. For an action type with a queryable property, you must supply that property as a key in the map. Only jobs whose action configuration matches the mapped value are returned.
    */
  var queryParam: js.UndefOr[QueryParamMap] = js.native
}

object PollForJobsInput {
  @scala.inline
  def apply(actionTypeId: ActionTypeId): PollForJobsInput = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForJobsInput]
  }
  @scala.inline
  implicit class PollForJobsInputOps[Self <: PollForJobsInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withQueryParam(value: QueryParamMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParam")(js.undefined)
        ret
    }
  }
  
}

