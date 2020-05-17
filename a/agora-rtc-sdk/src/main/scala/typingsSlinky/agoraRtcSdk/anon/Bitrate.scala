package typingsSlinky.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bitrate extends js.Object {
  /** Bitrate of the low-video stream frame in Kbps. A positive integer, and the value range is [1,10000000]. */
  var bitrate: js.UndefOr[Double] = js.native
  /** Frame rate of the low-video stream frame in fps. A positive integer, and the value range is [1,10000]. */
  var framerate: js.UndefOr[Double] = js.native
  /**
    * Height of the low-video stream frame. A positive integer, and the value range is [1,10000].
    *
    * The width and height parameters are bound together, and take effect only when both are set. Otherwise, the SDK assigns default values.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Width of the low-video stream frame. A positive integer, and the value range is [1,10000].
    *
    * The width and height parameters are bound together, and take effect only when both are set.Otherwise, the SDK assigns default values.
    */
  var width: js.UndefOr[Double] = js.native
}

object Bitrate {
  @scala.inline
  def apply(): Bitrate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bitrate]
  }
  @scala.inline
  implicit class BitrateOps[Self <: Bitrate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withFramerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framerate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

