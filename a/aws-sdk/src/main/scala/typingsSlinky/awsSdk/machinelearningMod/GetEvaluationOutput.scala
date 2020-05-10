package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEvaluationOutput extends js.Object {
  /**
    * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the Evaluation, normalized and scaled on computation resources. ComputeTime is only available if the Evaluation is in the COMPLETED state.
    */
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the Evaluation was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  /**
    * The DataSource used for this evaluation.
    */
  var EvaluationDataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * The evaluation ID which is same as the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.native
  /**
    * The epoch time when Amazon Machine Learning marked the Evaluation as COMPLETED or FAILED. FinishedAt is only available when the Evaluation is in the COMPLETED or FAILED state.
    */
  var FinishedAt: js.UndefOr[js.Date] = js.native
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.native
  /**
    * The time of the most recent edit to the Evaluation. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * A link to the file that contains logs of the CreateEvaluation operation.
    */
  var LogUri: js.UndefOr[PresignedS3Url] = js.native
  /**
    * The ID of the MLModel that was the focus of the evaluation.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * A description of the most recent details about evaluating the MLModel.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the Evaluation. 
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * Measurements of how well the MLModel performed using observations referenced by the DataSource. One of the following metric is returned based on the type of the MLModel:    BinaryAUC: A binary MLModel uses the Area Under the Curve (AUC) technique to measure performance.    RegressionRMSE: A regression MLModel uses the Root Mean Square Error (RMSE) technique to measure performance. RMSE measures the difference between predicted and actual values for a single variable.   MulticlassAvgFScore: A multiclass MLModel uses the F1 score technique to measure performance.     For more information about performance metrics, please see the Amazon Machine Learning Developer Guide. 
    */
  var PerformanceMetrics: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.PerformanceMetrics] = js.native
  /**
    * The epoch time when Amazon Machine Learning marked the Evaluation as INPROGRESS. StartedAt isn't available if the Evaluation is in the PENDING state.
    */
  var StartedAt: js.UndefOr[js.Date] = js.native
  /**
    * The status of the evaluation. This element can have one of the following values:   PENDING - Amazon Machine Language (Amazon ML) submitted a request to evaluate an MLModel.  INPROGRESS - The evaluation is underway.  FAILED - The request to evaluate an MLModel did not run to completion. It is not usable.  COMPLETED - The evaluation process completed successfully.  DELETED - The Evaluation is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
}

object GetEvaluationOutput {
  @scala.inline
  def apply(): GetEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEvaluationOutput]
  }
  @scala.inline
  implicit class GetEvaluationOutputOps[Self <: GetEvaluationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeTime(value: LongType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedByIamUser(value: AwsUserArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedByIamUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedByIamUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedByIamUser")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationDataSourceId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationDataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationDataSourceId")(js.undefined)
        ret
    }
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
    @scala.inline
    def withFinishedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDataLocationS3(value: S3Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataLocationS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDataLocationS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataLocationS3")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUri(value: PresignedS3Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUri")(js.undefined)
        ret
    }
    @scala.inline
    def withMLModelId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMLModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MLModelId")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceMetrics(value: PerformanceMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: EntityStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

