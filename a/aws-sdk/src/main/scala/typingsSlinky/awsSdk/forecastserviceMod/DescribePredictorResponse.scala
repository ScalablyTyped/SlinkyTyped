package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePredictorResponse extends StObject {
  
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
    * The forecast types used during predictor training. Default value is ["0.1","0.5","0.9"] 
    */
  var ForecastTypes: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.ForecastTypes] = js.native
  
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
    * The default training parameters or overrides selected during model training. When running AutoML or choosing HPO with CNN-QR or DeepAR+, the optimized values for the chosen hyperparameters are returned. For more information, see aws-forecast-choosing-recipes.
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
  implicit class DescribePredictorResponseMutableBuilder[Self <: DescribePredictorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmArn(value: Arn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmArnUndefined: Self = StObject.set(x, "AlgorithmArn", js.undefined)
    
    @scala.inline
    def setAutoMLAlgorithmArns(value: ArnList): Self = StObject.set(x, "AutoMLAlgorithmArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLAlgorithmArnsUndefined: Self = StObject.set(x, "AutoMLAlgorithmArns", js.undefined)
    
    @scala.inline
    def setAutoMLAlgorithmArnsVarargs(value: Arn*): Self = StObject.set(x, "AutoMLAlgorithmArns", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDatasetImportJobArns(value: ArnList): Self = StObject.set(x, "DatasetImportJobArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetImportJobArnsUndefined: Self = StObject.set(x, "DatasetImportJobArns", js.undefined)
    
    @scala.inline
    def setDatasetImportJobArnsVarargs(value: Arn*): Self = StObject.set(x, "DatasetImportJobArns", js.Array(value :_*))
    
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
    def setFeaturizationConfigUndefined: Self = StObject.set(x, "FeaturizationConfig", js.undefined)
    
    @scala.inline
    def setForecastHorizon(value: Integer): Self = StObject.set(x, "ForecastHorizon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastHorizonUndefined: Self = StObject.set(x, "ForecastHorizon", js.undefined)
    
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
    def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    @scala.inline
    def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setPerformAutoML(value: Boolean): Self = StObject.set(x, "PerformAutoML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformAutoMLUndefined: Self = StObject.set(x, "PerformAutoML", js.undefined)
    
    @scala.inline
    def setPerformHPO(value: Boolean): Self = StObject.set(x, "PerformHPO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformHPOUndefined: Self = StObject.set(x, "PerformHPO", js.undefined)
    
    @scala.inline
    def setPredictorArn(value: Name): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
    
    @scala.inline
    def setPredictorExecutionDetails(value: PredictorExecutionDetails): Self = StObject.set(x, "PredictorExecutionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorExecutionDetailsUndefined: Self = StObject.set(x, "PredictorExecutionDetails", js.undefined)
    
    @scala.inline
    def setPredictorName(value: Name): Self = StObject.set(x, "PredictorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorNameUndefined: Self = StObject.set(x, "PredictorName", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTrainingParameters(value: TrainingParameters): Self = StObject.set(x, "TrainingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingParametersUndefined: Self = StObject.set(x, "TrainingParameters", js.undefined)
  }
}
