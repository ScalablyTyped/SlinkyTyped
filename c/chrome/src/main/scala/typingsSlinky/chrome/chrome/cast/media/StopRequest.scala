package typingsSlinky.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopRequest extends StObject {
  
  var customData: js.Object = js.native
}
object StopRequest {
  
  @scala.inline
  def apply(customData: js.Object): StopRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRequest]
  }
  
  @scala.inline
  implicit class StopRequestMutableBuilder[Self <: StopRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
  }
}
