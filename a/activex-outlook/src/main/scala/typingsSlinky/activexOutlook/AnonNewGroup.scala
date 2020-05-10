package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewGroup extends js.Object {
  val NewGroup: OutlookBarGroup = js.native
}

object AnonNewGroup {
  @scala.inline
  def apply(NewGroup: OutlookBarGroup): AnonNewGroup = {
    val __obj = js.Dynamic.literal(NewGroup = NewGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewGroup]
  }
  @scala.inline
  implicit class AnonNewGroupOps[Self <: AnonNewGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewGroup(value: OutlookBarGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

