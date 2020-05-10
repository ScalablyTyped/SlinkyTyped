package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full attachments are used to create new attachments or returned when the attachments option
  * is true.
  */
@js.native
trait FullAttachment extends Attachment {
  /**
    * Mime type of the attachment
    */
  var content_type: String = js.native
  /**
    * {string} if `binary` was `false`
    * {Blob|Buffer} if `binary` was `true`
    */
  var data: AttachmentData = js.native
  /** MD5 hash, starts with "md5-" prefix; populated by PouchDB for new attachments */
  var digest: js.UndefOr[String] = js.native
}

object FullAttachment {
  @scala.inline
  def apply(content_type: String, data: AttachmentData): FullAttachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullAttachment]
  }
  @scala.inline
  implicit class FullAttachmentOps[Self <: FullAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: AttachmentData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.undefined)
        ret
    }
  }
  
}

