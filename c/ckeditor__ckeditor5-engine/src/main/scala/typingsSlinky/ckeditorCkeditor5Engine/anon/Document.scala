package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  var document: typingsSlinky.ckeditorCkeditor5Engine.mod.model.Document | Null = js.native
  var padWithNoOps: Boolean = js.native
  var useRelations: Boolean = js.native
}

object Document {
  @scala.inline
  def apply(padWithNoOps: Boolean, useRelations: Boolean): Document = {
    val __obj = js.Dynamic.literal(padWithNoOps = padWithNoOps.asInstanceOf[js.Any], useRelations = useRelations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadWithNoOps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padWithNoOps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseRelations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRelations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: typingsSlinky.ckeditorCkeditor5Engine.mod.model.Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(null)
        ret
    }
  }
  
}

