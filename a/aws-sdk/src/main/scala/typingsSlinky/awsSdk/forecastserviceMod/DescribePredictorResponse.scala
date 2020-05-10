package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePredictorResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm used for model training.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  /**
    * When PerformAutoML is specified, the ARN of the chosen algorithm.
    */
  var AutoMLAlgorithmArns: js.UndefOr[ArnList] = js.native
  /**
    * When the model training task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * An array of the ARNs of the dataset import jobs used to import training data for the predictor.
    */
  var DatasetImportJobArns: js.UndefOr[ArnList] = js.native
  /**
    * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.EncryptionConfig] = js.native
  /**
    * Used to override the default evaluation parameters of the specified algorithm. Amazon Forecast evaluates a predictor by splitting a dataset into training data and testing data. The evaluation parameters define how to perform the split and the number of iterations.
    */
  var EvaluationParameters: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.EvaluationParameters] = js.native
  /**
    * The featurization configuration.
    */
  var FeaturizationConfig: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.FeaturizationConfig] = js.native
  /**
    * The number of time-steps of the forecast. The forecast horizon is also called the prediction length.
    */
  var ForecastHorizon: js.UndefOr[Integer] = js.native
  /**
    * The hyperparameter override values for the algorithm.
    */
  var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.native
  /**
    * Describes the dataset group that contains the data to use to train the predictor.
    */
  var InputDataConfig: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.InputDataConfig] = js.native
  /**
    * Initially, the same as CreationTime (when the status is CREATE_PENDING). This value is updated when training starts (when the status changes to CREATE_IN_PROGRESS), and when training has completed (when the status changes to ACTIVE) or fails (when the status changes to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Message] = js.native
  /**
    * Whether the predictor is set to perform AutoML.
    */
  var PerformAutoML: js.UndefOr[Boolean] = js.native
  /**
    * Whether the predictor is set to perform hyperparameter optimization (HPO).
    */
  var PerformHPO: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the predictor.
    */
  var PredictorArn: js.UndefOr[Name] = js.native
  /**
    * Details on the the status and results of the backtests performed to evaluate the accuracy of the predictor. You specify the number of backtests to perform when you call the operation.
    */
  var PredictorExecutionDetails: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.PredictorExecutionDetails] = js.native
  /**
    * The name of the predictor.
    */
  var PredictorName: js.UndefOr[Name] = js.native
  /**
    * The status of the predictor. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED     The Status of the predictor must be ACTIVE before you can use the predictor to create a forecast. 
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Status] = js.native
  /**
    * The default training parameters or overrides selected during model training. If using the AutoML algorithm or if HPO is turned on while using the DeepAR+ algorithms, the optimized values for the chosen hyperparameters are returned. For more information, see aws-forecast-choosing-recipes.
    */
  var TrainingParameters: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.TrainingParameters] = js.native
}

object DescribePredictorResponse {
  @scala.inline
  def apply(): DescribePredictorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePredictorResponse]
  }
  @scala.inline
  implicit class DescribePredictorResponseOps[Self <: DescribePredictorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMLAlgorithmArns(value: ArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLAlgorithmArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLAlgorithmArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLAlgorithmArns")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetImportJobArns(value: ArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetImportJobArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetImportJobArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetImportJobArns")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionConfig(value: EncryptionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationParameters(value: EvaluationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturizationConfig(value: FeaturizationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeaturizationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturizationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeaturizationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withForecastHorizon(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastHorizon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastHorizon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastHorizon")(js.undefined)
        ret
    }
    @scala.inline
    def withHPOConfig(value: HyperParameterTuningJobConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HPOConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHPOConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HPOConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDataConfig(value: InputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDataConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModificationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModificationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModificationTime")(js.undefined)
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
    def withPerformAutoML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformAutoML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformAutoML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformAutoML")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformHPO(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformHPO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformHPO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformHPO")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictorArn(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictorExecutionDetails(value: PredictorExecutionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorExecutionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictorExecutionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorExecutionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictorName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
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
    @scala.inline
    def withTrainingParameters(value: TrainingParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingParameters")(js.undefined)
        ret
    }
  }
  
}

