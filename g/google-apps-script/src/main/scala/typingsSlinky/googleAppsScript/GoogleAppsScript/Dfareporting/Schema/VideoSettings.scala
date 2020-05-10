package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSettings extends js.Object {
  var companionSettings: js.UndefOr[CompanionSetting] = js.native
  var kind: js.UndefOr[String] = js.native
  var orientation: js.UndefOr[String] = js.native
  var skippableSettings: js.UndefOr[SkippableSetting] = js.native
  var transcodeSettings: js.UndefOr[TranscodeSetting] = js.native
}

object VideoSettings {
  @scala.inline
  def apply(): VideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSettings]
  }
  @scala.inline
  implicit class VideoSettingsOps[Self <: VideoSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanionSettings(value: CompanionSetting): Self = {
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
    def withSkippableSettings(value: SkippableSetting): Self = {
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
    def withTranscodeSettings(value: TranscodeSetting): Self = {
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

