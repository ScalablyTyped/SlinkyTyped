package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessibleDependencyInfo extends js.Object {
  var accessibleDependencyInfo: js.UndefOr[String] = js.native
  var accessiblePredecessorInfo: js.UndefOr[String] = js.native
  var accessibleSuccessorInfo: js.UndefOr[String] = js.native
  var accessibleTaskTypeMilestone: js.UndefOr[String] = js.native
  var accessibleTaskTypeSummary: js.UndefOr[String] = js.native
  var componentName: js.UndefOr[String] = js.native
  var finishFinishDependencyAriaDesc: js.UndefOr[String] = js.native
  var finishStartDependencyAriaDesc: js.UndefOr[String] = js.native
  var labelAndValue: js.UndefOr[String] = js.native
  var labelBaselineDate: js.UndefOr[String] = js.native
  var labelBaselineEnd: js.UndefOr[String] = js.native
  var labelBaselineStart: js.UndefOr[String] = js.native
  var labelClearSelection: js.UndefOr[String] = js.native
  var labelCountWithTotal: js.UndefOr[String] = js.native
  var labelDataVisualization: js.UndefOr[String] = js.native
  var labelDate: js.UndefOr[String] = js.native
  var labelEnd: js.UndefOr[String] = js.native
  var labelInvalidData: js.UndefOr[String] = js.native
  var labelLabel: js.UndefOr[String] = js.native
  var labelMoveBy: js.UndefOr[String] = js.native
  var labelNoData: js.UndefOr[String] = js.native
  var labelProgress: js.UndefOr[String] = js.native
  var labelRow: js.UndefOr[String] = js.native
  var labelStart: js.UndefOr[String] = js.native
  var startFinishDependencyAriaDesc: js.UndefOr[String] = js.native
  var startStartDependencyAriaDesc: js.UndefOr[String] = js.native
  var stateCollapsed: js.UndefOr[String] = js.native
  var stateDrillable: js.UndefOr[String] = js.native
  var stateExpanded: js.UndefOr[String] = js.native
  var stateHidden: js.UndefOr[String] = js.native
  var stateIsolated: js.UndefOr[String] = js.native
  var stateMaximized: js.UndefOr[String] = js.native
  var stateMinimized: js.UndefOr[String] = js.native
  var stateSelected: js.UndefOr[String] = js.native
  var stateUnselected: js.UndefOr[String] = js.native
  var stateVisible: js.UndefOr[String] = js.native
  var taskMoveCancelled: js.UndefOr[String] = js.native
  var taskMoveFinalized: js.UndefOr[String] = js.native
  var taskMoveInitiated: js.UndefOr[String] = js.native
  var taskMoveInitiatedInstruction: js.UndefOr[String] = js.native
  var taskMoveSelectionInfo: js.UndefOr[String] = js.native
  var tooltipZoomIn: js.UndefOr[String] = js.native
  var tooltipZoomOut: js.UndefOr[String] = js.native
}

object AnonAccessibleDependencyInfo {
  @scala.inline
  def apply(): AnonAccessibleDependencyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAccessibleDependencyInfo]
  }
  @scala.inline
  implicit class AnonAccessibleDependencyInfoOps[Self <: AnonAccessibleDependencyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibleDependencyInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleDependencyInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleDependencyInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleDependencyInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessiblePredecessorInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessiblePredecessorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessiblePredecessorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessiblePredecessorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibleSuccessorInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleSuccessorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleSuccessorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleSuccessorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibleTaskTypeMilestone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleTaskTypeMilestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleTaskTypeMilestone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleTaskTypeMilestone")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibleTaskTypeSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleTaskTypeSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleTaskTypeSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleTaskTypeSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishFinishDependencyAriaDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishFinishDependencyAriaDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishFinishDependencyAriaDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishFinishDependencyAriaDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishStartDependencyAriaDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishStartDependencyAriaDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishStartDependencyAriaDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishStartDependencyAriaDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAndValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAndValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAndValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAndValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBaselineDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaselineDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBaselineDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaselineDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBaselineEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaselineEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBaselineEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaselineEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelBaselineStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaselineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelBaselineStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelBaselineStart")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelClearSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClearSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelClearSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClearSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCountWithTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCountWithTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCountWithTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCountWithTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDataVisualization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDataVisualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDataVisualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDataVisualization")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelInvalidData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInvalidData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInvalidData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInvalidData")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMoveBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMoveBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMoveBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMoveBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelNoData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelNoData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelNoData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelNoData")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRow")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStartFinishDependencyAriaDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFinishDependencyAriaDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartFinishDependencyAriaDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFinishDependencyAriaDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withStartStartDependencyAriaDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startStartDependencyAriaDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartStartDependencyAriaDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startStartDependencyAriaDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withStateCollapsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withStateDrillable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateDrillable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateDrillable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateDrillable")(js.undefined)
        ret
    }
    @scala.inline
    def withStateExpanded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withStateHidden(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withStateIsolated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateIsolated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateIsolated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateIsolated")(js.undefined)
        ret
    }
    @scala.inline
    def withStateMaximized(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMaximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateMaximized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMaximized")(js.undefined)
        ret
    }
    @scala.inline
    def withStateMinimized(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMinimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateMinimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMinimized")(js.undefined)
        ret
    }
    @scala.inline
    def withStateSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withStateUnselected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateUnselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateUnselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateUnselected")(js.undefined)
        ret
    }
    @scala.inline
    def withStateVisible(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskMoveCancelled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveCancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskMoveCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveCancelled")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskMoveFinalized(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveFinalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskMoveFinalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveFinalized")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskMoveInitiated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveInitiated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskMoveInitiated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveInitiated")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskMoveInitiatedInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveInitiatedInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskMoveInitiatedInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveInitiatedInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskMoveSelectionInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveSelectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskMoveSelectionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskMoveSelectionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipZoomIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipZoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipZoomIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipZoomIn")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipZoomOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipZoomOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipZoomOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipZoomOut")(js.undefined)
        ret
    }
  }
  
}

