package typingsSlinky.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttr extends js.Object {
  /**
    * Whether the remote media stream falls back to audio-only or switches back to the video:
    * - 1: the remote media stream falls back to audio-only due to unreliable network conditions.
    * - 0: the remote media stream switches back to the video stream after the network conditions improve.
    */
  var attr: Double = js.native
  /** ID of the remote user sending the stream. */
  var uid: String | Double = js.native
}

object AnonAttr {
  @scala.inline
  def apply(attr: Double, uid: String | Double): AnonAttr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttr]
  }
  @scala.inline
  implicit class AnonAttrOps[Self <: AnonAttr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

