package typingsSlinky.instagramPrivateApi.usertagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsertagsFeedResponseRootObject extends js.Object {
  var auto_load_more_enabled: Boolean = js.native
  var items: js.Array[UsertagsFeedResponseItemsItem] = js.native
  var more_available: Boolean = js.native
  var new_photos: js.Array[_] = js.native
  var next_max_id: String = js.native
  var num_results: Double = js.native
  var requires_review: Boolean = js.native
  var status: String = js.native
  var total_count: Double = js.native
}

object UsertagsFeedResponseRootObject {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[UsertagsFeedResponseItemsItem],
    more_available: Boolean,
    new_photos: js.Array[_],
    next_max_id: String,
    num_results: Double,
    requires_review: Boolean,
    status: String,
    total_count: Double
  ): UsertagsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], new_photos = new_photos.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], requires_review = requires_review.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsertagsFeedResponseRootObject]
  }
  @scala.inline
  implicit class UsertagsFeedResponseRootObjectOps[Self <: UsertagsFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_load_more_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_load_more_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[UsertagsFeedResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew_photos(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_max_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_results(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequires_review(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires_review")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

