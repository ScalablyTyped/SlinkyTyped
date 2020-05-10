package typingsSlinky.inboxsdk.mod.Conversations

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentPanelDescriptor extends js.Object {
  var appIconUrl: js.UndefOr[String] = js.native
  var appName: js.UndefOr[String] = js.native
  var el: HTMLElement = js.native
  var hideTitleBar: js.UndefOr[Boolean] = js.native
  var iconUrl: String = js.native
  var id: js.UndefOr[String] = js.native
  var orderHint: js.UndefOr[Double] = js.native
  var title: String = js.native
}

object ContentPanelDescriptor {
  @scala.inline
  def apply(el: HTMLElement, iconUrl: String, title: String): ContentPanelDescriptor = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPanelDescriptor]
  }
  @scala.inline
  implicit class ContentPanelDescriptorOps[Self <: ContentPanelDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTitleBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTitleBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTitleBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTitleBar")(js.undefined)
        ret
    }
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
    def withOrderHint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(js.undefined)
        ret
    }
  }
  
}

