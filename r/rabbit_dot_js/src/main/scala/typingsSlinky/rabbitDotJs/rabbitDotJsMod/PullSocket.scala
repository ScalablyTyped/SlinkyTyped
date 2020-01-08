package typingsSlinky.rabbitDotJs.rabbitDotJsMod

import typingsSlinky.node.Anon_End
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "PullSocket")
@js.native
class PullSocket protected ()
  extends Readable
     with Socket {
  def this(channel: String, opts: SocketOptions) = this()
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

