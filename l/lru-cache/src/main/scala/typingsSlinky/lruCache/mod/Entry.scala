package typingsSlinky.lruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry[K, V] extends js.Object {
  var e: Double = js.native
  var k: K = js.native
  var v: V = js.native
}

object Entry {
  @scala.inline
  def apply[K, V](e: Double, k: K, v: V): Entry[K, V] = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[K, V]]
  }
  @scala.inline
  implicit class EntryOps[Self[k, v] <: Entry[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withE(value: Double): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK(value: K): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

