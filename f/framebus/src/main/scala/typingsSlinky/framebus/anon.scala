package typingsSlinky.framebus

import typingsSlinky.framebus.typesMod.FramebusOnHandler
import typingsSlinky.framebus.typesMod.FramebusReplyHandler
import typingsSlinky.framebus.typesMod.global.Window
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Emit extends js.Object {
    
    def emit(event: String): Boolean = js.native
    def emit(event: String, data: js.UndefOr[scala.Nothing], reply: FramebusReplyHandler): Boolean = js.native
    def emit(event: String, data: FramebusReplyHandler): Boolean = js.native
    def emit(event: String, data: FramebusReplyHandler, reply: FramebusReplyHandler): Boolean = js.native
    def emit(event: String, data: Record[String, _]): Boolean = js.native
    def emit(event: String, data: Record[String, _], reply: FramebusReplyHandler): Boolean = js.native
    
    def include(childWindow: Window): Boolean = js.native
    
    def off(event: String, fn: FramebusOnHandler): Boolean = js.native
    
    def on(event: String, fn: FramebusOnHandler): Boolean = js.native
    
    var origin: String = js.native
    
    def target(): js.Any = js.native
    def target(origin: String): js.Any = js.native
  }
}
