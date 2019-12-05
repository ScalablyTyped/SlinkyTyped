package typingsSlinky.pdfkit.PDFKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentInfo extends js.Object {
  var Author: js.UndefOr[String] = js.undefined
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  var Creator: js.UndefOr[String] = js.undefined
  var Keywords: js.UndefOr[String] = js.undefined
  var ModDate: js.UndefOr[js.Date] = js.undefined
  var Producer: js.UndefOr[String] = js.undefined
  var Title: js.UndefOr[String] = js.undefined
}

object DocumentInfo {
  @scala.inline
  def apply(
    Author: String = null,
    CreationDate: js.Date = null,
    Creator: String = null,
    Keywords: String = null,
    ModDate: js.Date = null,
    Producer: String = null,
    Title: String = null
  ): DocumentInfo = {
    val __obj = js.Dynamic.literal()
    if (Author != null) __obj.updateDynamic("Author")(Author.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Creator != null) __obj.updateDynamic("Creator")(Creator.asInstanceOf[js.Any])
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords.asInstanceOf[js.Any])
    if (ModDate != null) __obj.updateDynamic("ModDate")(ModDate.asInstanceOf[js.Any])
    if (Producer != null) __obj.updateDynamic("Producer")(Producer.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInfo]
  }
}

