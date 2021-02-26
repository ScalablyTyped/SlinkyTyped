package typingsSlinky.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNamespaceRequest extends StObject {
  
  /**
    * The ID of the namespace that you want to get information about.
    */
  var Id: ResourceId = js.native
}
object GetNamespaceRequest {
  
  @scala.inline
  def apply(Id: ResourceId): GetNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamespaceRequest]
  }
  
  @scala.inline
  implicit class GetNamespaceRequestMutableBuilder[Self <: GetNamespaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
