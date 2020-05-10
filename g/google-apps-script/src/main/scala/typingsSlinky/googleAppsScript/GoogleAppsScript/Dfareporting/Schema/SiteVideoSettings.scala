package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteVideoSettings extends js.Object {
  var companionSettings: js.UndefOr[SiteCompanionSetting] = js.native
  var kind: js.UndefOr[String] = js.native
  var orientation: js.UndefOr[String] = js.native
  var skippableSettings: js.UndefOr[SiteSkippableSetting] = js.native
  var transcodeSettings: js.UndefOr[SiteTranscodeSetting] = js.native
}

object SiteVideoSettings {
  @scala.inline
  def apply(): SiteVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteVideoSettings]
  }
  @scala.inline
  implicit class SiteVideoSettingsOps[Self <: SiteVideoSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanionSettings(value: SiteCompanionSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionSettings")(js.undefined)
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
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippableSettings(value: SiteSkippableSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippableSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippableSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippableSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscodeSettings(value: SiteTranscodeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscodeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcodeSettings")(js.undefined)
        ret
    }
  }
  
}

