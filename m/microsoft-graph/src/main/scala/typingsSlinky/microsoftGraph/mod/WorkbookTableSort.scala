package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookTableSort extends Entity {
  // Represents the current conditions used to last sort the table. Read-only.
  var fields: js.UndefOr[js.Array[WorkbookSortField]] = js.native
  // Represents whether the casing impacted the last sort of the table. Read-only.
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    * Represents Chinese character ordering method last used to sort the table. The possible values are: PinYin, StrokeCount.
    * Read-only.
    */
  var method: js.UndefOr[String] = js.native
}

object WorkbookTableSort {
  @scala.inline
  def apply(): WorkbookTableSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTableSort]
  }
  @scala.inline
  implicit class WorkbookTableSortOps[Self <: WorkbookTableSort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[WorkbookSortField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
  }
  
}

