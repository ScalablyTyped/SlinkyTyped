package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAuditSuppressionRequest extends StObject {
  
  var checkName: AuditCheckName = js.native
  
  /**
    *  The epoch timestamp in seconds at which this suppression expires. 
    */
  var clientRequestToken: ClientRequestToken = js.native
  
  /**
    *  The description of the audit suppression. 
    */
  var description: js.UndefOr[AuditDescription] = js.native
  
  /**
    *  The epoch timestamp in seconds at which this suppression expires. 
    */
  var expirationDate: js.UndefOr[js.Date] = js.native
  
  var resourceIdentifier: ResourceIdentifier = js.native
  
  /**
    *  Indicates whether a suppression should exist indefinitely or not. 
    */
  var suppressIndefinitely: js.UndefOr[SuppressIndefinitely] = js.native
}
object CreateAuditSuppressionRequest {
  
  @scala.inline
  def apply(
    checkName: AuditCheckName,
    clientRequestToken: ClientRequestToken,
    resourceIdentifier: ResourceIdentifier
  ): CreateAuditSuppressionRequest = {
    val __obj = js.Dynamic.literal(checkName = checkName.asInstanceOf[js.Any], clientRequestToken = clientRequestToken.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuditSuppressionRequest]
  }
  
  @scala.inline
  implicit class CreateAuditSuppressionRequestMutableBuilder[Self <: CreateAuditSuppressionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: AuditDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressIndefinitely(value: SuppressIndefinitely): Self = StObject.set(x, "suppressIndefinitely", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressIndefinitelyUndefined: Self = StObject.set(x, "suppressIndefinitely", js.undefined)
  }
}
