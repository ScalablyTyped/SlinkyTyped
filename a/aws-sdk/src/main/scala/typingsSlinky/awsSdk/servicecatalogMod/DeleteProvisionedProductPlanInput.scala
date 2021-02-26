package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProvisionedProductPlanInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
    */
  var IgnoreErrors: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.IgnoreErrors] = js.native
  
  /**
    * The plan identifier.
    */
  var PlanId: Id = js.native
}
object DeleteProvisionedProductPlanInput {
  
  @scala.inline
  def apply(PlanId: Id): DeleteProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(PlanId = PlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisionedProductPlanInput]
  }
  
  @scala.inline
  implicit class DeleteProvisionedProductPlanInputMutableBuilder[Self <: DeleteProvisionedProductPlanInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: IgnoreErrors): Self = StObject.set(x, "IgnoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreErrorsUndefined: Self = StObject.set(x, "IgnoreErrors", js.undefined)
    
    @scala.inline
    def setPlanId(value: Id): Self = StObject.set(x, "PlanId", value.asInstanceOf[js.Any])
  }
}
