package typingsSlinky.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelDescriptorUrl
  extends LabelDescriptorBase
     with LabelDescriptor {
  var iconClass: js.UndefOr[String] = js.native
  var iconUrl: String = js.native
}

object LabelDescriptorUrl {
  @scala.inline
  def apply(iconUrl: String, title: String): LabelDescriptorUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptorUrl]
  }
  @scala.inline
  implicit class LabelDescriptorUrlOps[Self <: LabelDescriptorUrl] (val x: Self) extends AnyVal {
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

