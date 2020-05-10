package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video Settings
  */
@js.native
trait SchemaSiteVideoSettings extends js.Object {
  /**
    * Settings for the companion creatives of video creatives served to this
    * site.
    */
  var companionSettings: js.UndefOr[SchemaSiteCompanionSetting] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteVideoSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Orientation of a site template used for video. This will act as default
    * for new placements created under this site.
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * Settings for the skippability of video creatives served to this site.
    * This will act as default for new placements created under this site.
    */
  var skippableSettings: js.UndefOr[SchemaSiteSkippableSetting] = js.native
  /**
    * Settings for the transcodes of video creatives served to this site. This
    * will act as default for new placements created under this site.
    */
  var transcodeSettings: js.UndefOr[SchemaSiteTranscodeSetting] = js.native
}

object SchemaSiteVideoSettings {
  @scala.inline
  def apply(): SchemaSiteVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVideoSettings]
  }
  @scala.inline
  implicit class SchemaSiteVideoSettingsOps[Self <: SchemaSiteVideoSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanionSettings(value: SchemaSiteCompanionSetting): Self = {
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
    def withSkippableSettings(value: SchemaSiteSkippableSetting): Self = {
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
    def withTranscodeSettings(value: SchemaSiteTranscodeSetting): Self = {
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

