package typingsSlinky.reactNativeFbsdk.mod

import typingsSlinky.reactNativeFbsdk.reactNativeFbsdkStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareLinkContent extends ShareContent {
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.native
  /**
    * The Description of the link.
    * If not specified, this field is automatically populated by information scraped
    * from the contentURL,  typically the title of the page.
    * @deprecated `contentDescription` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var contentDescription: js.UndefOr[String] = js.native
  /**
    * The title to display for this link.
    * @deprecated `contentTitle` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var contentTitle: js.UndefOr[String] = js.native
  /**
    * The type of content to be shared is link.
    */
  var contentType: link = js.native
  /**
    * URL for the content being shared.
    */
  var contentUrl: String = js.native
  /**
    * The URL of a picture to attach to this comment.
    * @deprecated `imageUrl` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The predefined quote to attach to this comment.
    * If specified, the quote text will render with custom styling on top of the link.
    */
  var quote: js.UndefOr[String] = js.native
}

object ShareLinkContent {
  @scala.inline
  def apply(contentType: link, contentUrl: String): ShareLinkContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareLinkContent]
  }
  @scala.inline
  implicit class ShareLinkContentOps[Self <: ShareLinkContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonParameters(value: ShareContentCommonParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
  }
  
}

