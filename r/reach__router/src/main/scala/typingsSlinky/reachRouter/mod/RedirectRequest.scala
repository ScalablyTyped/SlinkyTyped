package typingsSlinky.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectRequest extends StObject {
  
  var uri: String = js.native
}
object RedirectRequest {
  
  @scala.inline
  def apply(uri: String): RedirectRequest = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequest]
  }
  
  @scala.inline
  implicit class RedirectRequestMutableBuilder[Self <: RedirectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
