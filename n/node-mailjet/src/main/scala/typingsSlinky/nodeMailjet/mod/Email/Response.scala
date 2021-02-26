package typingsSlinky.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// responses
@js.native
trait Response extends StObject {
  
  val body: js.Object = js.native
}
object Response {
  
  @scala.inline
  def apply(body: js.Object): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
