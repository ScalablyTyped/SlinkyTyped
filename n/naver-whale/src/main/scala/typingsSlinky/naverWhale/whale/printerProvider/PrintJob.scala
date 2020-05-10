package typingsSlinky.naverWhale.whale.printerProvider

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintJob extends js.Object {
  /** The document content type. Supported formats are "application/pdf" and "image/pwg-raster". */
  var contentType: String = js.native
  /** Blob containing the document data to print. Format must match |contentType|. */
  var document: Blob = js.native
  /** ID of the printer which should handle the job. */
  var printerId: String = js.native
  /** Print ticket in  CJT format. */
  var ticket: js.Object = js.native
  /** The print job title. */
  var title: String = js.native
}

object PrintJob {
  @scala.inline
  def apply(contentType: String, document: Blob, printerId: String, ticket: js.Object, title: String): PrintJob = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], printerId = printerId.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintJob]
  }
  @scala.inline
  implicit class PrintJobOps[Self <: PrintJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocument(value: Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrinterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicket(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

