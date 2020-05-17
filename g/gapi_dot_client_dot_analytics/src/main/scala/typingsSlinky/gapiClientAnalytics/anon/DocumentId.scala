package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentId extends js.Object {
  /** Id of the document/file containing the report data. */
  var documentId: js.UndefOr[String] = js.native
}

object DocumentId {
  @scala.inline
  def apply(): DocumentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentId]
  }
  @scala.inline
  implicit class DocumentIdOps[Self <: DocumentId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentId")(js.undefined)
        ret
    }
  }
  
}

