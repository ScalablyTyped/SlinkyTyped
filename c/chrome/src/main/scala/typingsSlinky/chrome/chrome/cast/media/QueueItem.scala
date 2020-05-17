package typingsSlinky.chrome.chrome.cast.media

import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueItem extends js.Object {
  var activeTrackIds: js.Array[Number] = js.native
  var autoplay: Boolean = js.native
  var customData: js.Object = js.native
  var itemId: Double = js.native
  var media: MediaInfo = js.native
  var preloadTime: Double = js.native
  var startTime: Double = js.native
}

object QueueItem {
  @scala.inline
  def apply(
    activeTrackIds: js.Array[Number],
    autoplay: Boolean,
    customData: js.Object,
    itemId: Double,
    media: MediaInfo,
    preloadTime: Double,
    startTime: Double
  ): QueueItem = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], preloadTime = preloadTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTrackIds(value: js.Array[Number]): Self = {
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
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: MediaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreloadTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

