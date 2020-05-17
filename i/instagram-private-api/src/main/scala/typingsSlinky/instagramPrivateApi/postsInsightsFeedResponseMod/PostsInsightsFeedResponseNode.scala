package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseNode extends js.Object {
  var __typename: String = js.native
  var comment_count: js.UndefOr[Double] = js.native
  var creation_time: js.UndefOr[Double] = js.native
  var engagement: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[PostsInsightsFeedResponseImage] = js.native
  var inline_insights_node: js.UndefOr[PostsInsightsFeedResponseInlineInsightsNode] = js.native
  var instagram_media_id: js.UndefOr[String] = js.native
  var instagram_media_type: js.UndefOr[String] = js.native
  var like_count: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var save_count: js.UndefOr[Double] = js.native
  var shopping_outbound_click_count: js.UndefOr[Double] = js.native
  var shopping_product_click_count: js.UndefOr[Double] = js.native
  var value: js.UndefOr[Double] = js.native
  var video_view_count: js.UndefOr[Null] = js.native
}

object PostsInsightsFeedResponseNode {
  @scala.inline
  def apply(__typename: String): PostsInsightsFeedResponseNode = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseNode]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseNodeOps[Self <: PostsInsightsFeedResponseNode] (val x: Self) extends AnyVal {
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
    def withComment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(js.undefined)
        ret
    }
    @scala.inline
    def withCreation_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creation_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreation_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creation_time")(js.undefined)
        ret
    }
    @scala.inline
    def withEngagement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engagement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engagement")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: PostsInsightsFeedResponseImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withInline_insights_node(value: PostsInsightsFeedResponseInlineInsightsNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_insights_node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline_insights_node: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_insights_node")(js.undefined)
        ret
    }
    @scala.inline
    def withInstagram_media_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstagram_media_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_media_id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstagram_media_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_media_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstagram_media_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_media_type")(js.undefined)
        ret
    }
    @scala.inline
    def withLike_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLike_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like_count")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSave_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save_count")(js.undefined)
        ret
    }
    @scala.inline
    def withShopping_outbound_click_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopping_outbound_click_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShopping_outbound_click_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopping_outbound_click_count")(js.undefined)
        ret
    }
    @scala.inline
    def withShopping_product_click_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopping_product_click_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShopping_product_click_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopping_product_click_count")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

