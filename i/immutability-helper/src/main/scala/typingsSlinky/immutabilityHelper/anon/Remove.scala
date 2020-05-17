package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.MapSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remove[K]
  extends MapSpec[K, js.Any] {
  @JSName("$remove")
  var $remove: js.Array[K] = js.native
}

object Remove {
  @scala.inline
  def apply[K]($remove: js.Array[K]): Remove[K] = {
    val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remove[K]]
  }
  @scala.inline
  implicit class RemoveOps[Self[k] <: Remove[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def with$remove(value: js.Array[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$remove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

