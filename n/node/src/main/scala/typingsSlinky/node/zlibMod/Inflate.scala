package typingsSlinky.node.zlibMod

import typingsSlinky.node.Anon_End
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inflate
  extends Transform
     with Zlib
     with ZlibReset {
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}

@JSImport("zlib", "inflate")
@js.native
object inflate extends js.Object {
  def apply(buf: InputType, callback: CompressCallback): Unit = js.native
  def apply(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
}

