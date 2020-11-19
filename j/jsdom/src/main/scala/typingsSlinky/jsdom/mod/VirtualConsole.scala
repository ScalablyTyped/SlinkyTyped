package typingsSlinky.jsdom.mod

import org.scalajs.dom.raw.Console
import typingsSlinky.jsdom.jsdomStrings.jsdomError
import typingsSlinky.jsdom.jsdomStrings.memory
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsdom", "VirtualConsole")
@js.native
class VirtualConsole () extends EventEmitter {
  
  @JSName("on")
  def on_jsdomError(event: jsdomError, callback: js.Function1[/* e */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_memory(method: memory, callback: js.Any): this.type = js.native
  
  def sendTo(console: Console): this.type = js.native
  def sendTo(console: Console, options: VirtualConsoleSendToOptions): this.type = js.native
}
