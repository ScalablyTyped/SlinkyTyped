package typingsSlinky.rdfTransformTripleToQuad

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.rdfJs.mod.BaseQuad
import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-transform-triple-to-quad", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] () extends TripleToQuadTransform[Q] {
    def this(graph: QuadGraph) = this()
    def this(graph: js.UndefOr[QuadGraph], options: TripleToQuadTransformOptions) = this()
  }
  
  @js.native
  trait TripleToQuadTransform[Q /* <: BaseQuad */]
    extends Transform
       with Stream[Q] {
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    /**
      * This method pulls a quad out of the internal buffer and returns it.
      * If there is no quad available, then it will return null.
      *
      * @return A quad from the internal buffer, or null if none is available.
      */
    /* InferMemberOverrides */
    override def read(): (Q | Null) with (String | Buffer) = js.native
  }
  
  @js.native
  trait TripleToQuadTransformOptions extends StObject {
    
    var factory: DataFactory[Quad, Quad] = js.native
  }
  object TripleToQuadTransformOptions {
    
    @scala.inline
    def apply(factory: DataFactory[Quad, Quad]): TripleToQuadTransformOptions = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TripleToQuadTransformOptions]
    }
    
    @scala.inline
    implicit class TripleToQuadTransformOptionsMutableBuilder[Self <: TripleToQuadTransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    }
  }
}
