package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class BootstrapSparklineEventMapMutableBuilder[Self <: BootstrapSparklineEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisposing(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "disposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawn(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "drawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExported(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExporting(value: BootstrapChartExportEventArgs): Self = StObject.set(x, "exporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSaving(value: BootstrapChartExportEventArgs): Self = StObject.set(x, "fileSaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncidentOccurred(value: BootstrapChartErrorEventArgs): Self = StObject.set(x, "incidentOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionChanged(value: BootstrapChartOptionChangedEventArgs): Self = StObject.set(x, "optionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipHidden(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "tooltipHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipShown(value: BootstrapChartEventArgsBase): Self = StObject.set(x, "tooltipShown", value.asInstanceOf[js.Any])
  }
}
