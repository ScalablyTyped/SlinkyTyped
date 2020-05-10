package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemixSettings extends js.Object {
  /**
    * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification).
    */
  var ChannelMapping: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ChannelMapping] = js.native
  /**
    * Specify the number of audio channels from your input that you want to use in your output. With remixing, you might combine or split the data in these channels, so the number of channels in your final output might be different.
    */
  var ChannelsIn: js.UndefOr[integerMin1Max64] = js.native
  /**
    * Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8... 64. (1 and even numbers to 64.)
    */
  var ChannelsOut: js.UndefOr[integerMin1Max64] = js.native
}

object RemixSettings {
  @scala.inline
  def apply(): RemixSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemixSettings]
  }
  @scala.inline
  implicit class RemixSettingsOps[Self <: RemixSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelMapping(value: ChannelMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelsIn(value: integerMin1Max64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelsIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelsIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelsIn")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelsOut(value: integerMin1Max64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelsOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelsOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelsOut")(js.undefined)
        ret
    }
  }
  
}

