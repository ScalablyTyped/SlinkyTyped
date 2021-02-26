package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProvisioningParametersOutput extends StObject {
  
  /**
    * Information about the constraints used to provision the product.
    */
  var ConstraintSummaries: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ConstraintSummaries] = js.native
  
  /**
    * The output of the provisioning artifact.
    */
  var ProvisioningArtifactOutputs: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactOutputs] = js.native
  
  /**
    * Information about the parameters used to provision the product.
    */
  var ProvisioningArtifactParameters: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactParameters] = js.native
  
  /**
    * An object that contains information about preferences, such as regions and accounts, for the provisioning artifact.
    */
  var ProvisioningArtifactPreferences: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactPreferences] = js.native
  
  /**
    * Information about the TagOptions associated with the resource.
    */
  var TagOptions: js.UndefOr[TagOptionSummaries] = js.native
  
  /**
    * Any additional metadata specifically related to the provisioning of the product. For example, see the Version field of the CloudFormation template.
    */
  var UsageInstructions: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.UsageInstructions] = js.native
}
object DescribeProvisioningParametersOutput {
  
  @scala.inline
  def apply(): DescribeProvisioningParametersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningParametersOutput]
  }
  
  @scala.inline
  implicit class DescribeProvisioningParametersOutputMutableBuilder[Self <: DescribeProvisioningParametersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraintSummaries(value: ConstraintSummaries): Self = StObject.set(x, "ConstraintSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintSummariesUndefined: Self = StObject.set(x, "ConstraintSummaries", js.undefined)
    
    @scala.inline
    def setConstraintSummariesVarargs(value: ConstraintSummary*): Self = StObject.set(x, "ConstraintSummaries", js.Array(value :_*))
    
    @scala.inline
    def setProvisioningArtifactOutputs(value: ProvisioningArtifactOutputs): Self = StObject.set(x, "ProvisioningArtifactOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactOutputsUndefined: Self = StObject.set(x, "ProvisioningArtifactOutputs", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactOutputsVarargs(value: ProvisioningArtifactOutput*): Self = StObject.set(x, "ProvisioningArtifactOutputs", js.Array(value :_*))
    
    @scala.inline
    def setProvisioningArtifactParameters(value: ProvisioningArtifactParameters): Self = StObject.set(x, "ProvisioningArtifactParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactParametersUndefined: Self = StObject.set(x, "ProvisioningArtifactParameters", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactParametersVarargs(value: ProvisioningArtifactParameter*): Self = StObject.set(x, "ProvisioningArtifactParameters", js.Array(value :_*))
    
    @scala.inline
    def setProvisioningArtifactPreferences(value: ProvisioningArtifactPreferences): Self = StObject.set(x, "ProvisioningArtifactPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactPreferencesUndefined: Self = StObject.set(x, "ProvisioningArtifactPreferences", js.undefined)
    
    @scala.inline
    def setTagOptions(value: TagOptionSummaries): Self = StObject.set(x, "TagOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagOptionsUndefined: Self = StObject.set(x, "TagOptions", js.undefined)
    
    @scala.inline
    def setTagOptionsVarargs(value: TagOptionSummary*): Self = StObject.set(x, "TagOptions", js.Array(value :_*))
    
    @scala.inline
    def setUsageInstructions(value: UsageInstructions): Self = StObject.set(x, "UsageInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageInstructionsUndefined: Self = StObject.set(x, "UsageInstructions", js.undefined)
    
    @scala.inline
    def setUsageInstructionsVarargs(value: UsageInstruction*): Self = StObject.set(x, "UsageInstructions", js.Array(value :_*))
  }
}
