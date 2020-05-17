package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueReorderItemsRequest extends js.Object {
  var customData: js.Object = js.native
  var insertBefore: Double = js.native
  var itemIds: js.Array[Double] = js.native
}

object QueueReorderItemsRequest {
  @scala.inline
  def apply(customData: js.Object, insertBefore: Double, itemIds: js.Array[Double]): QueueReorderItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], itemIds = itemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueReorderItemsRequest]
  }
  @scala.inline
  implicit class QueueReorderItemsRequestOps[Self <: QueueReorderItemsRequest] (val x: Self) extends AnyVal {
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
    def withItemIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

