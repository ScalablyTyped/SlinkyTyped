package typingsSlinky.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  def delete(key: K): Boolean = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): Boolean = js.native
  def set(key: K, value: V): WeakMap[K, V] = js.native
}

object WeakMap {
  @scala.inline
  def apply[K, V](delete: K => Boolean, get: K => js.UndefOr[V], has: K => Boolean, set: (K, V) => WeakMap[K, V]): WeakMap[K, V] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[WeakMap[K, V]]
  }
  @scala.inline
  implicit class WeakMapOps[Self[k, v] <: WeakMap[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withDelete(value: K => Boolean): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: K => js.UndefOr[V]): Self[K, V] = {
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
    def withSet(value: (K, V) => WeakMap[K, V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

