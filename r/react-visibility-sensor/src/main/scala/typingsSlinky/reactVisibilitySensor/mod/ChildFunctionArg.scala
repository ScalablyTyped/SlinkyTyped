package typingsSlinky.reactVisibilitySensor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildFunctionArg extends js.Object {
  var isVisible: Boolean | Null = js.native
  var visibilityRect: Shape = js.native
}

object ChildFunctionArg {
  @scala.inline
  def apply(visibilityRect: Shape): ChildFunctionArg = {
    val __obj = js.Dynamic.literal(visibilityRect = visibilityRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildFunctionArg]
  }
  @scala.inline
  implicit class ChildFunctionArgOps[Self <: ChildFunctionArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisibilityRect(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisibleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(null)
        ret
    }
  }
  
}

