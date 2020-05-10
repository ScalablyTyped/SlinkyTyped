package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookFilter extends Entity {
  // The currently applied filter on the given column. Read-only.
  var criteria: js.UndefOr[WorkbookFilterCriteria] = js.native
}

object WorkbookFilter {
  @scala.inline
  def apply(): WorkbookFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilter]
  }
  @scala.inline
  implicit class WorkbookFilterOps[Self <: WorkbookFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCriteria(value: WorkbookFilterCriteria): Self = {
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
  }
  
}

