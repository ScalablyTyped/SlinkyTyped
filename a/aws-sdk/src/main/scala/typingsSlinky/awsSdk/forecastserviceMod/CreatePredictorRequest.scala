package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePredictorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm to use for model training. Required if PerformAutoML is not set to true.  Supported algorithms:     arn:aws:forecast:::algorithm/ARIMA     arn:aws:forecast:::algorithm/CNN-QR     arn:aws:forecast:::algorithm/Deep_AR_Plus     arn:aws:forecast:::algorithm/ETS     arn:aws:forecast:::algorithm/NPTS     arn:aws:forecast:::algorithm/Prophet   
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
    * Specifies the forecast types used to train a predictor. You can specify up to five forecast types. Forecast types can be quantiles from 0.01 to 0.99, by increments of 0.01 or higher. You can also specify the mean forecast with mean.  The default value is ["0.10", "0.50", "0.9"].
    */
  var ForecastTypes: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.ForecastTypes] = js.native
  
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
    * Whether to perform hyperparameter optimization (HPO). HPO finds optimal hyperparameter values for your training data. The process of performing HPO is known as running a hyperparameter tuning job. The default value is false. In this case, Amazon Forecast uses default hyperparameter values from the chosen algorithm. To override the default values, set PerformHPO to true and, optionally, supply the HyperParameterTuningJobConfig object. The tuning job specifies a metric to optimize, which hyperparameters participate in tuning, and the valid range for each tunable hyperparameter. In this case, you are required to specify an algorithm and PerformAutoML must be false. The following algorithms support HPO:   DeepAR+   CNN-QR  
    */
  var PerformHPO: js.UndefOr[Boolean] = js.native
  
  /**
    * A name for the predictor.
    */
  var PredictorName: Name = js.native
  
  /**
    * The optional metadata that you apply to the predictor to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50.   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8.   Maximum value length - 256 Unicode characters in UTF-8.   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws as its prefix but the key does not, then Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.  
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Tags] = js.native
  
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
  implicit class CreatePredictorRequestMutableBuilder[Self <: CreatePredictorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmArn(value: Arn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmArnUndefined: Self = StObject.set(x, "AlgorithmArn", js.undefined)
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
    
    @scala.inline
    def setEvaluationParameters(value: EvaluationParameters): Self = StObject.set(x, "EvaluationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationParametersUndefined: Self = StObject.set(x, "EvaluationParameters", js.undefined)
    
    @scala.inline
    def setFeaturizationConfig(value: FeaturizationConfig): Self = StObject.set(x, "FeaturizationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastHorizon(value: Integer): Self = StObject.set(x, "ForecastHorizon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastTypes(value: ForecastTypes): Self = StObject.set(x, "ForecastTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastTypesUndefined: Self = StObject.set(x, "ForecastTypes", js.undefined)
    
    @scala.inline
    def setForecastTypesVarargs(value: ForecastType*): Self = StObject.set(x, "ForecastTypes", js.Array(value :_*))
    
    @scala.inline
    def setHPOConfig(value: HyperParameterTuningJobConfig): Self = StObject.set(x, "HPOConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHPOConfigUndefined: Self = StObject.set(x, "HPOConfig", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformAutoML(value: Boolean): Self = StObject.set(x, "PerformAutoML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformAutoMLUndefined: Self = StObject.set(x, "PerformAutoML", js.undefined)
    
    @scala.inline
    def setPerformHPO(value: Boolean): Self = StObject.set(x, "PerformHPO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformHPOUndefined: Self = StObject.set(x, "PerformHPO", js.undefined)
    
    @scala.inline
    def setPredictorName(value: Name): Self = StObject.set(x, "PredictorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTrainingParameters(value: TrainingParameters): Self = StObject.set(x, "TrainingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingParametersUndefined: Self = StObject.set(x, "TrainingParameters", js.undefined)
  }
}
