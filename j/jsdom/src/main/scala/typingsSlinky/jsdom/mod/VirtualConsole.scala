package typingsSlinky.jsdom.mod

import typingsSlinky.jsdom.jsdomStrings.jsdomError
import typingsSlinky.jsdom.jsdomStrings.memory
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.Console_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "VirtualConsole")
@js.native
class VirtualConsole () extends EventEmitter {
  @JSName("on")
  def on_jsdomError(event: jsdomError, callback: js.Function1[/* e */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_memory(method: memory, callback: js.Any): this.type = js.native
  def sendTo(console: Console_): this.type = js.native
  def sendTo(console: Console_, options: VirtualConsoleSendToOptions): this.type = js.native
}

