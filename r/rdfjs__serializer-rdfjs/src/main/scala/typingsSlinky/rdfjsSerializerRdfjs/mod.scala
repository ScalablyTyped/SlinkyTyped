package typingsSlinky.rdfjsSerializerRdfjs

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.Sink
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.rdfjsSerializerRdfjs.rdfjsSerializerRdfjsStrings.esm
import typingsSlinky.rdfjsSerializerRdfjs.rdfjsSerializerRdfjsStrings.ts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/serializer-rdfjs", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] () extends Serializer[Q] {
    def this(options: SerializerOptions) = this()
  }
  
  @js.native
  trait Serializer[Q /* <: BaseQuad */] extends Sink[Stream[Q], EventEmitter] {
    
    def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
    
    def transform(quads: js.Iterable[Q]): String = js.native
  }
  
  @js.native
  trait SerializerOptions extends StObject {
    
    var module: js.UndefOr[esm | ts | String] = js.native
  }
  object SerializerOptions {
    
    @scala.inline
    def apply(): SerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions]
    }
    
    @scala.inline
    implicit class SerializerOptionsMutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule(value: esm | ts | String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    }
  }
}
