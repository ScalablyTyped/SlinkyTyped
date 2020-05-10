package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteCompanionSetting extends js.Object {
  var companionsDisabled: js.UndefOr[Boolean] = js.native
  var enabledSizes: js.UndefOr[js.Array[Size]] = js.native
  var imageOnly: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
}

object SiteCompanionSetting {
  @scala.inline
  def apply(): SiteCompanionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteCompanionSetting]
  }
  @scala.inline
  implicit class SiteCompanionSettingOps[Self <: SiteCompanionSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanionsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanionsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledSizes(value: js.Array[Size]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withImageOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

