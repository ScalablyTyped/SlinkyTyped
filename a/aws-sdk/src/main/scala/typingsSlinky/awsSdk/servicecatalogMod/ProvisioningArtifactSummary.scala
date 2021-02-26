package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningArtifactSummary extends StObject {
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.native
  
  /**
    * The identifier of the provisioning artifact.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Id] = js.native
  
  /**
    * The name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.native
  
  /**
    * The metadata for the provisioning artifact. This is used with AWS Marketplace products.
    */
  var ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo] = js.native
}
object ProvisioningArtifactSummary {
  
  @scala.inline
  def apply(): ProvisioningArtifactSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactSummary]
  }
  
  @scala.inline
  implicit class ProvisioningArtifactSummaryMutableBuilder[Self <: ProvisioningArtifactSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: ProvisioningArtifactDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ProvisioningArtifactName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactMetadata(value: ProvisioningArtifactInfo): Self = StObject.set(x, "ProvisioningArtifactMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactMetadataUndefined: Self = StObject.set(x, "ProvisioningArtifactMetadata", js.undefined)
  }
}
