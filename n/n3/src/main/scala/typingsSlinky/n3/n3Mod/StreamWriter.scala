package typingsSlinky.n3.n3Mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "StreamWriter")
@js.native
class StreamWriter[Q /* <: typingsSlinky.rdfDashJs.rdfDashJsMod.BaseQuad */] () extends N3StreamWriter[Q] {
  def this(fd: js.Any) = this()
  def this(options: WriterOptions) = this()
  def this(fd: js.Any, options: WriterOptions) = this()
  /**
    * Consumes the given stream.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * Depending on the use case, subtypes of EventEmitter or Stream are used.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  /* CompleteClass */
  override def `import`(stream: Stream[Q]): EventEmitter = js.native
}

@JSImport("n3", "StreamWriter")
@js.native
object StreamWriter extends TopLevel[StreamWriterConstructor]

