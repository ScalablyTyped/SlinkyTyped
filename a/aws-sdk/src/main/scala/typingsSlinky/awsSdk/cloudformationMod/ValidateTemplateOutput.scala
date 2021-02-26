package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateTemplateOutput extends StObject {
  
  /**
    * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.
    */
  var Capabilities: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Capabilities] = js.native
  
  /**
    * The list of resources that generated the values in the Capabilities response element.
    */
  var CapabilitiesReason: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.CapabilitiesReason] = js.native
  
  /**
    * A list of the transforms that are declared in the template.
    */
  var DeclaredTransforms: js.UndefOr[TransformsList] = js.native
  
  /**
    * The description found within the template.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * A list of TemplateParameter structures.
    */
  var Parameters: js.UndefOr[TemplateParameters] = js.native
}
object ValidateTemplateOutput {
  
  @scala.inline
  def apply(): ValidateTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateTemplateOutput]
  }
  
  @scala.inline
  implicit class ValidateTemplateOutputMutableBuilder[Self <: ValidateTemplateOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesReason(value: CapabilitiesReason): Self = StObject.set(x, "CapabilitiesReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesReasonUndefined: Self = StObject.set(x, "CapabilitiesReason", js.undefined)
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredTransforms(value: TransformsList): Self = StObject.set(x, "DeclaredTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredTransformsUndefined: Self = StObject.set(x, "DeclaredTransforms", js.undefined)
    
    @scala.inline
    def setDeclaredTransformsVarargs(value: TransformName*): Self = StObject.set(x, "DeclaredTransforms", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setParameters(value: TemplateParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: TemplateParameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
