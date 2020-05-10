package typingsSlinky.pgCopyStreams

import typingsSlinky.node.AnonEnd
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformOptions
import typingsSlinky.pg.mod.Submittable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-copy-streams", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CopyStreamQuery ()
    extends Transform
       with Submittable {
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
  }
  
  @js.native
  class CopyToStreamQuery ()
    extends Transform
       with Submittable {
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
  }
  
  def from(txt: String): CopyStreamQuery = js.native
  def from(txt: String, options: TransformOptions): CopyStreamQuery = js.native
  def to(txt: String): CopyToStreamQuery = js.native
  def to(txt: String, options: TransformOptions): CopyToStreamQuery = js.native
}

