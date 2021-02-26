package typingsSlinky.hermesProfileTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phasesMod {
  
  @js.native
  sealed trait EventsPhase extends StObject
  @JSImport("hermes-profile-transformer/dist/types/Phases", "EventsPhase")
  @js.native
  object EventsPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventsPhase with String] = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_END extends EventsPhase
    /* "F" */ val ASYNC_EVENTS_END: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_END with String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_NESTABLE_END extends EventsPhase
    /* "e" */ val ASYNC_EVENTS_NESTABLE_END: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END with String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_NESTABLE_INSTANT extends EventsPhase
    /* "n" */ val ASYNC_EVENTS_NESTABLE_INSTANT: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT with String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_NESTABLE_START extends EventsPhase
    /* "b" */ val ASYNC_EVENTS_NESTABLE_START: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START with String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_START extends EventsPhase
    /* "S" */ val ASYNC_EVENTS_START: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_START with String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_STEP_INTO extends EventsPhase
    /* "T" */ val ASYNC_EVENTS_STEP_INTO: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_STEP_INTO with String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_STEP_PAST extends EventsPhase
    /* "p" */ val ASYNC_EVENTS_STEP_PAST: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_STEP_PAST with String = js.native
    
    @js.native
    sealed trait CLOCK_SYNC_EVENTS extends EventsPhase
    /* "c" */ val CLOCK_SYNC_EVENTS: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.CLOCK_SYNC_EVENTS with String = js.native
    
    @js.native
    sealed trait COMPLETE_EVENTS extends EventsPhase
    /* "X" */ val COMPLETE_EVENTS: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.COMPLETE_EVENTS with String = js.native
    
    @js.native
    sealed trait CONTEXT_EVENTS_ENTER extends EventsPhase
    /* "(" */ val CONTEXT_EVENTS_ENTER: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_ENTER with String = js.native
    
    @js.native
    sealed trait CONTEXT_EVENTS_LEAVE extends EventsPhase
    /* ")" */ val CONTEXT_EVENTS_LEAVE: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE with String = js.native
    
    @js.native
    sealed trait COUNTER_EVENTS extends EventsPhase
    /* "C" */ val COUNTER_EVENTS: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.COUNTER_EVENTS with String = js.native
    
    @js.native
    sealed trait DURATION_EVENTS_BEGIN extends EventsPhase
    /* "B" */ val DURATION_EVENTS_BEGIN: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_BEGIN with String = js.native
    
    @js.native
    sealed trait DURATION_EVENTS_END extends EventsPhase
    /* "E" */ val DURATION_EVENTS_END: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_END with String = js.native
    
    @js.native
    sealed trait FLOW_EVENTS_END extends EventsPhase
    /* "f" */ val FLOW_EVENTS_END: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_END with String = js.native
    
    @js.native
    sealed trait FLOW_EVENTS_START extends EventsPhase
    /* "s" */ val FLOW_EVENTS_START: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_START with String = js.native
    
    @js.native
    sealed trait FLOW_EVENTS_STEP extends EventsPhase
    /* "t" */ val FLOW_EVENTS_STEP: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_STEP with String = js.native
    
    @js.native
    sealed trait INSTANT_EVENTS extends EventsPhase
    /* "I" */ val INSTANT_EVENTS: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.INSTANT_EVENTS with String = js.native
    
    @js.native
    sealed trait LINKED_ID_EVENTS extends EventsPhase
    /* "=" */ val LINKED_ID_EVENTS: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.LINKED_ID_EVENTS with String = js.native
    
    @js.native
    sealed trait MARK_EVENTS extends EventsPhase
    /* "R" */ val MARK_EVENTS: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MARK_EVENTS with String = js.native
    
    @js.native
    sealed trait MEMORY_DUMP_EVENTS_GLOBAL extends EventsPhase
    /* "V" */ val MEMORY_DUMP_EVENTS_GLOBAL: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL with String = js.native
    
    @js.native
    sealed trait MEMORY_DUMP_EVENTS_PROCESS extends EventsPhase
    /* "v" */ val MEMORY_DUMP_EVENTS_PROCESS: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS with String = js.native
    
    @js.native
    sealed trait METADATA_EVENTS extends EventsPhase
    /* "M" */ val METADATA_EVENTS: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.METADATA_EVENTS with String = js.native
    
    @js.native
    sealed trait OBJECT_EVENTS_CREATED extends EventsPhase
    /* "N" */ val OBJECT_EVENTS_CREATED: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_CREATED with String = js.native
    
    @js.native
    sealed trait OBJECT_EVENTS_DESTROYED extends EventsPhase
    /* "D" */ val OBJECT_EVENTS_DESTROYED: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED with String = js.native
    
    @js.native
    sealed trait OBJECT_EVENTS_SNAPSHOT extends EventsPhase
    /* "O" */ val OBJECT_EVENTS_SNAPSHOT: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT with String = js.native
    
    @js.native
    sealed trait SAMPLE_EVENTS extends EventsPhase
    /* "P" */ val SAMPLE_EVENTS: typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.SAMPLE_EVENTS with String = js.native
  }
}
