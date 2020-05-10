package typingsSlinky.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandedColumnHeaderProps extends js.Object {
  var anyExpand: Boolean = js.native
}

object ExpandedColumnHeaderProps {
  @scala.inline
  def apply(anyExpand: Boolean): ExpandedColumnHeaderProps = {
    val __obj = js.Dynamic.literal(anyExpand = anyExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedColumnHeaderProps]
  }
  @scala.inline
  implicit class ExpandedColumnHeaderPropsOps[Self <: ExpandedColumnHeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyExpand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

