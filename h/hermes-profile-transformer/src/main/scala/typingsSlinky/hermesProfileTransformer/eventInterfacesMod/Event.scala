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
import org.scalablytyped.runtime.StObject
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
trait Event extends StObject
object Event {
  
  @scala.inline
  def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventEnd = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventEnd]
  }
  
  @scala.inline
  def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventInstant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventInstant]
  }
  
  @scala.inline
  def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventStart = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventStart]
  }
  
  @scala.inline
  def ClockSyncEvent(args: Issuets, ph: CLOCK_SYNC_EVENTS): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ClockSyncEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ClockSyncEvent]
  }
  
  @scala.inline
  def CompleteEvent(dur: Double, ph: COMPLETE_EVENTS): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.CompleteEvent = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.CompleteEvent]
  }
  
  @scala.inline
  def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ContextEventEnter]
  }
  
  @scala.inline
  def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ContextEventLeave = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ContextEventLeave]
  }
  
  @scala.inline
  def CounterEvent(ph: COUNTER_EVENTS): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.CounterEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.CounterEvent]
  }
  
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
  
  @scala.inline
  def FlowEventEnd(ph: FLOW_EVENTS_END): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventEnd]
  }
  
  @scala.inline
  def FlowEventStart(ph: FLOW_EVENTS_START): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStart = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStart]
  }
  
  @scala.inline
  def FlowEventStep(ph: FLOW_EVENTS_STEP): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStep = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStep]
  }
  
  @scala.inline
  def InstantEvent(ph: INSTANT_EVENTS, s: String): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.InstantEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.InstantEvent]
  }
  
  @scala.inline
  def LinkedIDEvent(args: Linkedid, id: Double, ph: LINKED_ID_EVENTS): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.LinkedIDEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.LinkedIDEvent]
  }
  
  @scala.inline
  def MarkEvent(ph: MARK_EVENTS): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MarkEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MarkEvent]
  }
  
  @scala.inline
  def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal]
  }
  
  @scala.inline
  def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess]
  }
  
  @scala.inline
  def MetadataEvent(ph: METADATA_EVENTS): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MetadataEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MetadataEvent]
  }
  
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
  
  @scala.inline
  def SampleEvent(ph: SAMPLE_EVENTS): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.SampleEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.SampleEvent]
  }
}
