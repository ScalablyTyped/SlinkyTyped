package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnalysisRequest extends StObject {
  
  /**
    * The ID for the analysis that you're updating. This ID displays in the URL of the analysis.
    */
  var AnalysisId: RestrictiveResourceId = js.native
  
  /**
    * The ID of the AWS account that contains the analysis that you're updating.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * A descriptive name for the analysis that you're updating. This name displays for the analysis in the QuickSight console.
    */
  var Name: AnalysisName = js.native
  
  /**
    * The parameter names and override values that you want to use. An analysis can have any parameter type, and some parameters might accept multiple values. 
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Parameters] = js.native
  
  /**
    * A source entity to use for the analysis that you're updating. This metadata structure contains details that describe a source template and one or more datasets.
    */
  var SourceEntity: AnalysisSourceEntity = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the theme to apply to the analysis that you're creating. To see the theme in the QuickSight console, make sure that you have access to it.
    */
  var ThemeArn: js.UndefOr[Arn] = js.native
}
object UpdateAnalysisRequest {
  
  @scala.inline
  def apply(
    AnalysisId: RestrictiveResourceId,
    AwsAccountId: AwsAccountId,
    Name: AnalysisName,
    SourceEntity: AnalysisSourceEntity
  ): UpdateAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnalysisRequest]
  }
  
  @scala.inline
  implicit class UpdateAnalysisRequestMutableBuilder[Self <: UpdateAnalysisRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AnalysisName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setSourceEntity(value: AnalysisSourceEntity): Self = StObject.set(x, "SourceEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeArn(value: Arn): Self = StObject.set(x, "ThemeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeArnUndefined: Self = StObject.set(x, "ThemeArn", js.undefined)
  }
}
