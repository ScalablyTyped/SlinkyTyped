package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToGroup extends js.Object {
  var Cancel: Boolean = js.native
  val ToGroup: OutlookBarGroup = js.native
}

object ToGroup {
  @scala.inline
  def apply(Cancel: Boolean, ToGroup: OutlookBarGroup): ToGroup = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ToGroup = ToGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToGroup]
  }
  @scala.inline
  implicit class ToGroupOps[Self <: ToGroup] (val x: Self) extends AnyVal {
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
    def withToGroup(value: OutlookBarGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

