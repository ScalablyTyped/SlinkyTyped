package typingsSlinky.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadRowAttachmentIconUrlDescriptor
  extends ThreadRowAttachmentIconDescriptorBase
     with ThreadRowAttachmentIconDescriptor {
  var iconClass: js.UndefOr[String] = js.native
  var iconUrl: String = js.native
}

object ThreadRowAttachmentIconUrlDescriptor {
  @scala.inline
  def apply(iconUrl: String): ThreadRowAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowAttachmentIconUrlDescriptor]
  }
  @scala.inline
  implicit class ThreadRowAttachmentIconUrlDescriptorOps[Self <: ThreadRowAttachmentIconUrlDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
  }
  
}

