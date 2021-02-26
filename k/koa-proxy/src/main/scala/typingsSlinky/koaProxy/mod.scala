package typingsSlinky.koaProxy

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koa.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-proxy", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-proxy", JSImport.Namespace)
  @js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
  
  type IndexedObject = StringDictionary[String]
  
  type MapFunction = js.Function1[/* path */ String, String]
  
  @js.native
  trait Options extends StObject {
    
    var followRedirect: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var jar: js.UndefOr[Boolean] = js.native
    
    var map: js.UndefOr[IndexedObject | MapFunction] = js.native
    
    var `match`: js.UndefOr[js.RegExp] = js.native
    
    // case-insensitive
    var overrideResponseHeaders: js.UndefOr[js.Any] = js.native
    
    var requestOptions: js.UndefOr[RequestOptionFunc | IndexedObject] = js.native
    
    var suppressRequestHeaders: js.UndefOr[js.Array[String]] = js.native
    
    // case-insensitive
    var suppressResponseHeaders: js.UndefOr[js.Array[String]] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var yieldNext: js.UndefOr[Boolean] = js.native
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
      def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setJar(value: Boolean): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
      
      @scala.inline
      def setMap(value: IndexedObject | MapFunction): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapFunction1(value: /* path */ String => String): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setOverrideResponseHeaders(value: js.Any): Self = StObject.set(x, "overrideResponseHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideResponseHeadersUndefined: Self = StObject.set(x, "overrideResponseHeaders", js.undefined)
      
      @scala.inline
      def setRequestOptions(value: RequestOptionFunc | IndexedObject): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptionsFunction2(value: (/* request */ Request, /* opts */ js.Any) => js.Any): Self = StObject.set(x, "requestOptions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      @scala.inline
      def setSuppressRequestHeaders(value: js.Array[String]): Self = StObject.set(x, "suppressRequestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressRequestHeadersUndefined: Self = StObject.set(x, "suppressRequestHeaders", js.undefined)
      
      @scala.inline
      def setSuppressRequestHeadersVarargs(value: String*): Self = StObject.set(x, "suppressRequestHeaders", js.Array(value :_*))
      
      @scala.inline
      def setSuppressResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "suppressResponseHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressResponseHeadersUndefined: Self = StObject.set(x, "suppressResponseHeaders", js.undefined)
      
      @scala.inline
      def setSuppressResponseHeadersVarargs(value: String*): Self = StObject.set(x, "suppressResponseHeaders", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setYieldNext(value: Boolean): Self = StObject.set(x, "yieldNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYieldNextUndefined: Self = StObject.set(x, "yieldNext", js.undefined)
    }
  }
  
  type RequestOptionFunc = js.Function2[/* request */ Request, /* opts */ js.Any, js.Any]
}
