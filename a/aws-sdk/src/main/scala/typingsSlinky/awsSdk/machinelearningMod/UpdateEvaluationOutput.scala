package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEvaluationOutput extends js.Object {
  /**
    * The ID assigned to the Evaluation during creation. This value should be identical to the value of the Evaluation in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.native
}

object UpdateEvaluationOutput {
  @scala.inline
  def apply(): UpdateEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEvaluationOutput]
  }
  @scala.inline
  implicit class UpdateEvaluationOutputOps[Self <: UpdateEvaluationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationId")(js.undefined)
        ret
    }
  }
  
}

