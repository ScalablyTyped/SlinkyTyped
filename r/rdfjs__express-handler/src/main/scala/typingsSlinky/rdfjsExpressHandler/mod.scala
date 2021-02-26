package typingsSlinky.rdfjsExpressHandler

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.DatasetCoreFactory
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import typingsSlinky.rdfjsExpressHandler.anon.Typeofformats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@rdfjs/express-handler", JSImport.Namespace)
  @js.native
  val ^ : RdfHandler = js.native
  
  type BaseIriFromRequest = js.Function1[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    js.Promise[String] | String
  ]
  
  @js.native
  trait RdfHandler extends StObject {
    
    def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def apply(options: RdfHandlerOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def attach(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait RdfHandlerOptions extends StObject {
    
    var baseIriFromRequest: js.UndefOr[Boolean | BaseIriFromRequest] = js.native
    
    var defaultMediaType: js.UndefOr[String] = js.native
    
    var factory: js.UndefOr[DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]]] = js.native
    
    var formats: js.UndefOr[Typeofformats] = js.native
  }
  object RdfHandlerOptions {
    
    @scala.inline
    def apply(): RdfHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RdfHandlerOptions]
    }
    
    @scala.inline
    implicit class RdfHandlerOptionsMutableBuilder[Self <: RdfHandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseIriFromRequest(value: Boolean | BaseIriFromRequest): Self = StObject.set(x, "baseIriFromRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseIriFromRequestFunction1(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Promise[String] | String): Self = StObject.set(x, "baseIriFromRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBaseIriFromRequestUndefined: Self = StObject.set(x, "baseIriFromRequest", js.undefined)
      
      @scala.inline
      def setDefaultMediaType(value: String): Self = StObject.set(x, "defaultMediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMediaTypeUndefined: Self = StObject.set(x, "defaultMediaType", js.undefined)
      
      @scala.inline
      def setFactory(value: DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      @scala.inline
      def setFormats(value: Typeofformats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    }
  }
  
  type _To = RdfHandler
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RdfHandler = ^
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      def dataset(): js.Promise[DatasetCore[Quad, Quad]] = js.native
      def dataset(parserOptions: js.Any): js.Promise[DatasetCore[Quad, Quad]] = js.native
      
      def quadStream(): Stream[Quad] = js.native
      def quadStream(parserOptions: js.Any): Stream[Quad] = js.native
    }
    
    @js.native
    trait Response extends StObject {
      
      def dataset(dataset: DatasetCore[Quad, Quad]): js.Promise[Unit] = js.native
      
      def quadStream(stream: Stream[Quad]): js.Promise[Unit] = js.native
    }
    object Response {
      
      @scala.inline
      def apply(dataset: DatasetCore[Quad, Quad] => js.Promise[Unit], quadStream: Stream[Quad] => js.Promise[Unit]): Response = {
        val __obj = js.Dynamic.literal(dataset = js.Any.fromFunction1(dataset), quadStream = js.Any.fromFunction1(quadStream))
        __obj.asInstanceOf[Response]
      }
      
      @scala.inline
      implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataset(value: DatasetCore[Quad, Quad] => js.Promise[Unit]): Self = StObject.set(x, "dataset", js.Any.fromFunction1(value))
        
        @scala.inline
        def setQuadStream(value: Stream[Quad] => js.Promise[Unit]): Self = StObject.set(x, "quadStream", js.Any.fromFunction1(value))
      }
    }
  }
}
