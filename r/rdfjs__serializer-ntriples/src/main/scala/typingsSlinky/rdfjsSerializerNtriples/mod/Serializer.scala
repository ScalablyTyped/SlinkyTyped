package typingsSlinky.rdfjsSerializerNtriples.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.Sink
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serializer[Q /* <: BaseQuad */] extends Sink[Stream[Q], EventEmitter]
object Serializer {
  
  @scala.inline
  def apply[Q /* <: BaseQuad */](`import`: Stream[Q] => EventEmitter): Serializer[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[Serializer[Q]]
  }
}
