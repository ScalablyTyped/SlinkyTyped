package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTemplateRequest extends StObject {
  
  /**
    * The ID of the AWS account that contains the template that you're updating.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The name for the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
  
  /**
    * The entity that you are using as a source when you update the template. In SourceEntity, you specify the type of object you're using as source: SourceTemplate for a template or SourceAnalysis for an analysis. Both of these require an Amazon Resource Name (ARN). For SourceTemplate, specify the ARN of the source template. For SourceAnalysis, specify the ARN of the source analysis. The SourceTemplate ARN can contain any AWS Account and any QuickSight-supported AWS Region.  Use the DataSetReferences entity within SourceTemplate or SourceAnalysis to list the replacement datasets for the placeholders listed in the original. The schema in each dataset must match its placeholder. 
    */
  var SourceEntity: TemplateSourceEntity = js.native
  
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId = js.native
  
  /**
    * A description of the current template version that is being updated. Every time you call UpdateTemplate, you create a new version of the template. Each version of the template maintains a description of the version in the VersionDescription field.
    */
  var VersionDescription: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.VersionDescription] = js.native
}
object UpdateTemplateRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, SourceEntity: TemplateSourceEntity, TemplateId: RestrictiveResourceId): UpdateTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateRequest]
  }
  
  @scala.inline
  implicit class UpdateTemplateRequestMutableBuilder[Self <: UpdateTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: TemplateName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSourceEntity(value: TemplateSourceEntity): Self = StObject.set(x, "SourceEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDescription(value: VersionDescription): Self = StObject.set(x, "VersionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDescriptionUndefined: Self = StObject.set(x, "VersionDescription", js.undefined)
  }
}
