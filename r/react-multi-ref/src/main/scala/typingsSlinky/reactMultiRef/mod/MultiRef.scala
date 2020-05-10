package typingsSlinky.reactMultiRef.mod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiRef[K, V] extends js.Object {
  val map: Map[K, V] = js.native
  def ref(key: K): js.Function1[/* value */ V | Null, _] = js.native
}

object MultiRef {
  @scala.inline
  def apply[K, V](map: Map[K, V], ref: K => js.Function1[/* value */ V | Null, _]): MultiRef[K, V] = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[MultiRef[K, V]]
  }
  @scala.inline
  implicit class MultiRefOps[Self[k, v] <: MultiRef[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withMap(value: Map[K, V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: K => js.Function1[/* value */ V | Null, _]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

