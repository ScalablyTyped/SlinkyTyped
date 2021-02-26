package typingsSlinky.rdfjsParserJsonld

import typingsSlinky.jsonld.jsonldSpecMod.Context
import typingsSlinky.jsonld.jsonldSpecMod.JsonLdObj
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Sink
import typingsSlinky.rdfJs.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/parser-jsonld", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] () extends Parser[Q] {
    def this(options: ParserOptions) = this()
  }
  
  @js.native
  trait Parser[Q /* <: BaseQuad */] extends Sink[EventEmitter, Stream[Q]] {
    
    def `import`(stream: EventEmitter, options: ParserOptions): Stream[Q] = js.native
  }
  
  @js.native
  trait ParserOptions extends StObject {
    
    var baseIRI: js.UndefOr[String] = js.native
    
    var context: js.UndefOr[Context] = js.native
    
    var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseIRI(value: String): Self = StObject.set(x, "baseIRI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseIRIUndefined: Self = StObject.set(x, "baseIRI", js.undefined)
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setContextVarargs(value: JsonLdObj*): Self = StObject.set(x, "context", js.Array(value :_*))
      
      @scala.inline
      def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    }
  }
}
