package typingsSlinky.apolloServerCaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyValueCacheMod {
  
  @js.native
  trait KeyValueCache[V] extends StObject {
    
    def delete(key: String): js.Promise[Boolean | Unit] = js.native
    
    def get(key: String): js.Promise[js.UndefOr[V]] = js.native
    
    def set(key: String, value: V): js.Promise[Unit] = js.native
    def set(key: String, value: V, options: KeyValueCacheSetOptions): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait KeyValueCacheSetOptions extends StObject {
    
    var ttl: js.UndefOr[Double | Null] = js.native
  }
  object KeyValueCacheSetOptions {
    
    @scala.inline
    def apply(): KeyValueCacheSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyValueCacheSetOptions]
    }
    
    @scala.inline
    implicit class KeyValueCacheSetOptionsMutableBuilder[Self <: KeyValueCacheSetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlNull: Self = StObject.set(x, "ttl", null)
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait TestableKeyValueCache[V] extends KeyValueCache[V] {
    
    var close: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
    
    var flush: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
  }
}
