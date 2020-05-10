package typingsSlinky.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachedObject[T] extends js.Object {
  /** item - the value stored in the cache using set(). */
  var item: T = js.native
  /** stored - the timestamp when the item was stored in the cache (in milliseconds). */
  var stored: Double = js.native
  /** ttl - the remaining time-to-live (not the original value used when storing the object). */
  var ttl: Double = js.native
}

object CachedObject {
  @scala.inline
  def apply[T](item: T, stored: Double, ttl: Double): CachedObject[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedObject[T]]
  }
  @scala.inline
  implicit class CachedObjectOps[Self[t] <: CachedObject[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
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

