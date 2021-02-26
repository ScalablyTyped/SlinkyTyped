package typingsSlinky.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait History extends StObject {
  
  def listen(listener: HistoryListener): HistoryUnsubscribe = js.native
  
  val location: HistoryLocation = js.native
  
  var navigate: NavigateFn = js.native
  
  val transitioning: Boolean = js.native
}
object History {
  
  @scala.inline
  def apply(
    listen: HistoryListener => HistoryUnsubscribe,
    location: HistoryLocation,
    navigate: NavigateFn,
    transitioning: Boolean
  ): History = {
    val __obj = js.Dynamic.literal(listen = js.Any.fromFunction1(listen), location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], transitioning = transitioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
  
  @scala.inline
  implicit class HistoryMutableBuilder[Self <: History] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListen(value: HistoryListener => HistoryUnsubscribe): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocation(value: HistoryLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitioning(value: Boolean): Self = StObject.set(x, "transitioning", value.asInstanceOf[js.Any])
  }
}
