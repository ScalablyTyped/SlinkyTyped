package typingsSlinky.igniteUi.global.Infragistics

import typingsSlinky.igniteUi.GridExcelExporterCallbacks
import typingsSlinky.igniteUi.GridExcelExporterSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.GridExcelExporter")
@js.native
class GridExcelExporter protected ()
  extends typingsSlinky.igniteUi.Infragistics.GridExcelExporter {
  def this(callbacks: GridExcelExporterCallbacks) = this()
  def this(settings: GridExcelExporterSettings) = this()
  /**
    * Exports the provided igGrid to Excel document.
    *
    * @param grid jQuery element of the igGrid.
    * @param userSettings Settings for exporting the grid.
    * @param userCallbacks Callbacks for the events.
    */
  /* CompleteClass */
  override def exportGrid(grid: js.Object, userSettings: js.Object, userCallbacks: js.Object): Unit = js.native
}

