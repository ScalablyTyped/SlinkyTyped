package typingsSlinky.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents media content, such as a photo, that can be attached to a
  * timeline item.
  */
@js.native
trait SchemaAttachment extends js.Object {
  /**
    * The MIME type of the attachment.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * The URL for the content.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * The ID of the attachment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Indicates that the contentUrl is not available because the attachment
    * content is still being processed. If the caller wishes to retrieve the
    * content, it should try again later.
    */
  var isProcessingContent: js.UndefOr[Boolean] = js.native
}

object SchemaAttachment {
  @scala.inline
  def apply(): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachment]
  }
  @scala.inline
  implicit class SchemaAttachmentOps[Self <: SchemaAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
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
    def withIsProcessingContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProcessingContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsProcessingContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProcessingContent")(js.undefined)
        ret
    }
  }
  
}

