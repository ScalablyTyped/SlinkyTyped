package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookFilterDatetime extends js.Object {
  var date: js.UndefOr[String] = js.native
  var specificity: js.UndefOr[String] = js.native
}

object WorkbookFilterDatetime {
  @scala.inline
  def apply(): WorkbookFilterDatetime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilterDatetime]
  }
  @scala.inline
  implicit class WorkbookFilterDatetimeOps[Self <: WorkbookFilterDatetime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecificity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecificity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificity")(js.undefined)
        ret
    }
  }
  
}

