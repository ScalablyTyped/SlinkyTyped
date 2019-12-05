package typingsSlinky.apolloDashServerDashCaching

import typingsSlinky.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching", JSImport.Namespace)
@js.native
object apolloDashServerDashCachingMod extends js.Object {
  @js.native
  class InMemoryLRUCache[V] ()
    extends typingsSlinky.apolloDashServerDashCaching.distInMemoryLRUCacheMod.InMemoryLRUCache[V] {
    def this(hasMaxSizeSizeCalculatorOnDispose: Anon_Key[V]) = this()
  }
  
  @js.native
  class PrefixingKeyValueCache[V] protected ()
    extends typingsSlinky.apolloDashServerDashCaching.distPrefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
  }
  
}

