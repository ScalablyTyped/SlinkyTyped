package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsOutputSettings extends js.Object {
  /**
    * Only applicable when this output is referencing an H.265 video description.
  Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
    */
  var H265PackagingType: js.UndefOr[HlsH265PackagingType] = js.native
  /**
    * Settings regarding the underlying stream. These settings are different for audio-only outputs.
    */
  var HlsSettings: typingsSlinky.awsSdk.medialiveMod.HlsSettings = js.native
  /**
    * String concatenated to the end of the destination filename. Accepts \"Format Identifiers\":#formatIdentifierParameters.
    */
  var NameModifier: js.UndefOr[stringMin1] = js.native
  /**
    * String concatenated to end of segment filenames.
    */
  var SegmentModifier: js.UndefOr[string] = js.native
}

object HlsOutputSettings {
  @scala.inline
  def apply(HlsSettings: HlsSettings): HlsOutputSettings = {
    val __obj = js.Dynamic.literal(HlsSettings = HlsSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsOutputSettings]
  }
  @scala.inline
  implicit class HlsOutputSettingsOps[Self <: HlsOutputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHlsSettings(value: HlsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH265PackagingType(value: HlsH265PackagingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H265PackagingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH265PackagingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("H265PackagingType")(js.undefined)
        ret
    }
    @scala.inline
    def withNameModifier(value: stringMin1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameModifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentModifier(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentModifier")(js.undefined)
        ret
    }
  }
  
}

