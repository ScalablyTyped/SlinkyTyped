package typingsSlinky.gcStats.mod

import typingsSlinky.gcStats.gcStatsStrings.stats
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GCStatsEventEmitter extends EventEmitter {
  
  @JSName("addListener")
  def addListener_stats(event: stats, listener: GCStatsListener): this.type = js.native
  
  @JSName("on")
  def on_stats(event: stats, listener: GCStatsListener): this.type = js.native
  
  @JSName("once")
  def once_stats(event: stats, listener: GCStatsListener): this.type = js.native
}
