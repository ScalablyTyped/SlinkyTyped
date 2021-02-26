package typingsSlinky.expressUnless

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressUnless.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-unless", JSImport.Namespace)
  @js.native
  def apply(): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-unless", JSImport.Namespace)
  @js.native
  def apply(options: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Boolean]): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-unless", JSImport.Namespace)
  @js.native
  def apply(options: Options): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var custom: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Boolean]] = js.native
    
    var ext: js.UndefOr[String | js.Array[String]] = js.native
    
    var method: js.UndefOr[String | js.Array[String]] = js.native
    
    var path: js.UndefOr[pathFilter | js.Array[pathFilter]] = js.native
    
    var useOriginalUrl: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Boolean): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setExt(value: String | js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String | js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: pathFilter | js.Array[pathFilter]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathRegExp(value: js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: pathFilter*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setUseOriginalUrl(value: Boolean): Self = StObject.set(x, "useOriginalUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseOriginalUrlUndefined: Self = StObject.set(x, "useOriginalUrl", js.undefined)
    }
  }
  
  @js.native
  trait RequestHandler
    extends typingsSlinky.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
    
    var unless: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof unless */ js.Any
      ] = js.native
  }
  
  type pathFilter = String | js.RegExp | Method
}
