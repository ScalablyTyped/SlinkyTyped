package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReservationsRequest extends js.Object {
  /**
    * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
    */
  var ChannelClass: js.UndefOr[string] = js.native
  /**
    * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
    */
  var Codec: js.UndefOr[string] = js.native
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MaxResults] = js.native
  /**
    * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
    */
  var MaximumBitrate: js.UndefOr[string] = js.native
  /**
    * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
    */
  var MaximumFramerate: js.UndefOr[string] = js.native
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
    */
  var Resolution: js.UndefOr[string] = js.native
  /**
    * Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[string] = js.native
  /**
    * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
    */
  var SpecialFeature: js.UndefOr[string] = js.native
  /**
    * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
    */
  var VideoQuality: js.UndefOr[string] = js.native
}

object ListReservationsRequest {
  @scala.inline
  def apply(): ListReservationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReservationsRequest]
  }
  @scala.inline
  implicit class ListReservationsRequestOps[Self <: ListReservationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelClass(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Codec")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumBitrate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumFramerate(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumFramerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumFramerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumFramerate")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialFeature(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpecialFeature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpecialFeature")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoQuality(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoQuality")(js.undefined)
        ret
    }
  }
  
}

