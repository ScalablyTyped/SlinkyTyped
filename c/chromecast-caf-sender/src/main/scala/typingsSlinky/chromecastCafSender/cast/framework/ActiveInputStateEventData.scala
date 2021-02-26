package typingsSlinky.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveInputStateEventData extends EventData {
  
  var activeInputState: ActiveInputState = js.native
}
object ActiveInputStateEventData {
  
  @scala.inline
  def apply(activeInputState: ActiveInputState, `type`: String): ActiveInputStateEventData = {
    val __obj = js.Dynamic.literal(activeInputState = activeInputState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveInputStateEventData]
  }
  
  @scala.inline
  implicit class ActiveInputStateEventDataMutableBuilder[Self <: ActiveInputStateEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveInputState(value: ActiveInputState): Self = StObject.set(x, "activeInputState", value.asInstanceOf[js.Any])
  }
}
