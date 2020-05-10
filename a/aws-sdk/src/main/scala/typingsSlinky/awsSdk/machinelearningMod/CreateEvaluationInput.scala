package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEvaluationInput extends js.Object {
  /**
    * The ID of the DataSource for the evaluation. The schema of the DataSource must match the schema used to create the MLModel.
    */
  var EvaluationDataSourceId: EntityId = js.native
  /**
    * A user-supplied ID that uniquely identifies the Evaluation.
    */
  var EvaluationId: EntityId = js.native
  /**
    * A user-supplied name or description of the Evaluation.
    */
  var EvaluationName: js.UndefOr[EntityName] = js.native
  /**
    * The ID of the MLModel to evaluate. The schema used in creating the MLModel must match the schema of the DataSource used in the Evaluation.
    */
  var MLModelId: EntityId = js.native
}

object CreateEvaluationInput {
  @scala.inline
  def apply(EvaluationDataSourceId: EntityId, EvaluationId: EntityId, MLModelId: EntityId): CreateEvaluationInput = {
    val __obj = js.Dynamic.literal(EvaluationDataSourceId = EvaluationDataSourceId.asInstanceOf[js.Any], EvaluationId = EvaluationId.asInstanceOf[js.Any], MLModelId = MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEvaluationInput]
  }
  @scala.inline
  implicit class CreateEvaluationInputOps[Self <: CreateEvaluationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationDataSourceId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationDataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluationId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLModelId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluationName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationName")(js.undefined)
        ret
    }
  }
  
}

