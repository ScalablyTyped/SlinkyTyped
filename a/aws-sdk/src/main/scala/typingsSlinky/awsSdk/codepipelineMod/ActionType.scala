package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionType extends StObject {
  
  /**
    * The configuration properties for the action type.
    */
  var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.native
  
  /**
    * Represents information about an action type.
    */
  var id: ActionTypeId = js.native
  
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails = js.native
  
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails = js.native
  
  /**
    * The settings for the action type.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.native
}
object ActionType {
  
  @scala.inline
  def apply(id: ActionTypeId, inputArtifactDetails: ArtifactDetails, outputArtifactDetails: ArtifactDetails): ActionType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionType]
  }
  
  @scala.inline
  implicit class ActionTypeMutableBuilder[Self <: ActionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionConfigurationProperties(value: ActionConfigurationPropertyList): Self = StObject.set(x, "actionConfigurationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionConfigurationPropertiesUndefined: Self = StObject.set(x, "actionConfigurationProperties", js.undefined)
    
    @scala.inline
    def setActionConfigurationPropertiesVarargs(value: ActionConfigurationProperty*): Self = StObject.set(x, "actionConfigurationProperties", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ActionTypeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputArtifactDetails(value: ArtifactDetails): Self = StObject.set(x, "inputArtifactDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArtifactDetails(value: ArtifactDetails): Self = StObject.set(x, "outputArtifactDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: ActionTypeSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
