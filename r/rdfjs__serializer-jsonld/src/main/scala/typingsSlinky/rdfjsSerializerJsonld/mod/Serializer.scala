package typingsSlinky.rdfjsSerializerJsonld.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.Sink
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serializer[Q /* <: BaseQuad */] extends Sink[Stream[Q], EventEmitter] {
  
  def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
}
