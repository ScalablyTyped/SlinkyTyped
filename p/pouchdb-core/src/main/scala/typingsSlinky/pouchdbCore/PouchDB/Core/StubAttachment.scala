package typingsSlinky.pouchdbCore.PouchDB.Core

import typingsSlinky.pouchdbCore.pouchdbCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stub attachments are returned by PouchDB by default (attachments option set to false)
  */
@js.native
trait StubAttachment extends Attachment {
  /**
    * Mime type of the attachment
    */
  var content_type: String = js.native
  /**
    * Database digest of the attachment
    */
  var digest: String = js.native
  /**
    * Length of the attachment
    */
  var length: Double = js.native
  /**
    * Attachment is a stub
    */
  var stub: `true` = js.native
}

object StubAttachment {
  @scala.inline
  def apply(content_type: String, digest: String, length: Double, stub: `true`): StubAttachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stub = stub.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubAttachment]
  }
  @scala.inline
  implicit class StubAttachmentOps[Self <: StubAttachment] (val x: Self) extends AnyVal {
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
    def withDigest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStub(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

