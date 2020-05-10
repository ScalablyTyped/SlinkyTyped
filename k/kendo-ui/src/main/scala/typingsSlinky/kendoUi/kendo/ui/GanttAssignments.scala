package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttAssignments extends js.Object {
  var dataResourceIdField: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var dataTaskIdField: js.UndefOr[String] = js.native
  var dataValueField: js.UndefOr[String] = js.native
}

object GanttAssignments {
  @scala.inline
  def apply(): GanttAssignments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttAssignments]
  }
  @scala.inline
  implicit class GanttAssignmentsOps[Self <: GanttAssignments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataResourceIdField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataResourceIdField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataResourceIdField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataResourceIdField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTaskIdField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTaskIdField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTaskIdField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTaskIdField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValueField")(js.undefined)
        ret
    }
  }
  
}

