package typingsSlinky.mem.mod

import typingsSlinky.mem.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[ArgumentsType /* <: js.Array[_] */, CacheKeyType, ReturnType] extends js.Object {
  /**
  		Use a different cache storage. You could for example use a `WeakMap` instead or [`quick-lru`](https://github.com/sindresorhus/quick-lru) for a LRU cache.
  		@default new Map()
  		*/
  val cache: js.UndefOr[CacheStorage[CacheKeyType, Data[ReturnType]]] = js.native
  /**
  		Determines the cache key for storing the result based on the function arguments. By default, if there's only one argument and it's a [primitive](https://developer.mozilla.org/en-US/docs/Glossary/Primitive), it's used directly as a key (if it's a `function`, its reference will be used as key), otherwise it's all the function arguments JSON stringified as an array.
  		You could for example change it to only cache on the first argument `x => JSON.stringify(x)`.
  		*/
  val cacheKey: js.UndefOr[js.Function1[/* arguments */ ArgumentsType, CacheKeyType]] = js.native
  /**
  		Cache rejected promises.
  		@default true
  		*/
  val cachePromiseRejection: js.UndefOr[Boolean] = js.native
  /**
  		Milliseconds until the cache expires.
  		@default Infinity
  		*/
  val maxAge: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply[ArgumentsType, CacheKeyType, ReturnType](): Options[ArgumentsType, CacheKeyType, ReturnType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ArgumentsType, CacheKeyType, ReturnType]]
  }
  @scala.inline
  implicit class OptionsOps[Self[argumentstype, cachekeytype, returntype] <: Options[argumentstype, cachekeytype, returntype], ArgumentsType, CacheKeyType, ReturnType] (val x: Self[ArgumentsType, CacheKeyType, ReturnType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ArgumentsType, CacheKeyType, ReturnType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ArgumentsType, CacheKeyType, ReturnType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ArgumentsType, CacheKeyType, ReturnType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ArgumentsType, CacheKeyType, ReturnType]) with Other]
    @scala.inline
    def withCache(value: CacheStorage[CacheKeyType, Data[ReturnType]]): Self[ArgumentsType, CacheKeyType, ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self[ArgumentsType, CacheKeyType, ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheKey(value: /* arguments */ ArgumentsType => CacheKeyType): Self[ArgumentsType, CacheKeyType, ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCacheKey: Self[ArgumentsType, CacheKeyType, ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCachePromiseRejection(value: Boolean): Self[ArgumentsType, CacheKeyType, ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePromiseRejection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachePromiseRejection: Self[ArgumentsType, CacheKeyType, ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePromiseRejection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self[ArgumentsType, CacheKeyType, ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self[ArgumentsType, CacheKeyType, ReturnType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
  }
  
}

