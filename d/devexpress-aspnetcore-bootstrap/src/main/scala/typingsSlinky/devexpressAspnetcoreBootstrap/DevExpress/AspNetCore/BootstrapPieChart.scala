package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.disposing
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.done
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.drawn
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.exported
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.exporting
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.fileSaving
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.incidentOccurred
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.legendClick
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.optionChanged
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.pointClick
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.pointHoverChanged
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.pointSelectionChanged
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.tooltipHidden
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.tooltipShown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapPieChart extends Control {
  
  def exportTo(format: String, fileName: String): Unit = js.native
  
  def getDataSource(): js.Any = js.native
  
  def getInstance(): js.Any = js.native
  
  def off(
    eventName: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[
      /* this */ this.type, 
      js.UndefOr[
        BootstrapChartElementActionEventArgs | BootstrapChartElementClickEventArgs | BootstrapChartErrorEventArgs | BootstrapChartEventArgsBase | BootstrapChartExportEventArgs | BootstrapChartOptionChangedEventArgs
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_disposing(eventName: disposing): this.type = js.native
  @JSName("off")
  def off_disposing(
    eventName: disposing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_done(eventName: done): this.type = js.native
  @JSName("off")
  def off_done(
    eventName: done,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_drawn(eventName: drawn): this.type = js.native
  @JSName("off")
  def off_drawn(
    eventName: drawn,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_exported(eventName: exported): this.type = js.native
  @JSName("off")
  def off_exported(
    eventName: exported,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_exporting(eventName: exporting): this.type = js.native
  @JSName("off")
  def off_exporting(
    eventName: exporting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_fileSaving(eventName: fileSaving): this.type = js.native
  @JSName("off")
  def off_fileSaving(
    eventName: fileSaving,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_incidentOccurred(eventName: incidentOccurred): this.type = js.native
  @JSName("off")
  def off_incidentOccurred(
    eventName: incidentOccurred,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_legendClick(eventName: legendClick): this.type = js.native
  @JSName("off")
  def off_legendClick(
    eventName: legendClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_optionChanged(eventName: optionChanged): this.type = js.native
  @JSName("off")
  def off_optionChanged(
    eventName: optionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartOptionChangedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pointClick(eventName: pointClick): this.type = js.native
  @JSName("off")
  def off_pointClick(
    eventName: pointClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pointHoverChanged(eventName: pointHoverChanged): this.type = js.native
  @JSName("off")
  def off_pointHoverChanged(
    eventName: pointHoverChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pointSelectionChanged(eventName: pointSelectionChanged): this.type = js.native
  @JSName("off")
  def off_pointSelectionChanged(
    eventName: pointSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_tooltipHidden(eventName: tooltipHidden): this.type = js.native
  @JSName("off")
  def off_tooltipHidden(
    eventName: tooltipHidden,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_tooltipShown(eventName: tooltipShown): this.type = js.native
  @JSName("off")
  def off_tooltipShown(
    eventName: tooltipShown,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("on")
  def on_disposing(
    eventName: disposing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_done(
    eventName: done,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_drawn(
    eventName: drawn,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_exported(
    eventName: exported,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_exporting(
    eventName: exporting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fileSaving(
    eventName: fileSaving,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_incidentOccurred(
    eventName: incidentOccurred,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_legendClick(
    eventName: legendClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_optionChanged(
    eventName: optionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartOptionChangedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pointClick(
    eventName: pointClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pointHoverChanged(
    eventName: pointHoverChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pointSelectionChanged(
    eventName: pointSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_tooltipHidden(
    eventName: tooltipHidden,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_tooltipShown(
    eventName: tooltipShown,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("once")
  def once_disposing(
    eventName: disposing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_done(
    eventName: done,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_drawn(
    eventName: drawn,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_exported(
    eventName: exported,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartEventArgsBase], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_exporting(
    eventName: exporting,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_fileSaving(
    eventName: fileSaving,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartExportEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_incidentOccurred(
    eventName: incidentOccurred,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BootstrapChartErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_legendClick(
    eventName: legendClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_optionChanged(
    eventName: optionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartOptionChangedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pointClick(
    eventName: pointClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementClickEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pointHoverChanged(
    eventName: pointHoverChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pointSelectionChanged(
    eventName: pointSelectionChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_tooltipHidden(
    eventName: tooltipHidden,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_tooltipShown(
    eventName: tooltipShown,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[BootstrapChartElementActionEventArgs], 
      Unit
    ]
  ): this.type = js.native
  
  def print(): Unit = js.native
  
  def setDataSource(dataSource: js.Any): Unit = js.native
  
  def setOptions(options: js.Any): Unit = js.native
}
