package typingsSlinky.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineFeedResponse extends js.Object {
  var auto_load_more_enabled: Boolean = js.native
  var client_feed_changelist_applied: Boolean = js.native
  var client_gap_enforcer_matrix: js.Array[TimelineFeedResponseClientGapEnforcerMatrixItem] = js.native
  var client_session_id: String = js.native
  var feed_items: js.Array[TimelineFeedResponseFeedItemsItem] = js.native
  var feed_pill_text: String = js.native
  var is_direct_v2_enabled: Boolean = js.native
  var more_available: Boolean = js.native
  var next_max_id: String = js.native
  var num_results: Double = js.native
  var pagination_info: TimelineFeedResponsePaginationInfo = js.native
  var status: String = js.native
  var view_state_version: String = js.native
}

object TimelineFeedResponse {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    client_feed_changelist_applied: Boolean,
    client_gap_enforcer_matrix: js.Array[TimelineFeedResponseClientGapEnforcerMatrixItem],
    client_session_id: String,
    feed_items: js.Array[TimelineFeedResponseFeedItemsItem],
    feed_pill_text: String,
    is_direct_v2_enabled: Boolean,
    more_available: Boolean,
    next_max_id: String,
    num_results: Double,
    pagination_info: TimelineFeedResponsePaginationInfo,
    status: String,
    view_state_version: String
  ): TimelineFeedResponse = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], client_feed_changelist_applied = client_feed_changelist_applied.asInstanceOf[js.Any], client_gap_enforcer_matrix = client_gap_enforcer_matrix.asInstanceOf[js.Any], client_session_id = client_session_id.asInstanceOf[js.Any], feed_items = feed_items.asInstanceOf[js.Any], feed_pill_text = feed_pill_text.asInstanceOf[js.Any], is_direct_v2_enabled = is_direct_v2_enabled.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], pagination_info = pagination_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], view_state_version = view_state_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponse]
  }
  @scala.inline
  implicit class TimelineFeedResponseOps[Self <: TimelineFeedResponse] (val x: Self) extends AnyVal {
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
    def withClient_feed_changelist_applied(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_feed_changelist_applied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_gap_enforcer_matrix(value: js.Array[TimelineFeedResponseClientGapEnforcerMatrixItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_gap_enforcer_matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_session_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeed_items(value: js.Array[TimelineFeedResponseFeedItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeed_pill_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed_pill_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_direct_v2_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_direct_v2_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
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
    def withPagination_info(value: TimelineFeedResponsePaginationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView_state_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_state_version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

