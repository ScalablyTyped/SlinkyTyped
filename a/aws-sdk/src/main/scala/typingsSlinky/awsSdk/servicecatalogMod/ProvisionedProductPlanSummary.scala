package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedProductPlanSummary extends StObject {
  
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.native
  
  /**
    * The plan type.
    */
  var PlanType: js.UndefOr[ProvisionedProductPlanType] = js.native
  
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.native
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.native
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
}
object ProvisionedProductPlanSummary {
  
  @scala.inline
  def apply(): ProvisionedProductPlanSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductPlanSummary]
  }
  
  @scala.inline
  implicit class ProvisionedProductPlanSummaryMutableBuilder[Self <: ProvisionedProductPlanSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlanId(value: Id): Self = StObject.set(x, "PlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "PlanId", js.undefined)
    
    @scala.inline
    def setPlanName(value: ProvisionedProductPlanName): Self = StObject.set(x, "PlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanNameUndefined: Self = StObject.set(x, "PlanName", js.undefined)
    
    @scala.inline
    def setPlanType(value: ProvisionedProductPlanType): Self = StObject.set(x, "PlanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanTypeUndefined: Self = StObject.set(x, "PlanType", js.undefined)
    
    @scala.inline
    def setProvisionProductId(value: Id): Self = StObject.set(x, "ProvisionProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionProductIdUndefined: Self = StObject.set(x, "ProvisionProductId", js.undefined)
    
    @scala.inline
    def setProvisionProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionProductNameUndefined: Self = StObject.set(x, "ProvisionProductName", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
  }
}
