package typingsSlinky.grpc.mod

import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "ClientReadableStream")
@js.native
class ClientReadableStream[ResponseType] protected ()
  extends Readable
     with Call {
  /**
    * Cancel the ongoing call. Results in the call ending with a CANCELLED status,
    * unless it has already ended with some other status.
    */
  def cancel(): Unit = js.native
  /**
    * Get the endpoint this call/stream is connected to.
    * @return The URI of the endpoint
    */
  def getPeer(): String = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}

