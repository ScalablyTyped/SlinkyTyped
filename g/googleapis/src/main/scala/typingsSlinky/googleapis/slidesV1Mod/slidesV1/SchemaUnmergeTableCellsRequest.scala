package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unmerges cells in a Table.
  */
@js.native
trait SchemaUnmergeTableCellsRequest extends js.Object {
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The table range specifying which cells of the table to unmerge.  All
    * merged cells in this range will be unmerged, and cells that are already
    * unmerged will not be affected. If the range has no merged cells, the
    * request will do nothing. If there is text in any of the merged cells, the
    * text will remain in the upper-left (&quot;head&quot;) cell of the
    * resulting block of unmerged cells.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.native
}

object SchemaUnmergeTableCellsRequest {
  @scala.inline
  def apply(): SchemaUnmergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmergeTableCellsRequest]
  }
  @scala.inline
  implicit class SchemaUnmergeTableCellsRequestOps[Self <: SchemaUnmergeTableCellsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRange(value: SchemaTableRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRange")(js.undefined)
        ret
    }
  }
  
}

