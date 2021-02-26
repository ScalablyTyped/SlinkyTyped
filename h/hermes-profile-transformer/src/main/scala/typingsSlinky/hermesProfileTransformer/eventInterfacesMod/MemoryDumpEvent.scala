package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS
import org.scalablytyped.runtime.StObject
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
  def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal]
  }
  
  @scala.inline
  def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess]
  }
}
