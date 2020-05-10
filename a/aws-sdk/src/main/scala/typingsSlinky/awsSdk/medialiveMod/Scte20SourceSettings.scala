package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte20SourceSettings extends js.Object {
  /**
    * If upconvert, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  var Convert608To708: js.UndefOr[Scte20Convert608To708] = js.native
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[integerMin1Max4] = js.native
}

object Scte20SourceSettings {
  @scala.inline
  def apply(): Scte20SourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scte20SourceSettings]
  }
  @scala.inline
  implicit class Scte20SourceSettingsOps[Self <: Scte20SourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert608To708(value: Scte20Convert608To708): Self = {
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
  }
  
}

