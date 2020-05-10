package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelVersionDetail extends js.Object {
  /**
    * The timestamp when the model was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The model description.
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The model label schema.
    */
  var labelSchema: js.UndefOr[LabelSchema] = js.native
  /**
    * The timestamp when the model was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[identifier] = js.native
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
  /**
    * The model variables.
    */
  var modelVariables: js.UndefOr[ModelVariablesList] = js.native
  /**
    * The model version.
    */
  var modelVersionNumber: js.UndefOr[nonEmptyString] = js.native
  /**
    * The model status.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The model training data source.
    */
  var trainingDataSource: js.UndefOr[TrainingDataSource] = js.native
  /**
    * The model training metrics.
    */
  var trainingMetrics: js.UndefOr[MetricsMap] = js.native
  /**
    * The model validation metrics.
    */
  var validationMetrics: js.UndefOr[MetricsMap] = js.native
}

object ModelVersionDetail {
  @scala.inline
  def apply(): ModelVersionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelVersionDetail]
  }
  @scala.inline
  implicit class ModelVersionDetailOps[Self <: ModelVersionDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(js.undefined)
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
    @scala.inline
    def withLabelSchema(value: LabelSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withModelId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelId")(js.undefined)
        ret
    }
    @scala.inline
    def withModelType(value: ModelTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(js.undefined)
        ret
    }
    @scala.inline
    def withModelVariables(value: ModelVariablesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withModelVersionNumber(value: nonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingDataSource(value: TrainingDataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingDataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingMetrics(value: MetricsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMetrics(value: MetricsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMetrics")(js.undefined)
        ret
    }
  }
  
}

