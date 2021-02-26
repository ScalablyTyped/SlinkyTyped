package typingsSlinky.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableDomainTransferLockResponse extends StObject {
  
  /**
    * Identifier for tracking the progress of the request. To query the operation status, use GetOperationDetail.
    */
  var OperationId: typingsSlinky.awsSdk.route53domainsMod.OperationId = js.native
}
object DisableDomainTransferLockResponse {
  
  @scala.inline
  def apply(OperationId: OperationId): DisableDomainTransferLockResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDomainTransferLockResponse]
  }
  
  @scala.inline
  implicit class DisableDomainTransferLockResponseMutableBuilder[Self <: DisableDomainTransferLockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
