package typingsSlinky.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityArgs extends js.Object {
  var id: js.UndefOr[String] = js.native
  var parentSpan: js.UndefOr[js.Object] = js.native
}

object ActivityArgs {
  @scala.inline
  def apply(): ActivityArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityArgs]
  }
  @scala.inline
  implicit class ActivityArgsOps[Self <: ActivityArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withParentSpan(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSpan")(js.undefined)
        ret
    }
  }
  
}

