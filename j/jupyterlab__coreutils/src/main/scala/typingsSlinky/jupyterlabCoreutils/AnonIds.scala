package typingsSlinky.jupyterlabCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIds[V, T] extends js.Object {
  var ids: js.Array[V] = js.native
  var values: js.Array[T] = js.native
}

object AnonIds {
  @scala.inline
  def apply[V, T](ids: js.Array[V], values: js.Array[T]): AnonIds[V, T] = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIds[V, T]]
  }
  @scala.inline
  implicit class AnonIdsOps[Self[v, t] <: AnonIds[v, t], V, T] (val x: Self[V, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, T]) with Other]
    @scala.inline
    def withIds(value: js.Array[V]): Self[V, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[T]): Self[V, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

