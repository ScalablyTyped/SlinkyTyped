package typingsSlinky.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverrideContext extends js.Object {
  var bindingContext: js.Any = js.native
  var parentOverrideContext: js.UndefOr[OverrideContext] = js.native
}

object OverrideContext {
  @scala.inline
  def apply(bindingContext: js.Any): OverrideContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideContext]
  }
  @scala.inline
  implicit class OverrideContextOps[Self <: OverrideContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentOverrideContext(value: OverrideContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentOverrideContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentOverrideContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentOverrideContext")(js.undefined)
        ret
    }
  }
  
}

