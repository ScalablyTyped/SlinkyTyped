package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningArtifactView extends StObject {
  
  /**
    * Summary information about a product view.
    */
  var ProductViewSummary: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  
  /**
    * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
    */
  var ProvisioningArtifact: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifact] = js.native
}
object ProvisioningArtifactView {
  
  @scala.inline
  def apply(): ProvisioningArtifactView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactView]
  }
  
  @scala.inline
  implicit class ProvisioningArtifactViewMutableBuilder[Self <: ProvisioningArtifactView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductViewSummary(value: ProductViewSummary): Self = StObject.set(x, "ProductViewSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductViewSummaryUndefined: Self = StObject.set(x, "ProductViewSummary", js.undefined)
    
    @scala.inline
    def setProvisioningArtifact(value: ProvisioningArtifact): Self = StObject.set(x, "ProvisioningArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactUndefined: Self = StObject.set(x, "ProvisioningArtifact", js.undefined)
  }
}
