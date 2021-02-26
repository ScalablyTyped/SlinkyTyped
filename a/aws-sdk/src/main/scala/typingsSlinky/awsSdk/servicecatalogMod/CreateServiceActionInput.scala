package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateServiceActionInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The self-service action definition. Can be one of the following:  Name  The name of the AWS Systems Manager document (SSM document). For example, AWS-RestartEC2Instance. If you are using a shared SSM document, you must provide the ARN instead of the name.  Version  The AWS Systems Manager automation document version. For example, "Version": "1"   AssumeRole  The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For example, "AssumeRole": "arn:aws:iam::12345678910:role/ActionRole". To reuse the provisioned product launch role, set to "AssumeRole": "LAUNCH_ROLE".  Parameters  The list of parameters in JSON format. For example: [{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}] or [{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}].  
    */
  var Definition: ServiceActionDefinitionMap = js.native
  
  /**
    * The service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: ServiceActionDefinitionType = js.native
  
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.native
  
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  
  /**
    * The self-service action name.
    */
  var Name: ServiceActionName = js.native
}
object CreateServiceActionInput {
  
  @scala.inline
  def apply(
    Definition: ServiceActionDefinitionMap,
    DefinitionType: ServiceActionDefinitionType,
    IdempotencyToken: IdempotencyToken,
    Name: ServiceActionName
  ): CreateServiceActionInput = {
    val __obj = js.Dynamic.literal(Definition = Definition.asInstanceOf[js.Any], DefinitionType = DefinitionType.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceActionInput]
  }
  
  @scala.inline
  implicit class CreateServiceActionInputMutableBuilder[Self <: CreateServiceActionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setDefinition(value: ServiceActionDefinitionMap): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionType(value: ServiceActionDefinitionType): Self = StObject.set(x, "DefinitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ServiceActionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ServiceActionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
