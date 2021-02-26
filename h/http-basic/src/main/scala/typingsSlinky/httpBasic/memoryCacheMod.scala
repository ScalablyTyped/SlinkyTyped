package typingsSlinky.httpBasic

import typingsSlinky.httpBasic.anon.PickCachedResponseheaders
import typingsSlinky.httpBasic.cachedResponseMod.CachedResponse
import typingsSlinky.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryCacheMod {
  
  @JSImport("http-basic/lib/MemoryCache", JSImport.Default)
  @js.native
  class default () extends MemoryCache
  
  @js.native
  trait MemoryCache extends StObject {
    
    val _cache: js.Any = js.native
    
    def getResponse(
      url: String,
      callback: js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]
    ): Unit = js.native
    
    def invalidateResponse(url: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
    
    def setResponse(url: String, response: CachedResponse): Unit = js.native
    
    def updateResponseHeaders(url: String, response: PickCachedResponseheaders): Unit = js.native
  }
  object MemoryCache {
    
    @scala.inline
    def apply(
      _cache: js.Any,
      getResponse: (String, js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]) => Unit,
      invalidateResponse: (String, js.Function1[/* err */ ErrnoException | Null, Unit]) => Unit,
      setResponse: (String, CachedResponse) => Unit,
      updateResponseHeaders: (String, PickCachedResponseheaders) => Unit
    ): MemoryCache = {
      val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], getResponse = js.Any.fromFunction2(getResponse), invalidateResponse = js.Any.fromFunction2(invalidateResponse), setResponse = js.Any.fromFunction2(setResponse), updateResponseHeaders = js.Any.fromFunction2(updateResponseHeaders))
      __obj.asInstanceOf[MemoryCache]
    }
    
    @scala.inline
    implicit class MemoryCacheMutableBuilder[Self <: MemoryCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetResponse(
        value: (String, js.Function2[/* err */ Null | js.Error, /* response */ Null | CachedResponse, Unit]) => Unit
      ): Self = StObject.set(x, "getResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalidateResponse(value: (String, js.Function1[/* err */ ErrnoException | Null, Unit]) => Unit): Self = StObject.set(x, "invalidateResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetResponse(value: (String, CachedResponse) => Unit): Self = StObject.set(x, "setResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateResponseHeaders(value: (String, PickCachedResponseheaders) => Unit): Self = StObject.set(x, "updateResponseHeaders", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_cache(value: js.Any): Self = StObject.set(x, "_cache", value.asInstanceOf[js.Any])
    }
  }
}
