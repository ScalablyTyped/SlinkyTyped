package typingsSlinky.apolloServerCaching

import typingsSlinky.apolloServerCaching.anon.MaxSize
import typingsSlinky.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class InMemoryLRUCache[V] ()
    extends typingsSlinky.apolloServerCaching.inMemoryLRUCacheMod.InMemoryLRUCache[V] {
    def this(hasMaxSizeSizeCalculatorOnDispose: MaxSize[V]) = this()
  }
  
  @js.native
  class PrefixingKeyValueCache[V] protected ()
    extends typingsSlinky.apolloServerCaching.prefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
  }
  
}

