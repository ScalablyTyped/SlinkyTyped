package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupWidth extends js.Object {
  var groupWidth: js.Any = js.native
}

object GroupWidth {
  @scala.inline
  def apply(groupWidth: js.Any): GroupWidth = {
    val __obj = js.Dynamic.literal(groupWidth = groupWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupWidth]
  }
  @scala.inline
  implicit class GroupWidthOps[Self <: GroupWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

