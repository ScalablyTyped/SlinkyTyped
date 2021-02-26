package typingsSlinky.apolloServerCaching

import typingsSlinky.apolloServerCaching.anon.MaxSize
import typingsSlinky.apolloServerCaching.anon.Ttl
import typingsSlinky.apolloServerCaching.keyValueCacheMod.TestableKeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inMemoryLRUCacheMod {
  
  @JSImport("apollo-server-caching/dist/InMemoryLRUCache", "InMemoryLRUCache")
  @js.native
  class InMemoryLRUCache[V] () extends TestableKeyValueCache[V] {
    def this(hasMaxSizeSizeCalculatorOnDispose: MaxSize[V]) = this()
    
    @JSName("flush")
    def flush_MInMemoryLRUCache(): js.Promise[Unit] = js.native
    
    def getTotalSize(): js.Promise[Double] = js.native
    
    def set(key: String, value: V, options: Ttl): js.Promise[Unit] = js.native
    
    var store: js.Any = js.native
  }
}
