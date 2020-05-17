package typingsSlinky.apolloClient.anon

import typingsSlinky.apolloCache.mod.ApolloCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape] = js.native
  def getCacheKey(obj: Id): js.Any = js.native
}

object Cache {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape], getCacheKey: Id => js.Any): Cache[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], getCacheKey = js.Any.fromFunction1(getCacheKey))
    __obj.asInstanceOf[Cache[TCacheShape]]
  }
  @scala.inline
  implicit class CacheOps[Self[tcacheshape] <: Cache[tcacheshape], TCacheShape] (val x: Self[TCacheShape]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TCacheShape] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TCacheShape]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TCacheShape] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TCacheShape] with Other]
    @scala.inline
    def withCache(value: ApolloCache[TCacheShape]): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCacheKey(value: Id => js.Any): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCacheKey")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

