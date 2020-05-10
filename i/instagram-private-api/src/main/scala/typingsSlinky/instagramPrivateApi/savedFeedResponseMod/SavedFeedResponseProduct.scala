package typingsSlinky.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedFeedResponseProduct extends js.Object {
  var can_share_to_story: Boolean = js.native
  var checkout_style: String = js.native
  var current_price: String = js.native
  var current_price_stripped: String = js.native
  var description: String = js.native
  var external_url: String = js.native
  var full_price: String = js.native
  var full_price_stripped: String = js.native
  var has_viewer_saved: Boolean = js.native
  var main_image: SavedFeedResponseMainImage = js.native
  var merchant: SavedFeedResponseMerchant = js.native
  var name: String = js.native
  var price: String = js.native
  var product_id: String = js.native
  var retailer_id: String = js.native
  var review_status: String = js.native
  var thumbnail_image: SavedFeedResponseThumbnailImage = js.native
  var variant_values: js.UndefOr[js.Array[SavedFeedResponseVariantValuesItem]] = js.native
}

object SavedFeedResponseProduct {
  @scala.inline
  def apply(
    can_share_to_story: Boolean,
    checkout_style: String,
    current_price: String,
    current_price_stripped: String,
    description: String,
    external_url: String,
    full_price: String,
    full_price_stripped: String,
    has_viewer_saved: Boolean,
    main_image: SavedFeedResponseMainImage,
    merchant: SavedFeedResponseMerchant,
    name: String,
    price: String,
    product_id: String,
    retailer_id: String,
    review_status: String,
    thumbnail_image: SavedFeedResponseThumbnailImage
  ): SavedFeedResponseProduct = {
    val __obj = js.Dynamic.literal(can_share_to_story = can_share_to_story.asInstanceOf[js.Any], checkout_style = checkout_style.asInstanceOf[js.Any], current_price = current_price.asInstanceOf[js.Any], current_price_stripped = current_price_stripped.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], full_price = full_price.asInstanceOf[js.Any], full_price_stripped = full_price_stripped.asInstanceOf[js.Any], has_viewer_saved = has_viewer_saved.asInstanceOf[js.Any], main_image = main_image.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], retailer_id = retailer_id.asInstanceOf[js.Any], review_status = review_status.asInstanceOf[js.Any], thumbnail_image = thumbnail_image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseProduct]
  }
  @scala.inline
  implicit class SavedFeedResponseProductOps[Self <: SavedFeedResponseProduct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_share_to_story(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_share_to_story")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckout_style(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout_style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_price(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_price_stripped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_price_stripped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_price(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_price_stripped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_price_stripped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_viewer_saved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_viewer_saved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMain_image(value: SavedFeedResponseMainImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchant(value: SavedFeedResponseMerchant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetailer_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retailer_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail_image(value: SavedFeedResponseThumbnailImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariant_values(value: js.Array[SavedFeedResponseVariantValuesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant_values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant_values: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant_values")(js.undefined)
        ret
    }
  }
  
}

