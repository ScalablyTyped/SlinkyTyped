package typingsSlinky.highcharts.offlineExportingMod

import typingsSlinky.highcharts.mod.ExportingOptions
import typingsSlinky.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("highcharts", JSImport.Namespace)
@js.native
object highchartsAugmentingMod extends js.Object {
  
  @js.native
  trait Chart extends js.Object {
    
    /**
      * Exporting and offline-exporting modules required. Export a chart to
      * an image locally in the user's browser.
      *
      * @param exportingOptions
      *        Exporting options, the same as in
      *        Highcharts.Chart#exportChart.
      *
      * @param chartOptions
      *        Additional chart options for the exported chart. For example a
      *        different background color can be added here, or `dataLabels`
      *        for export only.
      */
    def exportChartLocal(): Unit = js.native
    def exportChartLocal(exportingOptions: js.UndefOr[scala.Nothing], chartOptions: Options): Unit = js.native
    def exportChartLocal(exportingOptions: ExportingOptions): Unit = js.native
    def exportChartLocal(exportingOptions: ExportingOptions, chartOptions: Options): Unit = js.native
  }
}
