package typingsSlinky.rdfjsSinkMap

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.Sink
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/sink-map", JSImport.Namespace)
  @js.native
  class ^[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] () extends StObject
  
  @js.native
  trait SinkMap[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends Map[String, Sink[InputStream, OutputStream]] {
    
    def `import`(mediaType: String, input: InputStream): OutputStream | Null = js.native
    def `import`(mediaType: String, input: InputStream, options: js.Any): OutputStream | Null = js.native
  }
}
