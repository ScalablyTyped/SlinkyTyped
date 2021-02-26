package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT
import org.scalablytyped.runtime.StObject
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
  def ObjectEventCreated(ph: OBJECT_EVENTS_CREATED): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEventCreated = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEventCreated]
  }
  
  @scala.inline
  def ObjectEventDestroyed(ph: OBJECT_EVENTS_DESTROYED): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEventDestroyed = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEventDestroyed]
  }
  
  @scala.inline
  def ObjectEventSnapshot(ph: OBJECT_EVENTS_SNAPSHOT): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEventSnapshot = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEventSnapshot]
  }
}
