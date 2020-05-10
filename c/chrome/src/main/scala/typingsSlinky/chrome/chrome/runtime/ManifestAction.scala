package typingsSlinky.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestAction extends js.Object {
  var default_icon: js.UndefOr[ManifestIcons] = js.native
  var default_popup: js.UndefOr[String] = js.native
  var default_title: js.UndefOr[String] = js.native
}

object ManifestAction {
  @scala.inline
  def apply(): ManifestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestAction]
  }
  @scala.inline
  implicit class ManifestActionOps[Self <: ManifestAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_icon(value: ManifestIcons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_icon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_icon")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_popup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_popup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_popup")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_title")(js.undefined)
        ret
    }
  }
  
}

