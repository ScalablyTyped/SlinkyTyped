package typingsSlinky.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNamespaceResponse extends StObject {
  
  /**
    * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
    */
  var OperationId: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.OperationId] = js.native
}
object DeleteNamespaceResponse {
  
  @scala.inline
  def apply(): DeleteNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNamespaceResponse]
  }
  
  @scala.inline
  implicit class DeleteNamespaceResponseMutableBuilder[Self <: DeleteNamespaceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
