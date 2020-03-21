package typingsSlinky.rdfTransformTripleToQuad.mod

import typingsSlinky.node.AnonEnd
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-transform-triple-to-quad", JSImport.Namespace)
@js.native
class ^[Q /* <: BaseQuad */] ()
  extends Transform
     with Stream[Q] {
  def this(graph: QuadGraph) = this()
  def this(graph: QuadGraph, options: TripleToQuadTransformOptions) = this()
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

