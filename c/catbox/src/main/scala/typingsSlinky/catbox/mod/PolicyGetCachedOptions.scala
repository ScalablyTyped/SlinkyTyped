package typingsSlinky.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyGetCachedOptions[T] extends js.Object {
  /** isStale - true if the item is stale. */
  var isStale: Boolean = js.native
  /** item - the cached value. */
  var item: T = js.native
  /** stored - the timestamp when the item was stored in the cache. */
  var stored: Double = js.native
  /** ttl - the cache ttl value for the record. */
  var ttl: Double = js.native
}

object PolicyGetCachedOptions {
  @scala.inline
  def apply[T](isStale: Boolean, item: T, stored: Double, ttl: Double): PolicyGetCachedOptions[T] = {
    val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGetCachedOptions[T]]
  }
  @scala.inline
  implicit class PolicyGetCachedOptionsOps[Self[t] <: PolicyGetCachedOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsStale(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStored(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

