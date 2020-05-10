package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddedSourceSettings extends js.Object {
  /**
    * If upconvert, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  var Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.native
  /**
    * Set to "auto" to handle streams with intermittent and/or non-aligned SCTE-20 and Embedded captions.
    */
  var Scte20Detection: js.UndefOr[EmbeddedScte20Detection] = js.native
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[integerMin1Max4] = js.native
  /**
    * This field is unused and deprecated.
    */
  var Source608TrackNumber: js.UndefOr[integerMin1Max5] = js.native
}

object EmbeddedSourceSettings {
  @scala.inline
  def apply(): EmbeddedSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedSourceSettings]
  }
  @scala.inline
  implicit class EmbeddedSourceSettingsOps[Self <: EmbeddedSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert608To708(value: EmbeddedConvert608To708): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Convert608To708")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert608To708: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Convert608To708")(js.undefined)
        ret
    }
    @scala.inline
    def withScte20Detection(value: EmbeddedScte20Detection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte20Detection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScte20Detection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scte20Detection")(js.undefined)
        ret
    }
    @scala.inline
    def withSource608ChannelNumber(value: integerMin1Max4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source608ChannelNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource608ChannelNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source608ChannelNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSource608TrackNumber(value: integerMin1Max5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source608TrackNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource608TrackNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source608TrackNumber")(js.undefined)
        ret
    }
  }
  
}

