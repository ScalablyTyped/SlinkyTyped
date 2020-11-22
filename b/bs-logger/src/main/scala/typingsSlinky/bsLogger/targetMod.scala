package typingsSlinky.bsLogger

import typingsSlinky.bsLogger.messageMod.LogMessage
import typingsSlinky.bsLogger.messageMod.LogMessageFormatter
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bs-logger/dist/logger/target", JSImport.Namespace)
@js.native
object targetMod extends js.Object {
  
  val DEFAULT_LOG_TARGET: String = js.native
  
  def parseLogTargets(): js.Array[LogTarget] = js.native
  def parseLogTargets(targetString: String): js.Array[LogTarget] = js.native
  
  @js.native
  trait LogTarget extends js.Object {
    
    def format(msg: LogMessage): String = js.native
    @JSName("format")
    var format_Original: LogMessageFormatter = js.native
    
    var minLevel: Double = js.native
    
    var stream: Writable = js.native
  }
}
