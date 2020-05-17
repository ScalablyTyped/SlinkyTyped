package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.MapSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Add[K, V] extends MapSpec[K, V] {
  @JSName("$add")
  var $add: js.Array[js.Tuple2[K, V]] = js.native
}

object Add {
  @scala.inline
  def apply[K, V]($add: js.Array[js.Tuple2[K, V]]): Add[K, V] = {
    val __obj = js.Dynamic.literal($add = $add.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add[K, V]]
  }
  @scala.inline
  implicit class AddOps[Self[k, v] <: Add[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def with$add(value: js.Array[js.Tuple2[K, V]]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$add")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

