package typingsSlinky.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceObserverEntryList extends js.Object {
  
  /**
    * @return a list of PerformanceEntry objects in chronological order with respect to performanceEntry.startTime.
    */
  def getEntries(): js.Array[PerformanceEntry] = js.native
  
  /**
    * @return a list of PerformanceEntry objects in chronological order with respect to performanceEntry.startTime
    * whose performanceEntry.name is equal to name, and optionally, whose performanceEntry.entryType is equal to type.
    */
  def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
  def getEntriesByName(name: String, `type`: EntryType): js.Array[PerformanceEntry] = js.native
  
  /**
    * @return Returns a list of PerformanceEntry objects in chronological order with respect to performanceEntry.startTime
    * whose performanceEntry.entryType is equal to type.
    */
  def getEntriesByType(`type`: EntryType): js.Array[PerformanceEntry] = js.native
}
