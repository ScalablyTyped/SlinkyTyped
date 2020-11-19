package typingsSlinky.hapiCatboxMemcached.mod

import typingsSlinky.hapiCatbox.mod.CacheKey
import typingsSlinky.hapiCatbox.mod.CachedObject
import typingsSlinky.hapiCatbox.mod.ClientApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class CatboxMemcachedOps[Self <: CatboxMemcached[_], T] (val x: Self with CatboxMemcached[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGenerateKey(value: CacheKey => String): Self = this.set("generateKey", js.Any.fromFunction1(value))
  }
}
