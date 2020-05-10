package typingsSlinky.reactNativeFbsdk.mod

import typingsSlinky.reactNativeFbsdk.reactNativeFbsdkStrings.`open-graph`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareOpenGraphContent extends ShareContent {
  /**
    * Open Graph Action to be shared.
    */
  var action: ShareOpenGraphAction = js.native
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.native
  /**
    * The type of content to be shared is open graph content.
    */
  var contentType: `open-graph` = js.native
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * Property name that points to the primary Open Graph Object in the action.
    */
  var previewPropertyName: String = js.native
}

object ShareOpenGraphContent {
  @scala.inline
  def apply(action: ShareOpenGraphAction, contentType: `open-graph`, previewPropertyName: String): ShareOpenGraphContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphContent]
  }
  @scala.inline
  implicit class ShareOpenGraphContentOps[Self <: ShareOpenGraphContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ShareOpenGraphAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: `open-graph`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewPropertyName")(value.asInstanceOf[js.Any])
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

