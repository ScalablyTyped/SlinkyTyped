package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.anon.Issuets
import typingsSlinky.hermesProfileTransformer.anon.Linkedid
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.CLOCK_SYNC_EVENTS
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.COMPLETE_EVENTS
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.COUNTER_EVENTS
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_END
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_END
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_START
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_STEP
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.INSTANT_EVENTS
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.LINKED_ID_EVENTS
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MARK_EVENTS
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.METADATA_EVENTS
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.SAMPLE_EVENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.DurationEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.CompleteEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MetadataEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.SampleEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ObjectEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ClockSyncEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ContextEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.InstantEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.CounterEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MarkEvent
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.LinkedIDEvent
*/
trait Event extends js.Object
object Event {
  
  @scala.inline
  def FlowEventEnd(ph: FLOW_EVENTS_END): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def InstantEvent(ph: INSTANT_EVENTS, s: String): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def MetadataEvent(ph: METADATA_EVENTS): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def FlowEventStart(ph: FLOW_EVENTS_START): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def MarkEvent(ph: MARK_EVENTS): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ObjectEventDestroyed(ph: OBJECT_EVENTS_DESTROYED): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def DurationEventEnd(ph: DURATION_EVENTS_END): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def DurationEventBegin(ph: DURATION_EVENTS_BEGIN): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def LinkedIDEvent(args: Linkedid, id: Double, ph: LINKED_ID_EVENTS): Event = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def FlowEventStep(ph: FLOW_EVENTS_STEP): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ObjectEventSnapshot(ph: OBJECT_EVENTS_SNAPSHOT): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ClockSyncEvent(args: Issuets, ph: CLOCK_SYNC_EVENTS): Event = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def CounterEvent(ph: COUNTER_EVENTS): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def CompleteEvent(dur: Double, ph: COMPLETE_EVENTS): Event = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ObjectEventCreated(ph: OBJECT_EVENTS_CREATED): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def SampleEvent(ph: SAMPLE_EVENTS): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}
