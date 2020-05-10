package typingsSlinky.agGrid.floatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseFloatingFilterChange[M] extends FloatingFilterChange {
  @JSName("apply")
  var apply: Boolean = js.native
  var model: M = js.native
}

object BaseFloatingFilterChange {
  @scala.inline
  def apply[M](apply: Boolean, model: M): BaseFloatingFilterChange[M] = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFloatingFilterChange[M]]
  }
  @scala.inline
  implicit class BaseFloatingFilterChangeOps[Self[m] <: BaseFloatingFilterChange[m], M] (val x: Self[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[M] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[M] with Other]
    @scala.inline
    def withApply(value: Boolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: M): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

