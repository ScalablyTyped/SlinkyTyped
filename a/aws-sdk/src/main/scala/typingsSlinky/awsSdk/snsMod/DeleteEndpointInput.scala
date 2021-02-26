package typingsSlinky.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEndpointInput extends StObject {
  
  /**
    * EndpointArn of endpoint to delete.
    */
  var EndpointArn: String = js.native
}
object DeleteEndpointInput {
  
  @scala.inline
  def apply(EndpointArn: String): DeleteEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointInput]
  }
  
  @scala.inline
  implicit class DeleteEndpointInputMutableBuilder[Self <: DeleteEndpointInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
