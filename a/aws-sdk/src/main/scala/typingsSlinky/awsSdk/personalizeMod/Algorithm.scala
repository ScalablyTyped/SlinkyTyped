package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var algorithmArn: js.UndefOr[Arn] = js.native
  
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var algorithmImage: js.UndefOr[AlgorithmImage] = js.native
  
  /**
    * The date and time (in Unix time) that the algorithm was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  var defaultHyperParameterRanges: js.UndefOr[DefaultHyperParameterRanges] = js.native
  
  /**
    * Specifies the default hyperparameters.
    */
  var defaultHyperParameters: js.UndefOr[HyperParameters] = js.native
  
  /**
    * Specifies the default maximum number of training jobs and parallel training jobs.
    */
  var defaultResourceConfig: js.UndefOr[ResourceConfig] = js.native
  
  /**
    * The date and time (in Unix time) that the algorithm was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the algorithm.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the role.
    */
  var roleArn: js.UndefOr[Arn] = js.native
  
  /**
    * The training input mode.
    */
  var trainingInputMode: js.UndefOr[TrainingInputMode] = js.native
}
object Algorithm {
  
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  @scala.inline
  implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmArn(value: Arn): Self = StObject.set(x, "algorithmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmArnUndefined: Self = StObject.set(x, "algorithmArn", js.undefined)
    
    @scala.inline
    def setAlgorithmImage(value: AlgorithmImage): Self = StObject.set(x, "algorithmImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmImageUndefined: Self = StObject.set(x, "algorithmImage", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setDefaultHyperParameterRanges(value: DefaultHyperParameterRanges): Self = StObject.set(x, "defaultHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHyperParameterRangesUndefined: Self = StObject.set(x, "defaultHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setDefaultHyperParameters(value: HyperParameters): Self = StObject.set(x, "defaultHyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHyperParametersUndefined: Self = StObject.set(x, "defaultHyperParameters", js.undefined)
    
    @scala.inline
    def setDefaultResourceConfig(value: ResourceConfig): Self = StObject.set(x, "defaultResourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResourceConfigUndefined: Self = StObject.set(x, "defaultResourceConfig", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setTrainingInputMode(value: TrainingInputMode): Self = StObject.set(x, "trainingInputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingInputModeUndefined: Self = StObject.set(x, "trainingInputMode", js.undefined)
  }
}
