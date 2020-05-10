package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotFilterCriteria extends js.Object {
  var visibleValues: js.UndefOr[js.Array[String]] = js.native
}

object PivotFilterCriteria {
  @scala.inline
  def apply(): PivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFilterCriteria]
  }
  @scala.inline
  implicit class PivotFilterCriteriaOps[Self <: PivotFilterCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisibleValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleValues")(js.undefined)
        ret
    }
  }
  
}

