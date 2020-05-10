package typingsSlinky.reactNativeFbsdk.mod

import typingsSlinky.reactNativeFbsdk.reactNativeFbsdkStrings.photo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharePhotoContent extends ShareContent {
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.native
  /**
    * The type of content to be shared is photo.
    */
  var contentType: photo = js.native
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * Photos to be shared.
    */
  var photos: js.Array[SharePhoto] = js.native
}

object SharePhotoContent {
  @scala.inline
  def apply(contentType: photo, photos: js.Array[SharePhoto]): SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePhotoContent]
  }
  @scala.inline
  implicit class SharePhotoContentOps[Self <: SharePhotoContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: photo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[SharePhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
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
  }
  
}

