package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEventCreated
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEventSnapshot
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEventDestroyed
*/
trait ObjectEvent extends Event
object ObjectEvent {
  
  @scala.inline
  def ObjectEventCreated(ph: OBJECT_EVENTS_CREATED): ObjectEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectEvent]
  }
  
  @scala.inline
  def ObjectEventSnapshot(ph: OBJECT_EVENTS_SNAPSHOT): ObjectEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectEvent]
  }
  
  @scala.inline
  def ObjectEventDestroyed(ph: OBJECT_EVENTS_DESTROYED): ObjectEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectEvent]
  }
}
