package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonAllowDependencyAdding
import typingsSlinky.devextreme.AnonEndExpr
import typingsSlinky.devextreme.AnonKeyExpr
import typingsSlinky.devextreme.AnonResourceIdExpr
import typingsSlinky.devextreme.AnonSelectedRowKey
import typingsSlinky.devextreme.AnonTextExpr
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.days
import typingsSlinky.devextreme.devextremeStrings.hours
import typingsSlinky.devextreme.devextremeStrings.inside
import typingsSlinky.devextreme.devextremeStrings.minutes
import typingsSlinky.devextreme.devextremeStrings.months
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.outside
import typingsSlinky.devextreme.devextremeStrings.quarters
import typingsSlinky.devextreme.devextremeStrings.weeks
import typingsSlinky.devextreme.devextremeStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxGanttOptions extends WidgetOptions[dxGantt] {
  /** Specifies whether users can select tasks in the Gantt. */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** An array of columns in the Gantt. */
  var columns: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.native
  /** Configures dependencies. */
  var dependencies: js.UndefOr[AnonKeyExpr] = js.native
  /** Configures edit options. */
  var editing: js.UndefOr[AnonAllowDependencyAdding] = js.native
  /** A function that is executed after users select a task or clear its selection. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonSelectedRowKey, _]] = js.native
  /** Configures resource assignments. */
  var resourceAssignments: js.UndefOr[AnonResourceIdExpr] = js.native
  /** Configures task resources. */
  var resources: js.UndefOr[AnonTextExpr] = js.native
  /** Specifies the zoom level of tasks in the Gantt chart. */
  var scaleType: js.UndefOr[auto | minutes | hours | days | weeks | months | quarters | years] = js.native
  /** Allows you to select a row or determine which row is selected. */
  var selectedRowKey: js.UndefOr[js.Any] = js.native
  /** Specifies whether to display task resources. */
  var showResources: js.UndefOr[Boolean] = js.native
  /** Specifies whether to show/hide horizontal faint lines that separate tasks. */
  var showRowLines: js.UndefOr[Boolean] = js.native
  /** Specifies the width of the task list in pixels. */
  var taskListWidth: js.UndefOr[Double] = js.native
  /** Specifies a task's title position. */
  var taskTitlePosition: js.UndefOr[inside | outside | none] = js.native
  /** Configures tasks. */
  var tasks: js.UndefOr[AnonEndExpr] = js.native
}

object dxGanttOptions {
  @scala.inline
  def apply(): dxGanttOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttOptions]
  }
  @scala.inline
  implicit class dxGanttOptionsOps[Self <: dxGanttOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[dxTreeListColumn | String]): Self = {
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
    def withDependencies(value: AnonKeyExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withEditing(value: AnonAllowDependencyAdding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ AnonSelectedRowKey => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAssignments(value: AnonResourceIdExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: AnonTextExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleType(value: auto | minutes | hours | days | weeks | months | quarters | years): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleType")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRowKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRowKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowKey")(js.undefined)
        ret
    }
    @scala.inline
    def withShowResources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showResources")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowLines")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskListWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskListWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskListWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskListWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskTitlePosition(value: inside | outside | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskTitlePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskTitlePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskTitlePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTasks(value: AnonEndExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(js.undefined)
        ret
    }
  }
  
}

