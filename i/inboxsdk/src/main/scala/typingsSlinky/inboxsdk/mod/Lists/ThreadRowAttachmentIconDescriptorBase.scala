package typingsSlinky.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadRowAttachmentIconDescriptorBase extends js.Object {
  var tooltip: js.UndefOr[String] = js.native
}

object ThreadRowAttachmentIconDescriptorBase {
  @scala.inline
  def apply(): ThreadRowAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptorBase]
  }
  @scala.inline
  implicit class ThreadRowAttachmentIconDescriptorBaseOps[Self <: ThreadRowAttachmentIconDescriptorBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

