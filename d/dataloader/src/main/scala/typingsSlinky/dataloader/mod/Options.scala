package typingsSlinky.dataloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[K, V] extends js.Object {
  /**
    * Default `true`. Set to `false` to disable batching,
    * instead immediately invoking `batchLoadFn` with a
    * single load key.
    */
  var batch: js.UndefOr[Boolean] = js.native
  /**
    * Default `true`. Set to `false` to disable memoization caching,
    * instead creating a new Promise and new key in the `batchLoadFn` for every
    * load of the same key.
    */
  var cache: js.UndefOr[Boolean] = js.native
  /**
    * A function to produce a cache key for a given load key.
    * Defaults to `key => key`. Useful to provide when JavaScript
    * objects are keys and two similarly shaped objects should
    * be considered equivalent.
    */
  var cacheKeyFn: js.UndefOr[js.Function1[/* key */ js.Any, _]] = js.native
  /**
    * An instance of Map (or an object with a similar API) to
    * be used as the underlying cache for this loader.
    * Default `new Map()`.
    */
  var cacheMap: js.UndefOr[CacheMap[K, js.Promise[V]]] = js.native
  /**
    * Default `Infinity`. Limits the number of items that get
    * passed in to the `batchLoadFn`.
    */
  var maxBatchSize: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply[K, V](): Options[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[K, V]]
  }
  @scala.inline
  implicit class OptionsOps[Self[k, v] <: Options[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withBatch(value: Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheKeyFn(value: /* key */ js.Any => _): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKeyFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCacheKeyFn: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKeyFn")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheMap(value: CacheMap[K, js.Promise[V]]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheMap: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMap")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBatchSize(value: Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBatchSize: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchSize")(js.undefined)
        ret
    }
  }
  
}

