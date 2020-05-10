package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an audio stream.
  */
@js.native
trait SchemaVideoFileDetailsAudioStream extends js.Object {
  /**
    * The audio stream&#39;s bitrate, in bits per second.
    */
  var bitrateBps: js.UndefOr[String] = js.native
  /**
    * The number of audio channels that the stream contains.
    */
  var channelCount: js.UndefOr[Double] = js.native
  /**
    * The audio codec that the stream uses.
    */
  var codec: js.UndefOr[String] = js.native
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is
    * a four-letter vendor code.
    */
  var vendor: js.UndefOr[String] = js.native
}

object SchemaVideoFileDetailsAudioStream {
  @scala.inline
  def apply(): SchemaVideoFileDetailsAudioStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFileDetailsAudioStream]
  }
  @scala.inline
  implicit class SchemaVideoFileDetailsAudioStreamOps[Self <: SchemaVideoFileDetailsAudioStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrateBps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateBps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrateBps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateBps")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(js.undefined)
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(js.undefined)
        ret
    }
  }
  
}

