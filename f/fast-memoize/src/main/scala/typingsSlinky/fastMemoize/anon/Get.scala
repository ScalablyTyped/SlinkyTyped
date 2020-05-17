package typingsSlinky.fastMemoize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get[K, V] extends js.Object {
  def get(key: K): V = js.native
  def has(key: K): Boolean = js.native
  def set(key: K, value: V): Unit = js.native
}

object Get {
  @scala.inline
  def apply[K, V](get: K => V, has: K => Boolean, set: (K, V) => Unit): Get[K, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Get[K, V]]
  }
  @scala.inline
  implicit class GetOps[Self[k, v] <: Get[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withGet(value: K => V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: K => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (K, V) => Unit): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

