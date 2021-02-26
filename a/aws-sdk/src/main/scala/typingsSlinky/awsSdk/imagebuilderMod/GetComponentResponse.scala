package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComponentResponse extends StObject {
  
  /**
    * The component object associated with the specified ARN. 
    */
  var component: js.UndefOr[Component] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object GetComponentResponse {
  
  @scala.inline
  def apply(): GetComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComponentResponse]
  }
  
  @scala.inline
  implicit class GetComponentResponseMutableBuilder[Self <: GetComponentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
