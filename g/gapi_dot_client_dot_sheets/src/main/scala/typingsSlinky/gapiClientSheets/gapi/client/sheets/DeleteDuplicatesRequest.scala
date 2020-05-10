package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDuplicatesRequest extends js.Object {
  /**
    * The columns in the range to analyze for duplicate values. If no columns are
    * selected then all columns are analyzed for duplicates.
    */
  var comparisonColumns: js.UndefOr[js.Array[DimensionRange]] = js.native
  /** The range to remove duplicates rows from. */
  var range: js.UndefOr[GridRange] = js.native
}

object DeleteDuplicatesRequest {
  @scala.inline
  def apply(): DeleteDuplicatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDuplicatesRequest]
  }
  @scala.inline
  implicit class DeleteDuplicatesRequestOps[Self <: DeleteDuplicatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonColumns(value: js.Array[DimensionRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

