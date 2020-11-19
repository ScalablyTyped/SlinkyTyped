package typingsSlinky.history.createMemoryHistoryMod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryHistory[HistoryLocationState] extends History[HistoryLocationState] {
  
  def canGo(n: Double): Boolean = js.native
  
  var entries: js.Array[Location[HistoryLocationState]] = js.native
  
  var index: Double = js.native
}
