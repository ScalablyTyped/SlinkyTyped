package typingsSlinky.rabbitJs.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rabbit.js", "TaskSocket")
@js.native
class TaskSocket protected ()
  extends Writable
     with Socket {
  def this(channel: String, opts: SocketOptions) = this()
  
  def post(task: String, chunk: String): js.Any = js.native
  def post(task: String, chunk: String, encoding: String): js.Any = js.native
  def post(task: String, chunk: Buffer): js.Any = js.native
  def post(task: String, chunk: Buffer, encoding: String): js.Any = js.native
}
