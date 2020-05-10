package typingsSlinky.instagramPrivateApi.directThreadFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadFeedResponseItemsItem extends js.Object {
  var client_context: String = js.native
  var item_id: String = js.native
  var item_type: String = js.native
  var text: String = js.native
  var timestamp: String = js.native
  var user_id: Double = js.native
}

object DirectThreadFeedResponseItemsItem {
  @scala.inline
  def apply(
    client_context: String,
    item_id: String,
    item_type: String,
    text: String,
    timestamp: String,
    user_id: Double
  ): DirectThreadFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadFeedResponseItemsItem]
  }
  @scala.inline
  implicit class DirectThreadFeedResponseItemsItemOps[Self <: DirectThreadFeedResponseItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_context(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

