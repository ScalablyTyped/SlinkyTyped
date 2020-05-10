package typingsSlinky.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedFeedResponseInItem extends js.Object {
  var duration_in_video_in_sec: js.UndefOr[Null] = js.native
  var position: js.Array[Double | String] = js.native
  var product: js.UndefOr[SavedFeedResponseProduct] = js.native
  var start_time_in_video_in_sec: js.UndefOr[Null] = js.native
  var user: js.UndefOr[SavedFeedResponseUser] = js.native
}

object SavedFeedResponseInItem {
  @scala.inline
  def apply(position: js.Array[Double | String]): SavedFeedResponseInItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseInItem]
  }
  @scala.inline
  implicit class SavedFeedResponseInItemOps[Self <: SavedFeedResponseInItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration_in_video_in_sec(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_in_video_in_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration_in_video_in_sec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_in_video_in_sec")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration_in_video_in_secNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_in_video_in_sec")(null)
        ret
    }
    @scala.inline
    def withProduct(value: SavedFeedResponseProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_time_in_video_in_sec(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time_in_video_in_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_time_in_video_in_sec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time_in_video_in_sec")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_time_in_video_in_secNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time_in_video_in_sec")(null)
        ret
    }
    @scala.inline
    def withUser(value: SavedFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

