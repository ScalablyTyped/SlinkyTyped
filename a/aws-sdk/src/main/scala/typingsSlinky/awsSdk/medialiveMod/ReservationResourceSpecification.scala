package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationResourceSpecification extends js.Object {
  /**
    * Channel class, e.g. 'STANDARD'
    */
  var ChannelClass: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.ChannelClass] = js.native
  /**
    * Codec, e.g. 'AVC'
    */
  var Codec: js.UndefOr[ReservationCodec] = js.native
  /**
    * Maximum bitrate, e.g. 'MAX_20_MBPS'
    */
  var MaximumBitrate: js.UndefOr[ReservationMaximumBitrate] = js.native
  /**
    * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
    */
  var MaximumFramerate: js.UndefOr[ReservationMaximumFramerate] = js.native
  /**
    * Resolution, e.g. 'HD'
    */
  var Resolution: js.UndefOr[ReservationResolution] = js.native
  /**
    * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[ReservationResourceType] = js.native
  /**
    * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
    */
  var SpecialFeature: js.UndefOr[ReservationSpecialFeature] = js.native
  /**
    * Video quality, e.g. 'STANDARD' (Outputs only)
    */
  var VideoQuality: js.UndefOr[ReservationVideoQuality] = js.native
}

object ReservationResourceSpecification {
  @scala.inline
  def apply(): ReservationResourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationResourceSpecification]
  }
  @scala.inline
  implicit class ReservationResourceSpecificationOps[Self <: ReservationResourceSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelClass(value: ChannelClass): Self = {
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
    def withCodec(value: ReservationCodec): Self = {
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
    def withMaximumBitrate(value: ReservationMaximumBitrate): Self = {
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
    def withMaximumFramerate(value: ReservationMaximumFramerate): Self = {
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
    def withResolution(value: ReservationResolution): Self = {
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
    def withResourceType(value: ReservationResourceType): Self = {
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
    def withSpecialFeature(value: ReservationSpecialFeature): Self = {
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
    def withVideoQuality(value: ReservationVideoQuality): Self = {
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

