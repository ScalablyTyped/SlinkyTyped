package typingsSlinky.rabbitJs.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rabbit.js", "PubSocket")
@js.native
class PubSocket protected ()
  extends Writable
     with Socket {
  def this(channel: String, opts: SocketOptions) = this()
  
  def publish(topic: String, chunk: String): js.Any = js.native
  def publish(topic: String, chunk: String, encoding: String): js.Any = js.native
  def publish(topic: String, chunk: Buffer): js.Any = js.native
  def publish(topic: String, chunk: Buffer, encoding: String): js.Any = js.native
}
