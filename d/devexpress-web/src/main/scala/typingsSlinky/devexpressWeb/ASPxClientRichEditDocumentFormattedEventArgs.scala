package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.DocumentFormatted event.
  */
@js.native
trait ASPxClientRichEditDocumentFormattedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the number of pages in the document.
    */
  var pageCount: Double = js.native
}

object ASPxClientRichEditDocumentFormattedEventArgs {
  @scala.inline
  def apply(pageCount: Double): ASPxClientRichEditDocumentFormattedEventArgs = {
    val __obj = js.Dynamic.literal(pageCount = pageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditDocumentFormattedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientRichEditDocumentFormattedEventArgsOps[Self <: ASPxClientRichEditDocumentFormattedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

