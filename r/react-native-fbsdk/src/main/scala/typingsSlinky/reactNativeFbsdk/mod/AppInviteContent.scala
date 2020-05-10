package typingsSlinky.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppInviteContent extends js.Object {
  /**
    * An app link target that will be used as a target when the user accepts the invite.
    */
  var applinkUrl: String = js.native
  /**
    * A URL to a preview image that will be displayed with the app invite.
    * This is optional. If you don't include it, a fallback image will be used.
    */
  var previewImageUrl: js.UndefOr[String] = js.native
  /**
    * Promotional code to be displayed while sending and receiving the invite.
    * This is optional. This can be between 0 and 10 characters long and can contain
    * alphanumeric characters only. To set a promo code, you need to set promo text.
    */
  var promotionCode: js.UndefOr[String] = js.native
  /**
    * Promotional text to be displayed while sending and receiving the invite.
    * This is optional. This can be between 0 and 80 characters long and can contain
    * alphanumeric and spaces only.
    */
  var promotionText: js.UndefOr[String] = js.native
}

object AppInviteContent {
  @scala.inline
  def apply(applinkUrl: String): AppInviteContent = {
    val __obj = js.Dynamic.literal(applinkUrl = applinkUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInviteContent]
  }
  @scala.inline
  implicit class AppInviteContentOps[Self <: AppInviteContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplinkUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applinkUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionText")(js.undefined)
        ret
    }
  }
  
}

