package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionedDocument extends js.Object {
  var _rev: String = js.native
}

object RevisionedDocument {
  @scala.inline
  def apply(_rev: String): RevisionedDocument = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionedDocument]
  }
  @scala.inline
  implicit class RevisionedDocumentOps[Self <: RevisionedDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_rev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

