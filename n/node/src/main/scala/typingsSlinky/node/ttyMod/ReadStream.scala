package typingsSlinky.node.ttyMod

import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.netMod.SocketConstructorOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tty", "ReadStream")
@js.native
class ReadStream protected () extends Socket {
  def this(fd: Double) = this()
  def this(fd: Double, options: SocketConstructorOpts) = this()
  
  var isRaw: Boolean = js.native
  
  var isTTY: Boolean = js.native
  
  def setRawMode(mode: Boolean): this.type = js.native
}
