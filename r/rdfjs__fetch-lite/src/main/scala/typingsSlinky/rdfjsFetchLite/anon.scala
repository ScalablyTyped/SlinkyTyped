package typingsSlinky.rdfjsFetchLite

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.rdfjsSinkMap.mod.SinkMap
import typingsSlinky.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  /* Inlined std.Pick<{  parsers :@rdfjs/sink-map.@rdfjs/sink-map.SinkMap<node.events.EventEmitter, rdf-js.rdf-js.Stream<rdf-js.rdf-js.Quad>>,   serializers :@rdfjs/sink-map.@rdfjs/sink-map.SinkMap<rdf-js.rdf-js.Stream<rdf-js.rdf-js.Quad>, node.events.EventEmitter>}, 'parsers'> */
  @js.native
  trait PickparsersSinkMapEventEm extends StObject {
    
    var parsers: SinkMap[EventEmitter, Stream[Quad]] = js.native
  }
  object PickparsersSinkMapEventEm {
    
    @scala.inline
    def apply(parsers: SinkMap[EventEmitter, Stream[Quad]]): PickparsersSinkMapEventEm = {
      val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickparsersSinkMapEventEm]
    }
    
    @scala.inline
    implicit class PickparsersSinkMapEventEmMutableBuilder[Self <: PickparsersSinkMapEventEm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParsers(value: SinkMap[EventEmitter, Stream[Quad]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    }
  }
}
