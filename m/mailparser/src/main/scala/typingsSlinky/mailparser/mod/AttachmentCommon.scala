package typingsSlinky.mailparser.mod

import typingsSlinky.mailparser.mailparserStrings.attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * COmmon part of the Attachment object.
  */
@js.native
trait AttachmentCommon extends js.Object {
  /**
  	 * A MD5 hash of the message content.
  	 */
  var checksum: String = js.native
  /**
  	 * `contentId` without `<` and `>`.
  	 */
  var cid: js.UndefOr[String] = js.native
  /**
  	 * Attachment contents.
  	 */
  var content: js.Any = js.native
  /**
  	 * Content disposition type for the attachment,
  	 * most probably `'attachment'`.
  	 */
  var contentDisposition: String = js.native
  /**
  	 * The header value from `Content-ID`.
  	 */
  var contentId: js.UndefOr[String] = js.native
  /**
  	 * MIME type of the message.
  	 */
  var contentType: String = js.native
  /**
  	 * File name of the attachment.
  	 */
  var filename: js.UndefOr[String] = js.native
  /**
  	 * An array of raw header lines for the attachment node.
  	 */
  var headerLines: HeaderLines = js.native
  /**
  	 * A Map value that holds MIME headers for the attachment node.
  	 */
  var headers: Headers = js.native
     // e.g. '5.1321281380971@localhost'
  /**
  	 * If true then this attachment should not be offered for download
  	 * (at least not in the main attachments list).
  	 */
  var related: js.UndefOr[Boolean] = js.native
  /**
  	 * Message size in bytes.
  	 */
  var size: Double = js.native
  /**
  	 * Message type.
  	 */
  var `type`: attachment = js.native
}

object AttachmentCommon {
  @scala.inline
  def apply(
    checksum: String,
    content: js.Any,
    contentDisposition: String,
    contentType: String,
    headerLines: HeaderLines,
    headers: Headers,
    size: Double,
    `type`: attachment
  ): AttachmentCommon = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCommon]
  }
  @scala.inline
  implicit class AttachmentCommonOps[Self <: AttachmentCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderLines(value: HeaderLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(js.undefined)
        ret
    }
    @scala.inline
    def withContentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withRelated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(js.undefined)
        ret
    }
  }
  
}

