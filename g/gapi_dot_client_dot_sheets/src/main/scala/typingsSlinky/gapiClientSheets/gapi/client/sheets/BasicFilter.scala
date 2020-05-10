package typingsSlinky.gapiClientSheets.gapi.client.sheets

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicFilter extends js.Object {
  /**
    * The criteria for showing/hiding values per column.
    * The map's key is the column index, and the value is the criteria for
    * that column.
    */
  var criteria: js.UndefOr[Record[String, FilterCriteria]] = js.native
  /** The range the filter covers. */
  var range: js.UndefOr[GridRange] = js.native
  /**
    * The sort order per column. Later specifications are used when values
    * are equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
}

object BasicFilter {
  @scala.inline
  def apply(): BasicFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicFilter]
  }
  @scala.inline
  implicit class BasicFilterOps[Self <: BasicFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCriteria(value: Record[String, FilterCriteria]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(js.undefined)
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
    @scala.inline
    def withSortSpecs(value: js.Array[SortSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSpecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSpecs")(js.undefined)
        ret
    }
  }
  
}

