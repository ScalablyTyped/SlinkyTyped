package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionExecutionInput extends StObject {
  
  var actionTypeId: js.UndefOr[ActionTypeId] = js.native
  
  /**
    * Configuration data for an action execution.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.native
  
  /**
    * Details of input artifacts of the action that correspond to the action execution.
    */
  var inputArtifacts: js.UndefOr[ArtifactDetailList] = js.native
  
  /**
    * The variable namespace associated with the action. All variables produced as output by this action fall under this namespace.
    */
  var namespace: js.UndefOr[ActionNamespace] = js.native
  
  /**
    * The AWS Region for the action, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.native
  
  /**
    * Configuration data for an action execution with all variable references replaced with their real values for the execution.
    */
  var resolvedConfiguration: js.UndefOr[ResolvedActionConfigurationMap] = js.native
  
  /**
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline. 
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}
object ActionExecutionInput {
  
  @scala.inline
  def apply(): ActionExecutionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionInput]
  }
  
  @scala.inline
  implicit class ActionExecutionInputMutableBuilder[Self <: ActionExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTypeId(value: ActionTypeId): Self = StObject.set(x, "actionTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeIdUndefined: Self = StObject.set(x, "actionTypeId", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ActionConfigurationMap): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setInputArtifacts(value: ArtifactDetailList): Self = StObject.set(x, "inputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArtifactsUndefined: Self = StObject.set(x, "inputArtifacts", js.undefined)
    
    @scala.inline
    def setInputArtifactsVarargs(value: ArtifactDetail*): Self = StObject.set(x, "inputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setNamespace(value: ActionNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setRegion(value: AWSRegionName): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setResolvedConfiguration(value: ResolvedActionConfigurationMap): Self = StObject.set(x, "resolvedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedConfigurationUndefined: Self = StObject.set(x, "resolvedConfiguration", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
