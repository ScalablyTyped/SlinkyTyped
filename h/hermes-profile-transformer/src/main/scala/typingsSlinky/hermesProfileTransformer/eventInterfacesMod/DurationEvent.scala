package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.DurationEventBegin
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.DurationEventEnd
*/
trait DurationEvent extends Event
object DurationEvent {
  
  @scala.inline
  def DurationEventBegin(ph: DURATION_EVENTS_BEGIN): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.DurationEventBegin = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.DurationEventBegin]
  }
  
  @scala.inline
  def DurationEventEnd(ph: DURATION_EVENTS_END): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.DurationEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.DurationEventEnd]
  }
}
