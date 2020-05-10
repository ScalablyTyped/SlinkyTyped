package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts a table at the specified location.  A newline character will be
  * inserted before the inserted table.
  */
@js.native
trait SchemaInsertTableRequest extends js.Object {
  /**
    * The number of columns in the table.
    */
  var columns: js.UndefOr[Double] = js.native
  /**
    * Inserts the table at the end of the given header, footer or document
    * body. A newline character will be inserted before the inserted table.
    * Tables cannot be inserted inside a footnote.
    */
  var endOfSegmentLocation: js.UndefOr[SchemaEndOfSegmentLocation] = js.native
  /**
    * Inserts the table at a specific model index.  A newline character will be
    * inserted before the inserted table, therefore the table start index will
    * be at the specified location index + 1.  The table must be inserted
    * inside the bounds of an existing Paragraph. For instance, it cannot be
    * inserted at a table&#39;s start index (i.e. between an existing table and
    * its preceding paragraph).  Tables cannot be inserted inside a footnote or
    * equation.
    */
  var location: js.UndefOr[SchemaLocation] = js.native
  /**
    * The number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
}

object SchemaInsertTableRequest {
  @scala.inline
  def apply(): SchemaInsertTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTableRequest]
  }
  @scala.inline
  implicit class SchemaInsertTableRequestOps[Self <: SchemaInsertTableRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
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
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

