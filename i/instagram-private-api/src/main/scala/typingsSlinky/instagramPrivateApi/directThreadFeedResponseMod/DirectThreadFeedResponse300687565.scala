package typingsSlinky.instagramPrivateApi.directThreadFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadFeedResponse300687565 extends js.Object {
  var item_id: String = js.native
  var timestamp: String = js.native
}

object DirectThreadFeedResponse300687565 {
  @scala.inline
  def apply(item_id: String, timestamp: String): DirectThreadFeedResponse300687565 = {
    val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadFeedResponse300687565]
  }
  @scala.inline
  implicit class DirectThreadFeedResponse300687565Ops[Self <: DirectThreadFeedResponse300687565] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

