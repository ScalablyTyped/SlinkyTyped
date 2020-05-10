package typingsSlinky.reactNativeFbsdk.mod

import typingsSlinky.reactNativeFbsdk.reactNativeFbsdkStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareVideoContent extends ShareContent {
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.native
  /**
    *  Description of the video.
    */
  var contentDescription: js.UndefOr[String] = js.native
  /**
    * Title of the video.
    */
  var contentTitle: js.UndefOr[String] = js.native
  /**
    * The type of content to be shared is photo.
    */
  var contentType: video = js.native
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * The photo that represents the video.
    */
  var previewPhoto: js.UndefOr[SharePhoto] = js.native
  /**
    * Video to be shared.
    */
  var video: ShareVideo = js.native
}

object ShareVideoContent {
  @scala.inline
  def apply(contentType: video, video: ShareVideo): ShareVideoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareVideoContent]
  }
  @scala.inline
  implicit class ShareVideoContentOps[Self <: ShareVideoContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: video): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: ShareVideo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
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
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewPhoto(value: SharePhoto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewPhoto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewPhoto")(js.undefined)
        ret
    }
  }
  
}

