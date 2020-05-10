package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single MIME message part.
  */
@js.native
trait SchemaMessagePart extends js.Object {
  /**
    * The message part body for this part, which may be empty for container
    * MIME message parts.
    */
  var body: js.UndefOr[SchemaMessagePartBody] = js.native
  /**
    * The filename of the attachment. Only present if this message part
    * represents an attachment.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * List of headers on this message part. For the top-level message part,
    * representing the entire message payload, it will contain the standard RFC
    * 2822 email headers such as To, From, and Subject.
    */
  var headers: js.UndefOr[js.Array[SchemaMessagePartHeader]] = js.native
  /**
    * The MIME type of the message part.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The immutable ID of the message part.
    */
  var partId: js.UndefOr[String] = js.native
  /**
    * The child MIME message parts of this part. This only applies to container
    * MIME message parts, for example multipart/ *. For non- container MIME
    * message part types, such as text/plain, this field is empty. For more
    * information, see RFC 1521.
    */
  var parts: js.UndefOr[js.Array[SchemaMessagePart]] = js.native
}

object SchemaMessagePart {
  @scala.inline
  def apply(): SchemaMessagePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessagePart]
  }
  @scala.inline
  implicit class SchemaMessagePartOps[Self <: SchemaMessagePart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: SchemaMessagePartBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
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
    def withHeaders(value: js.Array[SchemaMessagePartHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPartId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partId")(js.undefined)
        ret
    }
    @scala.inline
    def withParts(value: js.Array[SchemaMessagePart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(js.undefined)
        ret
    }
  }
  
}

