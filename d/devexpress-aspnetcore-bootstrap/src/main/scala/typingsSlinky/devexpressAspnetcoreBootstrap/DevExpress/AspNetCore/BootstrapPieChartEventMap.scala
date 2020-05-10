package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapPieChartEventMap extends ControlEventMap {
  var disposing: BootstrapChartEventArgsBase = js.native
  var done: BootstrapChartEventArgsBase = js.native
  var drawn: BootstrapChartEventArgsBase = js.native
  var exported: BootstrapChartEventArgsBase = js.native
  var exporting: BootstrapChartExportEventArgs = js.native
  var fileSaving: BootstrapChartExportEventArgs = js.native
  var incidentOccurred: BootstrapChartErrorEventArgs = js.native
  @JSName("init")
  var init_BootstrapPieChartEventMap: BootstrapChartEventArgsBase = js.native
  var legendClick: BootstrapChartElementClickEventArgs = js.native
  var optionChanged: BootstrapChartOptionChangedEventArgs = js.native
  var pointClick: BootstrapChartElementClickEventArgs = js.native
  var pointHoverChanged: BootstrapChartElementActionEventArgs = js.native
  var pointSelectionChanged: BootstrapChartElementActionEventArgs = js.native
  var tooltipHidden: BootstrapChartElementActionEventArgs = js.native
  var tooltipShown: BootstrapChartElementActionEventArgs = js.native
}

object BootstrapPieChartEventMap {
  @scala.inline
  def apply(
    disposing: BootstrapChartEventArgsBase,
    done: BootstrapChartEventArgsBase,
    drawn: BootstrapChartEventArgsBase,
    exported: BootstrapChartEventArgsBase,
    exporting: BootstrapChartExportEventArgs,
    fileSaving: BootstrapChartExportEventArgs,
    incidentOccurred: BootstrapChartErrorEventArgs,
    init: BootstrapChartEventArgsBase,
    legendClick: BootstrapChartElementClickEventArgs,
    optionChanged: BootstrapChartOptionChangedEventArgs,
    pointClick: BootstrapChartElementClickEventArgs,
    pointHoverChanged: BootstrapChartElementActionEventArgs,
    pointSelectionChanged: BootstrapChartElementActionEventArgs,
    tooltipHidden: BootstrapChartElementActionEventArgs,
    tooltipShown: BootstrapChartElementActionEventArgs
  ): BootstrapPieChartEventMap = {
    val __obj = js.Dynamic.literal(disposing = disposing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], drawn = drawn.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], exporting = exporting.asInstanceOf[js.Any], fileSaving = fileSaving.asInstanceOf[js.Any], incidentOccurred = incidentOccurred.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], legendClick = legendClick.asInstanceOf[js.Any], optionChanged = optionChanged.asInstanceOf[js.Any], pointClick = pointClick.asInstanceOf[js.Any], pointHoverChanged = pointHoverChanged.asInstanceOf[js.Any], pointSelectionChanged = pointSelectionChanged.asInstanceOf[js.Any], tooltipHidden = tooltipHidden.asInstanceOf[js.Any], tooltipShown = tooltipShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapPieChartEventMap]
  }
  @scala.inline
  implicit class BootstrapPieChartEventMapOps[Self <: BootstrapPieChartEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisposing(value: BootstrapChartEventArgsBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: BootstrapChartEventArgsBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawn(value: BootstrapChartEventArgsBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExported(value: BootstrapChartEventArgsBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExporting(value: BootstrapChartExportEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSaving(value: BootstrapChartExportEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSaving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncidentOccurred(value: BootstrapChartErrorEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incidentOccurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: BootstrapChartEventArgsBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegendClick(value: BootstrapChartElementClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionChanged(value: BootstrapChartOptionChangedEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointClick(value: BootstrapChartElementClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointHoverChanged(value: BootstrapChartElementActionEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointHoverChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointSelectionChanged(value: BootstrapChartElementActionEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSelectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipHidden(value: BootstrapChartElementActionEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipShown(value: BootstrapChartElementActionEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

