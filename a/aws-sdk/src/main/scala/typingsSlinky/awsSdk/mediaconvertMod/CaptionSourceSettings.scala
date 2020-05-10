package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSourceSettings extends js.Object {
  /**
    * Settings for ancillary captions source.
    */
  var AncillarySourceSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.AncillarySourceSettings] = js.native
  /**
    * DVB Sub Source Settings
    */
  var DvbSubSourceSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DvbSubSourceSettings] = js.native
  /**
    * Settings for embedded captions Source
    */
  var EmbeddedSourceSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.EmbeddedSourceSettings] = js.native
  /**
    * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an xml file, specify the URI of the input caption source file. If your caption source is IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  var FileSourceSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.FileSourceSettings] = js.native
  /**
    * Use Source (SourceType) to identify the format of your input captions.  The service cannot auto-detect caption format.
    */
  var SourceType: js.UndefOr[CaptionSourceType] = js.native
  /**
    * Settings specific to Teletext caption sources, including Page number.
    */
  var TeletextSourceSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.TeletextSourceSettings] = js.native
  /**
    * Settings specific to caption sources that are specified by track number. Currently, this is only IMSC captions in an IMF package. If your caption source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead of TrackSourceSettings.
    */
  var TrackSourceSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.TrackSourceSettings] = js.native
}

object CaptionSourceSettings {
  @scala.inline
  def apply(): CaptionSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSourceSettings]
  }
  @scala.inline
  implicit class CaptionSourceSettingsOps[Self <: CaptionSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAncillarySourceSettings(value: AncillarySourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AncillarySourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAncillarySourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AncillarySourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDvbSubSourceSettings(value: DvbSubSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSubSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDvbSubSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DvbSubSourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddedSourceSettings(value: EmbeddedSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmbeddedSourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSourceSettings(value: FileSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: CaptionSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withTeletextSourceSettings(value: TeletextSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeletextSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TeletextSourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackSourceSettings(value: TrackSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackSourceSettings")(js.undefined)
        ret
    }
  }
  
}

