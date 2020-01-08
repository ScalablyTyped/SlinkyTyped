package typingsSlinky.atRdfjsSerializerDashJsonld.atRdfjsSerializerDashJsonldMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfDashJs.rdfDashJsMod.BaseQuad
import typingsSlinky.rdfDashJs.rdfDashJsMod.Sink
import typingsSlinky.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer[Q /* <: BaseQuad */] extends Sink[Q] {
  def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
}

