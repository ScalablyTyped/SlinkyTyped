package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueInsertItemsRequest extends js.Object {
  var customData: js.Object = js.native
  var insertBefore: Double = js.native
  var items: js.Array[QueueItem] = js.native
}

object QueueInsertItemsRequest {
  @scala.inline
  def apply(customData: js.Object, insertBefore: Double, items: js.Array[QueueItem]): QueueInsertItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueInsertItemsRequest]
  }
  @scala.inline
  implicit class QueueInsertItemsRequestOps[Self <: QueueInsertItemsRequest] (val x: Self) extends AnyVal {
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
    def withInsertBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[QueueItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

