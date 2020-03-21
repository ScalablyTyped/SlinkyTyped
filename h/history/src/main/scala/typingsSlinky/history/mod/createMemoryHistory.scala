package typingsSlinky.history.mod

import typingsSlinky.history.createMemoryHistoryMod.MemoryHistory
import typingsSlinky.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history", "createMemoryHistory")
@js.native
object createMemoryHistory extends js.Object {
  def apply[S](): MemoryHistory[S] = js.native
  def apply[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
}

