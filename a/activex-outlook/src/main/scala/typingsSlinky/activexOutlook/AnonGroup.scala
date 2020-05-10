package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroup extends js.Object {
  var Cancel: Boolean = js.native
  val Group: OutlookBarGroup = js.native
}

object AnonGroup {
  @scala.inline
  def apply(Cancel: Boolean, Group: OutlookBarGroup): AnonGroup = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroup]
  }
  @scala.inline
  implicit class AnonGroupOps[Self <: AnonGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: OutlookBarGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

