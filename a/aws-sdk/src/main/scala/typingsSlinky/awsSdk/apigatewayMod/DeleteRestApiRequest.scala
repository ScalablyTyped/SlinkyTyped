package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRestApiRequest extends StObject {
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object DeleteRestApiRequest {
  
  @scala.inline
  def apply(restApiId: String): DeleteRestApiRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRestApiRequest]
  }
  
  @scala.inline
  implicit class DeleteRestApiRequestMutableBuilder[Self <: DeleteRestApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
