package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePresentationsPagesGetthumbnail extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The object ID of the page whose thumbnail to retrieve.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  /**
    * The ID of the presentation to retrieve.
    */
  var presentationId: js.UndefOr[String] = js.native
  /**
    * The optional mime type of the thumbnail image.  If you don't specify the
    * mime type, the default mime type will be PNG.
    */
  @JSName("thumbnailProperties.mimeType")
  var thumbnailPropertiesDotmimeType: js.UndefOr[String] = js.native
  /**
    * The optional thumbnail image size.  If you don't specify the size, the
    * server chooses a default size of the image.
    */
  @JSName("thumbnailProperties.thumbnailSize")
  var thumbnailPropertiesDotthumbnailSize: js.UndefOr[String] = js.native
}

object ParamsResourcePresentationsPagesGetthumbnail {
  @scala.inline
  def apply(): ParamsResourcePresentationsPagesGetthumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePresentationsPagesGetthumbnail]
  }
  @scala.inline
  implicit class ParamsResourcePresentationsPagesGetthumbnailOps[Self <: ParamsResourcePresentationsPagesGetthumbnail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withPageObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationId")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailPropertiesDotmimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailProperties.mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailPropertiesDotmimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailProperties.mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailPropertiesDotthumbnailSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailProperties.thumbnailSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailPropertiesDotthumbnailSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailProperties.thumbnailSize")(js.undefined)
        ret
    }
  }
  
}

