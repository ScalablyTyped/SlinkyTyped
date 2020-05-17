package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct extends the one for transfers arguments by adding a Mime type and a Document Id property to it. */
@js.native
trait GlobalTransferCommandArgument2 extends GlobalTransferCommandArgument {
  /** contains the DocumentId of the source object. */
  var DocumentId: String = js.native
  /** contains the MIME type of the source object. */
  var MimeType: String = js.native
}

object GlobalTransferCommandArgument2 {
  @scala.inline
  def apply(
    DocumentId: String,
    MimeType: String,
    NameClash: Double,
    NewTitle: String,
    Operation: TransferCommandOperation,
    SourceURL: String,
    TargetURL: String
  ): GlobalTransferCommandArgument2 = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], NameClash = NameClash.asInstanceOf[js.Any], NewTitle = NewTitle.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], SourceURL = SourceURL.asInstanceOf[js.Any], TargetURL = TargetURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTransferCommandArgument2]
  }
  @scala.inline
  implicit class GlobalTransferCommandArgument2Ops[Self <: GlobalTransferCommandArgument2] (val x: Self) extends AnyVal {
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

