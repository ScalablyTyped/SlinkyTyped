package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedServiceActionAssociation extends StObject {
  
  /**
    * The error code. Valid values are listed below.
    */
  var ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode] = js.native
  
  /**
    * A text description of the error.
    */
  var ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage] = js.native
  
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: js.UndefOr[Id] = js.native
  
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var ServiceActionId: js.UndefOr[Id] = js.native
}
object FailedServiceActionAssociation {
  
  @scala.inline
  def apply(): FailedServiceActionAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedServiceActionAssociation]
  }
  
  @scala.inline
  implicit class FailedServiceActionAssociationMutableBuilder[Self <: FailedServiceActionAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ServiceActionAssociationErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ServiceActionAssociationErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setServiceActionId(value: Id): Self = StObject.set(x, "ServiceActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionIdUndefined: Self = StObject.set(x, "ServiceActionId", js.undefined)
  }
}
