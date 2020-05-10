package typingsSlinky.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages the user layout configuration in {@link setLiveTranscoding}. */
@js.native
trait TranscodingUser extends js.Object {
  /**
    * Transparency of the video frame.
    *
    * The value ranges between 0.0 and 1.0:
    *
    * - 0.0: Completely transparent.
    * - 1.0: (Default) Opaque.
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * Height of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 640.
    */
  var height: js.UndefOr[Double] = js.native
  /** User ID of the CDN live host. */
  var uid: js.UndefOr[Double | String] = js.native
  /**
    * Width of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 360.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The position of the upper left end of the video on the horizontal axis.
    *
    * Integer only. The value range is [0,10000], and the default value is 0.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The position of the upper left end of the video on the vertical axis.
    *
    * Integer only. The value range is [0,10000], and the default value is 0.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * Layer position of the video frame.
    *
    * Integer only. The value range is [0,100].
    *
    * From v2.3.0, Agora SDK supports setting zOrder as 0.
    *
    * - 0: (Default) Lowest.
    * - 100: Highest.
    *
    */
  var zOrder: js.UndefOr[Double] = js.native
}

object TranscodingUser {
  @scala.inline
  def apply(): TranscodingUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscodingUser]
  }
  @scala.inline
  implicit class TranscodingUserOps[Self <: TranscodingUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
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
    def withUid(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
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
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withZOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zOrder")(js.undefined)
        ret
    }
  }
  
}

