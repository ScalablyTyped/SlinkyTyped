package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseMedia extends js.Object {
  var ad_media: Null = js.native
  var comment_count: Double = js.native
  var creation_time: Double = js.native
  var display_url: String = js.native
  var has_product_tags: Boolean = js.native
  var id: String = js.native
  var image: InsightsServicePostResponseImage = js.native
  var inline_insights_node: InsightsServicePostResponseInlineInsightsNode = js.native
  var instagram_actor: InsightsServicePostResponseInstagramActor = js.native
  var instagram_media_id: String = js.native
  var instagram_media_owner_id: String = js.native
  var instagram_media_type: String = js.native
  var like_count: Double = js.native
  var organic_instagram_media_id: String = js.native
  var save_count: Double = js.native
  var shopping_outbound_click_count: Double = js.native
  var shopping_product_click_count: Double = js.native
}

object InsightsServicePostResponseMedia {
  @scala.inline
  def apply(
    ad_media: Null,
    comment_count: Double,
    creation_time: Double,
    display_url: String,
    has_product_tags: Boolean,
    id: String,
    image: InsightsServicePostResponseImage,
    inline_insights_node: InsightsServicePostResponseInlineInsightsNode,
    instagram_actor: InsightsServicePostResponseInstagramActor,
    instagram_media_id: String,
    instagram_media_owner_id: String,
    instagram_media_type: String,
    like_count: Double,
    organic_instagram_media_id: String,
    save_count: Double,
    shopping_outbound_click_count: Double,
    shopping_product_click_count: Double
  ): InsightsServicePostResponseMedia = {
    val __obj = js.Dynamic.literal(ad_media = ad_media.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], creation_time = creation_time.asInstanceOf[js.Any], display_url = display_url.asInstanceOf[js.Any], has_product_tags = has_product_tags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inline_insights_node = inline_insights_node.asInstanceOf[js.Any], instagram_actor = instagram_actor.asInstanceOf[js.Any], instagram_media_id = instagram_media_id.asInstanceOf[js.Any], instagram_media_owner_id = instagram_media_owner_id.asInstanceOf[js.Any], instagram_media_type = instagram_media_type.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], organic_instagram_media_id = organic_instagram_media_id.asInstanceOf[js.Any], save_count = save_count.asInstanceOf[js.Any], shopping_outbound_click_count = shopping_outbound_click_count.asInstanceOf[js.Any], shopping_product_click_count = shopping_product_click_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseMedia]
  }
  @scala.inline
  implicit class InsightsServicePostResponseMediaOps[Self <: InsightsServicePostResponseMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAd_media(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ad_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreation_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creation_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_product_tags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_product_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: InsightsServicePostResponseImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInline_insights_node(value: InsightsServicePostResponseInlineInsightsNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline_insights_node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstagram_actor(value: InsightsServicePostResponseInstagramActor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_actor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstagram_media_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstagram_media_owner_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_media_owner_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstagram_media_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instagram_media_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLike_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganic_instagram_media_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organic_instagram_media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShopping_outbound_click_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopping_outbound_click_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShopping_product_click_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopping_product_click_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

