package typingsSlinky.apolloClient

import typingsSlinky.apolloCache.mod.ApolloCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCache[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape] = js.native
  def getCacheKey(obj: AnonId): js.Any = js.native
}

object AnonCache {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape], getCacheKey: AnonId => js.Any): AnonCache[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], getCacheKey = js.Any.fromFunction1(getCacheKey))
    __obj.asInstanceOf[AnonCache[TCacheShape]]
  }
  @scala.inline
  implicit class AnonCacheOps[Self[tcacheshape] <: AnonCache[tcacheshape], TCacheShape] (val x: Self[TCacheShape]) extends AnyVal {
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
    def withGetCacheKey(value: AnonId => js.Any): Self[TCacheShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCacheKey")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

