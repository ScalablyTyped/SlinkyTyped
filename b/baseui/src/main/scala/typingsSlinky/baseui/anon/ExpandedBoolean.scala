package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandedBoolean extends js.Object {
  var expanded: Boolean = js.native
}

object ExpandedBoolean {
  @scala.inline
  def apply(expanded: Boolean): ExpandedBoolean = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedBoolean]
  }
  @scala.inline
  implicit class ExpandedBooleanOps[Self <: ExpandedBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

