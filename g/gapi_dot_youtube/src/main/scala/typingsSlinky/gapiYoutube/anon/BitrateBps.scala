package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitrateBps extends js.Object {
  /**
    * The audio streams bitrate, in bits per second.
    */
  var bitrateBps: Double = js.native
  /**
    * The number of audio channels that the stream contains.
    */
  var channelCount: Double = js.native
  /**
    * The audio codec that the stream uses.
    */
  var codec: String = js.native
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
    */
  var vendor: String = js.native
}

object BitrateBps {
  @scala.inline
  def apply(bitrateBps: Double, channelCount: Double, codec: String, vendor: String): BitrateBps = {
    val __obj = js.Dynamic.literal(bitrateBps = bitrateBps.asInstanceOf[js.Any], channelCount = channelCount.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitrateBps]
  }
  @scala.inline
  implicit class BitrateBpsOps[Self <: BitrateBps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrateBps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateBps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

