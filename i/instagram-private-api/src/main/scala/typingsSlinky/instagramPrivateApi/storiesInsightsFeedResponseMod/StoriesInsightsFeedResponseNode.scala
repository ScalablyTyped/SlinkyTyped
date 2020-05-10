package typingsSlinky.instagramPrivateApi.storiesInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoriesInsightsFeedResponseNode extends js.Object {
  var __typename: String = js.native
  var display_url: String = js.native
  var exits_count: Double = js.native
  var id: String = js.native
  var impression_count: Double = js.native
  var inline_insights_node: StoriesInsightsFeedResponseInlineInsightsNode = js.native
  var instagram_media_id: String = js.native
  var reach_count: Double = js.native
  var replies_count: Double = js.native
  var story_swipe_away_count: Double = js.native
  var taps_back_count: Double = js.native
  var taps_forward_count: Double = js.native
}

object StoriesInsightsFeedResponseNode {
  @scala.inline
  def apply(
    __typename: String,
    display_url: String,
    exits_count: Double,
    id: String,
    impression_count: Double,
    inline_insights_node: StoriesInsightsFeedResponseInlineInsightsNode,
    instagram_media_id: String,
    reach_count: Double,
    replies_count: Double,
    story_swipe_away_count: Double,
    taps_back_count: Double,
    taps_forward_count: Double
  ): StoriesInsightsFeedResponseNode = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], display_url = display_url.asInstanceOf[js.Any], exits_count = exits_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impression_count = impression_count.asInstanceOf[js.Any], inline_insights_node = inline_insights_node.asInstanceOf[js.Any], instagram_media_id = instagram_media_id.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], replies_count = replies_count.asInstanceOf[js.Any], story_swipe_away_count = story_swipe_away_count.asInstanceOf[js.Any], taps_back_count = taps_back_count.asInstanceOf[js.Any], taps_forward_count = taps_forward_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesInsightsFeedResponseNode]
  }
  @scala.inline
  implicit class StoriesInsightsFeedResponseNodeOps[Self <: StoriesInsightsFeedResponseNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__typename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__typename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExits_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exits_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpression_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impression_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline_insights_node(value: StoriesInsightsFeedResponseInlineInsightsNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_insights_node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstagram_media_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReach_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reach_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplies_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory_swipe_away_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_swipe_away_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaps_back_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taps_back_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaps_forward_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taps_forward_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

