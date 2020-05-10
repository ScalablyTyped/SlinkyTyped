package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSparklineEventMap extends ControlEventMap {
  var disposing: BootstrapChartEventArgsBase = js.native
  var drawn: BootstrapChartEventArgsBase = js.native
  var exported: BootstrapChartEventArgsBase = js.native
  var exporting: BootstrapChartExportEventArgs = js.native
  var fileSaving: BootstrapChartExportEventArgs = js.native
  var incidentOccurred: BootstrapChartErrorEventArgs = js.native
  @JSName("init")
  var init_BootstrapSparklineEventMap: BootstrapChartEventArgsBase = js.native
  var optionChanged: BootstrapChartOptionChangedEventArgs = js.native
  var tooltipHidden: BootstrapChartEventArgsBase = js.native
  var tooltipShown: BootstrapChartEventArgsBase = js.native
}

object BootstrapSparklineEventMap {
  @scala.inline
  def apply(
    disposing: BootstrapChartEventArgsBase,
    drawn: BootstrapChartEventArgsBase,
    exported: BootstrapChartEventArgsBase,
    exporting: BootstrapChartExportEventArgs,
    fileSaving: BootstrapChartExportEventArgs,
    incidentOccurred: BootstrapChartErrorEventArgs,
    init: BootstrapChartEventArgsBase,
    optionChanged: BootstrapChartOptionChangedEventArgs,
    tooltipHidden: BootstrapChartEventArgsBase,
    tooltipShown: BootstrapChartEventArgsBase
  ): BootstrapSparklineEventMap = {
    val __obj = js.Dynamic.literal(disposing = disposing.asInstanceOf[js.Any], drawn = drawn.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], exporting = exporting.asInstanceOf[js.Any], fileSaving = fileSaving.asInstanceOf[js.Any], incidentOccurred = incidentOccurred.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], optionChanged = optionChanged.asInstanceOf[js.Any], tooltipHidden = tooltipHidden.asInstanceOf[js.Any], tooltipShown = tooltipShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSparklineEventMap]
  }
  @scala.inline
  implicit class BootstrapSparklineEventMapOps[Self <: BootstrapSparklineEventMap] (val x: Self) extends AnyVal {
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
    def withOptionChanged(value: BootstrapChartOptionChangedEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipHidden(value: BootstrapChartEventArgsBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipShown(value: BootstrapChartEventArgsBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

