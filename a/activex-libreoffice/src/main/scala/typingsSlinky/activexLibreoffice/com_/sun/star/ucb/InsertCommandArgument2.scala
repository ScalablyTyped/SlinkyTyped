package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The argument for the command "insert" augmented with some properties */
@js.native
trait InsertCommandArgument2 extends InsertCommandArgument {
  /** contains the Document Id of the document to insert */
  var DocumentId: String = js.native
  /** contains the MIME type of the document to insert */
  var MimeType: String = js.native
}

object InsertCommandArgument2 {
  @scala.inline
  def apply(Data: XInputStream, DocumentId: String, MimeType: String, ReplaceExisting: Boolean): InsertCommandArgument2 = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], DocumentId = DocumentId.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], ReplaceExisting = ReplaceExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertCommandArgument2]
  }
  @scala.inline
  implicit class InsertCommandArgument2Ops[Self <: InsertCommandArgument2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MimeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

