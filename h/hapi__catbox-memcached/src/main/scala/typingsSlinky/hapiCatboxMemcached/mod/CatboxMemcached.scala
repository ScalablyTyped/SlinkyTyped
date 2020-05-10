package typingsSlinky.hapiCatboxMemcached.mod

import typingsSlinky.hapiCatbox.mod.CacheKey
import typingsSlinky.hapiCatbox.mod.CachedObject
import typingsSlinky.hapiCatbox.mod.ClientApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatboxMemcached[T] extends ClientApi[T] {
  def generateKey(key: CacheKey): String = js.native
}

object CatboxMemcached {
  @scala.inline
  def apply[T](
    drop: CacheKey => js.Promise[Unit],
    generateKey: CacheKey => String,
    get: CacheKey => js.Promise[Null | CachedObject[T]],
    isReady: () => Boolean,
    set: (CacheKey, T, Double) => js.Promise[Unit],
    start: () => js.Promise[Unit],
    stop: () => Unit,
    validateSegmentName: String => Null | js.Error
  ): CatboxMemcached[T] = {
    val __obj = js.Dynamic.literal(drop = js.Any.fromFunction1(drop), generateKey = js.Any.fromFunction1(generateKey), get = js.Any.fromFunction1(get), isReady = js.Any.fromFunction0(isReady), set = js.Any.fromFunction3(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), validateSegmentName = js.Any.fromFunction1(validateSegmentName))
    __obj.asInstanceOf[CatboxMemcached[T]]
  }
  @scala.inline
  implicit class CatboxMemcachedOps[Self[t] <: CatboxMemcached[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGenerateKey(value: CacheKey => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateKey")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

