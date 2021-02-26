package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectVersionDescription extends StObject {
  
  /**
    * The duration, in seconds, that the model version has been billed for training. This value is only returned if the model version has been successfully trained.
    */
  var BillableTrainingTimeInSeconds: js.UndefOr[ULong] = js.native
  
  /**
    * The Unix datetime for the date and time that training started.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The training results. EvaluationResult is only returned if training is successful.
    */
  var EvaluationResult: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.EvaluationResult] = js.native
  
  /**
    * The location of the summary manifest. The summary manifest provides aggregate data validation results for the training and test datasets.
    */
  var ManifestSummary: js.UndefOr[GroundTruthManifest] = js.native
  
  /**
    * The minimum number of inference units used by the model. For more information, see StartProjectVersion.
    */
  var MinInferenceUnits: js.UndefOr[InferenceUnits] = js.native
  
  /**
    * The location where training results are saved.
    */
  var OutputConfig: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.OutputConfig] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the model version. 
    */
  var ProjectVersionArn: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ProjectVersionArn] = js.native
  
  /**
    * The current status of the model version.
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.native
  
  /**
    * A descriptive message for an error or warning that occurred.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.StatusMessage] = js.native
  
  /**
    * Contains information about the testing results.
    */
  var TestingDataResult: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.TestingDataResult] = js.native
  
  /**
    * Contains information about the training results.
    */
  var TrainingDataResult: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.TrainingDataResult] = js.native
  
  /**
    * The Unix date and time that training of the model ended.
    */
  var TrainingEndTimestamp: js.UndefOr[js.Date] = js.native
}
object ProjectVersionDescription {
  
  @scala.inline
  def apply(): ProjectVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectVersionDescription]
  }
  
  @scala.inline
  implicit class ProjectVersionDescriptionMutableBuilder[Self <: ProjectVersionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillableTrainingTimeInSeconds(value: ULong): Self = StObject.set(x, "BillableTrainingTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillableTrainingTimeInSecondsUndefined: Self = StObject.set(x, "BillableTrainingTimeInSeconds", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setEvaluationResult(value: EvaluationResult): Self = StObject.set(x, "EvaluationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationResultUndefined: Self = StObject.set(x, "EvaluationResult", js.undefined)
    
    @scala.inline
    def setManifestSummary(value: GroundTruthManifest): Self = StObject.set(x, "ManifestSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestSummaryUndefined: Self = StObject.set(x, "ManifestSummary", js.undefined)
    
    @scala.inline
    def setMinInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MinInferenceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinInferenceUnitsUndefined: Self = StObject.set(x, "MinInferenceUnits", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "OutputConfig", js.undefined)
    
    @scala.inline
    def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectVersionArnUndefined: Self = StObject.set(x, "ProjectVersionArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ProjectVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTestingDataResult(value: TestingDataResult): Self = StObject.set(x, "TestingDataResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestingDataResultUndefined: Self = StObject.set(x, "TestingDataResult", js.undefined)
    
    @scala.inline
    def setTrainingDataResult(value: TrainingDataResult): Self = StObject.set(x, "TrainingDataResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingDataResultUndefined: Self = StObject.set(x, "TrainingDataResult", js.undefined)
    
    @scala.inline
    def setTrainingEndTimestamp(value: js.Date): Self = StObject.set(x, "TrainingEndTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingEndTimestampUndefined: Self = StObject.set(x, "TrainingEndTimestamp", js.undefined)
  }
}
