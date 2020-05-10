package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video Settings
  */
@js.native
trait SchemaVideoSettings extends js.Object {
  /**
    * Settings for the companion creatives of video creatives served to this
    * placement.
    */
  var companionSettings: js.UndefOr[SchemaCompanionSetting] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Orientation of a video placement. If this value is set, placement will
    * return assets matching the specified orientation.
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * Settings for the skippability of video creatives served to this
    * placement. If this object is provided, the creative-level skippable
    * settings will be overridden.
    */
  var skippableSettings: js.UndefOr[SchemaSkippableSetting] = js.native
  /**
    * Settings for the transcodes of video creatives served to this placement.
    * If this object is provided, the creative-level transcode settings will be
    * overridden.
    */
  var transcodeSettings: js.UndefOr[SchemaTranscodeSetting] = js.native
}

object SchemaVideoSettings {
  @scala.inline
  def apply(): SchemaVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSettings]
  }
  @scala.inline
  implicit class SchemaVideoSettingsOps[Self <: SchemaVideoSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanionSettings(value: SchemaCompanionSetting): Self = {
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
    def withSkippableSettings(value: SchemaSkippableSetting): Self = {
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
    def withTranscodeSettings(value: SchemaTranscodeSetting): Self = {
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

