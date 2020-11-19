package typingsSlinky.n3.mod

import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.rdfJs.mod.Sink
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "StreamWriter")
@js.native
class StreamWriter[Q /* <: typingsSlinky.rdfJs.mod.BaseQuad */] ()
  extends Transform
     with Sink[Stream[Q], EventEmitter] {
  def this(fd: js.Any) = this()
  def this(options: WriterOptions) = this()
  def this(fd: js.Any, options: WriterOptions) = this()
  
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}
