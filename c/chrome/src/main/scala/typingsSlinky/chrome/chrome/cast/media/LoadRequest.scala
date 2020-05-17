package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadRequest extends js.Object {
  var activeTrackIds: js.Array[Double] = js.native
  var autoplay: Boolean = js.native
  var currentTime: Double = js.native
  var customData: js.Object = js.native
  var media: MediaInfo = js.native
}

object LoadRequest {
  @scala.inline
  def apply(
    activeTrackIds: js.Array[Double],
    autoplay: Boolean,
    currentTime: Double,
    customData: js.Object,
    media: MediaInfo
  ): LoadRequest = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadRequest]
  }
  @scala.inline
  implicit class LoadRequestOps[Self <: LoadRequest] (val x: Self) extends AnyVal {
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
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: MediaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

