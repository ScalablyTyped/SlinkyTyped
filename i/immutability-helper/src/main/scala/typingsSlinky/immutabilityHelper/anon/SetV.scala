package typingsSlinky.immutabilityHelper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetV[V] extends js.Object {
  @JSName("$set")
  var $set: V = js.native
}

object SetV {
  @scala.inline
  def apply[V]($set: V): SetV[V] = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetV[V]]
  }
  @scala.inline
  implicit class SetVOps[Self[v] <: SetV[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def with$set(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

