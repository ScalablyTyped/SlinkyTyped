package typingsSlinky.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("perf_hooks", "monitorEventLoopDelay")
@js.native
object monitorEventLoopDelay extends js.Object {
  
  def apply(): EventLoopDelayMonitor = js.native
  def apply(options: EventLoopMonitorOptions): EventLoopDelayMonitor = js.native
}
