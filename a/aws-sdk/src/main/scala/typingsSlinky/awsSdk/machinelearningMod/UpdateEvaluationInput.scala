package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEvaluationInput extends js.Object {
  /**
    * The ID assigned to the Evaluation during creation.
    */
  var EvaluationId: EntityId = js.native
  /**
    * A new user-supplied name or description of the Evaluation that will replace the current content. 
    */
  var EvaluationName: EntityName = js.native
}

object UpdateEvaluationInput {
  @scala.inline
  def apply(EvaluationId: EntityId, EvaluationName: EntityName): UpdateEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationId = EvaluationId.asInstanceOf[js.Any], EvaluationName = EvaluationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvaluationInput]
  }
  @scala.inline
  implicit class UpdateEvaluationInputOps[Self <: UpdateEvaluationInput] (val x: Self) extends AnyVal {
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
    def withEvaluationName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

