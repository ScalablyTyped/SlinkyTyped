package typingsSlinky.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PauseRequest extends StObject {
  
  var customData: js.Object = js.native
}
object PauseRequest {
  
  @scala.inline
  def apply(customData: js.Object): PauseRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseRequest]
  }
  
  @scala.inline
  implicit class PauseRequestMutableBuilder[Self <: PauseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
  }
}
