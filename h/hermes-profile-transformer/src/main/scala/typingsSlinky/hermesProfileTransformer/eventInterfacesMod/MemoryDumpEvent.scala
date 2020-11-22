package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess
*/
trait MemoryDumpEvent extends Event
object MemoryDumpEvent {
  
  @scala.inline
  def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): MemoryDumpEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryDumpEvent]
  }
  
  @scala.inline
  def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): MemoryDumpEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryDumpEvent]
  }
}
