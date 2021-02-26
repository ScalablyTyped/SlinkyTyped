package typingsSlinky.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response[D, E] extends StObject {
  
  @JSName("$response")
  var $response: typingsSlinky.awsSdk.responseMod.Response[D, E] = js.native
}
object Response {
  
  @scala.inline
  def apply[D, E]($response: typingsSlinky.awsSdk.responseMod.Response[D, E]): Response[D, E] = {
    val __obj = js.Dynamic.literal($response = $response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[D, E]]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response[_, _], D, E] (val x: Self with (Response[D, E])) extends AnyVal {
    
    @scala.inline
    def set$response(value: typingsSlinky.awsSdk.responseMod.Response[D, E]): Self = StObject.set(x, "$response", value.asInstanceOf[js.Any])
  }
}
