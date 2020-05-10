package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The body of a single MIME message part.
  */
@js.native
trait SchemaMessagePartBody extends js.Object {
  /**
    * When present, contains the ID of an external attachment that can be
    * retrieved in a separate messages.attachments.get request. When not
    * present, the entire content of the message part body is contained in the
    * data field.
    */
  var attachmentId: js.UndefOr[String] = js.native
  /**
    * The body data of a MIME message part as a base64url encoded string. May
    * be empty for MIME container types that have no message body or when the
    * body data is sent as a separate attachment. An attachment ID is present
    * if the body data is contained in a separate attachment.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Number of bytes for the message part data (encoding notwithstanding).
    */
  var size: js.UndefOr[Double] = js.native
}

object SchemaMessagePartBody {
  @scala.inline
  def apply(): SchemaMessagePartBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessagePartBody]
  }
  @scala.inline
  implicit class SchemaMessagePartBodyOps[Self <: SchemaMessagePartBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

