package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagSettings extends js.Object {
  var dynamicTagEnabled: js.UndefOr[Boolean] = js.native
  var imageTagEnabled: js.UndefOr[Boolean] = js.native
}

object TagSettings {
  @scala.inline
  def apply(): TagSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSettings]
  }
  @scala.inline
  implicit class TagSettingsOps[Self <: TagSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicTagEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTagEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTagEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTagEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTagEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTagEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagEnabled")(js.undefined)
        ret
    }
  }
  
}

