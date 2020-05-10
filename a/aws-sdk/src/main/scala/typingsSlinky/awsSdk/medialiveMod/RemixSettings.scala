package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemixSettings extends js.Object {
  /**
    * Mapping of input channels to output channels, with appropriate gain adjustments.
    */
  var ChannelMappings: listOfAudioChannelMapping = js.native
  /**
    * Number of input channels to be used.
    */
  var ChannelsIn: js.UndefOr[integerMin1Max16] = js.native
  /**
    * Number of output channels to be produced.
  Valid values: 1, 2, 4, 6, 8
    */
  var ChannelsOut: js.UndefOr[integerMin1Max8] = js.native
}

object RemixSettings {
  @scala.inline
  def apply(ChannelMappings: listOfAudioChannelMapping): RemixSettings = {
    val __obj = js.Dynamic.literal(ChannelMappings = ChannelMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemixSettings]
  }
  @scala.inline
  implicit class RemixSettingsOps[Self <: RemixSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelMappings(value: listOfAudioChannelMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelsIn(value: integerMin1Max16): Self = {
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
    def withChannelsOut(value: integerMin1Max8): Self = {
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

