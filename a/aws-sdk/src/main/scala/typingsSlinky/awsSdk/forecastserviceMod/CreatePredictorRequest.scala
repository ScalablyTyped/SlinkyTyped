package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePredictorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if PerformAutoML is not set to true.  Supported algorithms:     arn:aws:forecast:::algorithm/ARIMA     arn:aws:forecast:::algorithm/Deep_AR_Plus  Supports hyperparameter optimization (HPO)    arn:aws:forecast:::algorithm/ETS     arn:aws:forecast:::algorithm/NPTS     arn:aws:forecast:::algorithm/Prophet   
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
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
  var FeaturizationConfig: typingsSlinky.awsSdk.forecastserviceMod.FeaturizationConfig = js.native
  /**
    * Specifies the number of time-steps that the model is trained to predict. The forecast horizon is also called the prediction length. For example, if you configure a dataset for daily data collection (using the DataFrequency parameter of the CreateDataset operation) and set the forecast horizon to 10, the model returns predictions for 10 days. The maximum forecast horizon is the lesser of 500 time-steps or 1/3 of the TARGET_TIME_SERIES dataset length.
    */
  var ForecastHorizon: Integer = js.native
  /**
    * Provides hyperparameter override values for the algorithm. If you don't provide this parameter, Amazon Forecast uses default values. The individual algorithms specify which hyperparameters support hyperparameter optimization (HPO). For more information, see aws-forecast-choosing-recipes. If you included the HPOConfig object, you must set PerformHPO to true.
    */
  var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.native
  /**
    * Describes the dataset group that contains the data to use to train the predictor.
    */
  var InputDataConfig: typingsSlinky.awsSdk.forecastserviceMod.InputDataConfig = js.native
  /**
    * Whether to perform AutoML. When Amazon Forecast performs AutoML, it evaluates the algorithms it provides and chooses the best algorithm and configuration for your training dataset. The default value is false. In this case, you are required to specify an algorithm. Set PerformAutoML to true to have Amazon Forecast perform AutoML. This is a good option if you aren't sure which algorithm is suitable for your training data. In this case, PerformHPO must be false.
    */
  var PerformAutoML: js.UndefOr[Boolean] = js.native
  /**
    * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training data. The process of performing HPO is known as running a hyperparameter tuning job. The default value is false. In this case, Amazon Forecast uses default hyperparameter values from the chosen algorithm. To override the default values, set PerformHPO to true and, optionally, supply the HyperParameterTuningJobConfig object. The tuning job specifies a metric to optimize, which hyperparameters participate in tuning, and the valid range for each tunable hyperparameter. In this case, you are required to specify an algorithm and PerformAutoML must be false. The following algorithm supports HPO:   DeepAR+  
    */
  var PerformHPO: js.UndefOr[Boolean] = js.native
  /**
    * A name for the predictor.
    */
  var PredictorName: Name = js.native
  /**
    * The hyperparameters to override for model training. The hyperparameters that you can override are listed in the individual algorithms. For the list of supported algorithms, see aws-forecast-choosing-recipes.
    */
  var TrainingParameters: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.TrainingParameters] = js.native
}

object CreatePredictorRequest {
  @scala.inline
  def apply(
    FeaturizationConfig: FeaturizationConfig,
    ForecastHorizon: Integer,
    InputDataConfig: InputDataConfig,
    PredictorName: Name
  ): CreatePredictorRequest = {
    val __obj = js.Dynamic.literal(FeaturizationConfig = FeaturizationConfig.asInstanceOf[js.Any], ForecastHorizon = ForecastHorizon.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], PredictorName = PredictorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePredictorRequest]
  }
  @scala.inline
  implicit class CreatePredictorRequestOps[Self <: CreatePredictorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeaturizationConfig(value: FeaturizationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeaturizationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForecastHorizon(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastHorizon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputDataConfig(value: InputDataConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputDataConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredictorName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorName")(value.asInstanceOf[js.Any])
        ret
    }
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

