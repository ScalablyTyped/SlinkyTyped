package typingsSlinky.rdfjsParserJsonld.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.Sink
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser[Q /* <: BaseQuad */] extends Sink[EventEmitter, Stream[Q]] {
  
  def `import`(stream: EventEmitter, options: ParserOptions): Stream[Q] = js.native
}
