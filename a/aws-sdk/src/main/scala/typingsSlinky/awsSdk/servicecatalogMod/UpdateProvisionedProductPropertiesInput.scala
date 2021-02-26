package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProvisionedProductPropertiesInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The idempotency token that uniquely identifies the provisioning product update request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: Id = js.native
  
  /**
    * A map that contains the provisioned product properties to be updated. The LAUNCH_ROLE key accepts role ARNs. This key allows an administrator to call UpdateProvisionedProductProperties to update the launch role that is associated with a provisioned product. This role is used when an end user calls a provisioning operation such as UpdateProvisionedProduct, TerminateProvisionedProduct, or ExecuteProvisionedProductServiceAction. Only a role ARN is valid. A user ARN is invalid.  The OWNER key accepts user ARNs and role ARNs. The owner is the user that has permission to see, update, terminate, and execute service actions in the provisioned product. The administrator can change the owner of a provisioned product to another IAM user within the same account. Both end user owners and administrators can see ownership history of the provisioned product using the ListRecordHistory API. The new owner can describe all past records for the provisioned product using the DescribeRecord API. The previous owner can no longer use DescribeRecord, but can still see the product's history from when he was an owner using ListRecordHistory. If a provisioned product ownership is assigned to an end user, they can see and perform any action through the API or Service Catalog console such as update, terminate, and execute service actions. If an end user provisions a product and the owner is updated to someone else, they will no longer be able to see or perform any actions through API or the Service Catalog console on that provisioned product.
    */
  var ProvisionedProductProperties: typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductProperties = js.native
}
object UpdateProvisionedProductPropertiesInput {
  
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    ProvisionedProductId: Id,
    ProvisionedProductProperties: ProvisionedProductProperties
  ): UpdateProvisionedProductPropertiesInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], ProvisionedProductId = ProvisionedProductId.asInstanceOf[js.Any], ProvisionedProductProperties = ProvisionedProductProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisionedProductPropertiesInput]
  }
  
  @scala.inline
  implicit class UpdateProvisionedProductPropertiesInputMutableBuilder[Self <: UpdateProvisionedProductPropertiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductId(value: Id): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductProperties(value: ProvisionedProductProperties): Self = StObject.set(x, "ProvisionedProductProperties", value.asInstanceOf[js.Any])
  }
}
