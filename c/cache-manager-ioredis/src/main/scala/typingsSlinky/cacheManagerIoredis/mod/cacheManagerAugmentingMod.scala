package typingsSlinky.cacheManagerIoredis.mod

import typingsSlinky.cacheManager.mod.Cache
import typingsSlinky.cacheManager.mod.CacheOptions
import typingsSlinky.cacheManager.mod.StoreConfig
import typingsSlinky.cacheManagerIoredis.mod.CacheManagerIORedis.ClusterCache
import typingsSlinky.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreClusterConfig
import typingsSlinky.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreSingleNodeConfig
import typingsSlinky.cacheManagerIoredis.mod.CacheManagerIORedis.SingleNodeCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("cache-manager", JSImport.Namespace)
@js.native
object cacheManagerAugmentingMod extends js.Object {
  def caching(IConfig: StoreConfig with CacheOptions): Cache = js.native
  def caching(IConfig: RedisStoreClusterConfig): ClusterCache = js.native
  def caching(IConfig: RedisStoreSingleNodeConfig): SingleNodeCache = js.native
}

