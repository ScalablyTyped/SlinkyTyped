package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueLoadRequest extends js.Object {
  var customData: js.Object = js.native
  var items: js.Array[QueueItem] = js.native
  var repeatMode: RepeatMode = js.native
  var startIndex: Double = js.native
}

object QueueLoadRequest {
  @scala.inline
  def apply(customData: js.Object, items: js.Array[QueueItem], repeatMode: RepeatMode, startIndex: Double): QueueLoadRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], repeatMode = repeatMode.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueLoadRequest]
  }
  @scala.inline
  implicit class QueueLoadRequestOps[Self <: QueueLoadRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[QueueItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatMode(value: RepeatMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

