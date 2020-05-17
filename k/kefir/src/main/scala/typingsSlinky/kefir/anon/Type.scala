package typingsSlinky.kefir.anon

import typingsSlinky.kefir.kefirStrings.value
import typingsSlinky.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[V]
  extends Event[V, js.Any] {
  var `type`: value = js.native
  var value: V = js.native
}

object Type {
  @scala.inline
  def apply[V](`type`: value, value: V): Type[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[V]]
  }
  @scala.inline
  implicit class TypeOps[Self[v] <: Type[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withType(value: value): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

