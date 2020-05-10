package typingsSlinky.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasCacheKey extends js.Object {
  /**
    * An object for manipulating this requests cache key. Only present during `onClientRequest()`.
    */
  val cacheKey: CacheKey = js.native
}

object HasCacheKey {
  @scala.inline
  def apply(cacheKey: CacheKey): HasCacheKey = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasCacheKey]
  }
  @scala.inline
  implicit class HasCacheKeyOps[Self <: HasCacheKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheKey(value: CacheKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

