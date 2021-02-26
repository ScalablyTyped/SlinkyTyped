package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveIndex extends StObject {
  
  var activeIndex: Double = js.native
  
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]] = js.native
}
object ActiveIndex {
  
  @scala.inline
  def apply(
    activeIndex: Double,
    event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]
  ): ActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndex]
  }
  
  @scala.inline
  implicit class ActiveIndexMutableBuilder[Self <: ActiveIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
