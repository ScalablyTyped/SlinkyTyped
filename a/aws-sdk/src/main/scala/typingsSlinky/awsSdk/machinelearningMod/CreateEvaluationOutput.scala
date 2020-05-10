package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEvaluationOutput extends js.Object {
  /**
    * The user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.native
}

object CreateEvaluationOutput {
  @scala.inline
  def apply(): CreateEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEvaluationOutput]
  }
  @scala.inline
  implicit class CreateEvaluationOutputOps[Self <: CreateEvaluationOutput] (val x: Self) extends AnyVal {
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

