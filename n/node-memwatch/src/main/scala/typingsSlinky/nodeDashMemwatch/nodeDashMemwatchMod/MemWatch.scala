package typingsSlinky.nodeDashMemwatch.nodeDashMemwatchMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.nodeDashMemwatch.nodeDashMemwatchStrings.leak
import typingsSlinky.nodeDashMemwatch.nodeDashMemwatchStrings.stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemWatch extends EventEmitter {
  var HeapDiff: Instantiable0[typingsSlinky.nodeDashMemwatch.nodeDashMemwatchMod.HeapDiff] = js.native
  /**
    * Force V8 to do a full GC and heap compaction.
    *
    * It's intended to be used for debugging. Calling it in production is highly discouraged.
    */
  def gc(): Unit = js.native
  @JSName("on")
  def on_leak(eventName: leak, callback: js.Function1[/* event */ LeakInformation, Unit]): this.type = js.native
  @JSName("on")
  def on_stats(eventName: stats, callback: js.Function1[/* event */ StatsInformation, Unit]): this.type = js.native
}

