package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditTracksInfoRequest extends js.Object {
  var activeTrackIds: js.Array[Double] = js.native
  var textTrackStyle: TextTrackStyle = js.native
}

object EditTracksInfoRequest {
  @scala.inline
  def apply(activeTrackIds: js.Array[Double], textTrackStyle: TextTrackStyle): EditTracksInfoRequest = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], textTrackStyle = textTrackStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditTracksInfoRequest]
  }
  @scala.inline
  implicit class EditTracksInfoRequestOps[Self <: EditTracksInfoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTrackIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTrackIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextTrackStyle(value: TextTrackStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTrackStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

