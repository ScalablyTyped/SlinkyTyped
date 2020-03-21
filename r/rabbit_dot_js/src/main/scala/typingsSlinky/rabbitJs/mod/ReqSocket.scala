package typingsSlinky.rabbitJs.mod

import typingsSlinky.node.AnonEnd
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "ReqSocket")
@js.native
class ReqSocket protected ()
  extends Duplex
     with Socket {
  def this(channel: String, opts: SocketOptions) = this()
  def handleReply(msg: RequestMessage): js.Any = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
}

