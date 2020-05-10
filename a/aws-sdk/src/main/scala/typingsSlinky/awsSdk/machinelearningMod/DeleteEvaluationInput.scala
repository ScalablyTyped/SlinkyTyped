package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEvaluationInput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the Evaluation to delete.
    */
  var EvaluationId: EntityId = js.native
}

object DeleteEvaluationInput {
  @scala.inline
  def apply(EvaluationId: EntityId): DeleteEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEvaluationInput]
  }
  @scala.inline
  implicit class DeleteEvaluationInputOps[Self <: DeleteEvaluationInput] (val x: Self) extends AnyVal {
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
  }
  
}

