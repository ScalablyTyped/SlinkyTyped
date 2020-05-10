package typingsSlinky.instagramPrivateApi.locationFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationFeedResponseExploreItemInfo extends js.Object {
  var aspect_ratio: Double = js.native
  var autoplay: Boolean = js.native
  var num_columns: Double = js.native
  var total_num_columns: Double = js.native
}

object LocationFeedResponseExploreItemInfo {
  @scala.inline
  def apply(aspect_ratio: Double, autoplay: Boolean, num_columns: Double, total_num_columns: Double): LocationFeedResponseExploreItemInfo = {
    val __obj = js.Dynamic.literal(aspect_ratio = aspect_ratio.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], num_columns = num_columns.asInstanceOf[js.Any], total_num_columns = total_num_columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseExploreItemInfo]
  }
  @scala.inline
  implicit class LocationFeedResponseExploreItemInfoOps[Self <: LocationFeedResponseExploreItemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspect_ratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_columns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_num_columns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_num_columns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

