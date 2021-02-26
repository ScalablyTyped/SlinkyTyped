package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveTabIndex extends StObject {
  
  var activeTabIndex: Double = js.native
  
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]] = js.native
}
object ActiveTabIndex {
  
  @scala.inline
  def apply(
    activeTabIndex: Double,
    event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]
  ): ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTabIndex]
  }
  
  @scala.inline
  implicit class ActiveTabIndexMutableBuilder[Self <: ActiveTabIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
