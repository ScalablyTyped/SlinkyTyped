package typingsSlinky.atRdfjsSerializerDashJsonldDashExt.atRdfjsSerializerDashJsonldDashExtMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfDashJs.rdfDashJsMod.BaseQuad
import typingsSlinky.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/serializer-jsonld-ext", JSImport.Namespace)
@js.native
class ^[Q /* <: BaseQuad */] () extends Serializer[Q] {
  def this(options: SerializerOptions) = this()
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

