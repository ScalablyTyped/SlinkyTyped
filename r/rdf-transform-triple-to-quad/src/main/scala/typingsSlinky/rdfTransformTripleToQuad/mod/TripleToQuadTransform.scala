package typingsSlinky.rdfTransformTripleToQuad.mod

import typingsSlinky.node.AnonEnd
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripleToQuadTransform[Q /* <: BaseQuad */]
  extends Transform
     with Stream[Q] {
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
  /**
    * This method pulls a quad out of the internal buffer and returns it.
    * If there is no quad available, then it will return null.
    *
    * @return A quad from the internal buffer, or null if none is available.
    */
  /* InferMemberOverrides */
  override def read(): Q with (String | Buffer) = js.native
}

