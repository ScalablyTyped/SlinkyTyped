package typingsSlinky.rdfjsSerializerJsonld

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.Sink
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.rdfjsSerializerJsonld.rdfjsSerializerJsonldStrings.`object`
import typingsSlinky.rdfjsSerializerJsonld.rdfjsSerializerJsonldStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/serializer-jsonld", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] () extends Serializer[Q] {
    def this(options: SerializerOptions) = this()
  }
  
  @js.native
  trait Serializer[Q /* <: BaseQuad */] extends Sink[Stream[Q], EventEmitter] {
    
    def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
  }
  
  @js.native
  trait SerializerOptions extends StObject {
    
    var encoding: js.UndefOr[string | `object`] = js.native
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
      def setEncoding(value: string | `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
