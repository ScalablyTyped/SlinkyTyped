package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts a page break followed by a newline at the specified location.
  */
@js.native
trait SchemaInsertPageBreakRequest extends js.Object {
  /**
    * Inserts the page break at the end of the document body.  Page breaks
    * cannot be inserted inside a footnote, header or footer. Since page breaks
    * can only be inserted inside the body, the segment ID field must be empty.
    */
  var endOfSegmentLocation: js.UndefOr[SchemaEndOfSegmentLocation] = js.native
  /**
    * Inserts the page break at a specific index in the document.  The page
    * break must be inserted inside the bounds of an existing Paragraph. For
    * instance, it cannot be inserted at a table&#39;s start index (i.e.
    * between the table and its preceding paragraph).  Page breaks cannot be
    * inserted inside a table, equation, footnote, header or footer. Since page
    * breaks can only be inserted inside the body, the segment ID field must be
    * empty.
    */
  var location: js.UndefOr[SchemaLocation] = js.native
}

object SchemaInsertPageBreakRequest {
  @scala.inline
  def apply(): SchemaInsertPageBreakRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertPageBreakRequest]
  }
  @scala.inline
  implicit class SchemaInsertPageBreakRequestOps[Self <: SchemaInsertPageBreakRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndOfSegmentLocation(value: SchemaEndOfSegmentLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfSegmentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOfSegmentLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfSegmentLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: SchemaLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

