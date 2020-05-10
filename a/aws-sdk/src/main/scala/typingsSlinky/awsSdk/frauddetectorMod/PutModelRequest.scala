package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutModelRequest extends js.Object {
  /**
    * The model description. 
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The label schema.
    */
  var labelSchema: LabelSchema = js.native
  /**
    * The model ID.
    */
  var modelId: identifier = js.native
  /**
    * The model type. 
    */
  var modelType: ModelTypeEnum = js.native
  /**
    * The model input variables.
    */
  var modelVariables: ModelVariablesList = js.native
  /**
    * The training data source location in Amazon S3. 
    */
  var trainingDataSource: TrainingDataSource = js.native
}

object PutModelRequest {
  @scala.inline
  def apply(
    labelSchema: LabelSchema,
    modelId: identifier,
    modelType: ModelTypeEnum,
    modelVariables: ModelVariablesList,
    trainingDataSource: TrainingDataSource
  ): PutModelRequest = {
    val __obj = js.Dynamic.literal(labelSchema = labelSchema.asInstanceOf[js.Any], modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVariables = modelVariables.asInstanceOf[js.Any], trainingDataSource = trainingDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutModelRequest]
  }
  @scala.inline
  implicit class PutModelRequestOps[Self <: PutModelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelSchema(value: LabelSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelType(value: ModelTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelVariables(value: ModelVariablesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrainingDataSource(value: TrainingDataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

