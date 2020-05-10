package typingsSlinky.flexmonster.mod

import typingsSlinky.flexmonster.AnonCharts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toolbar extends js.Object {
  var icons: AnonCharts = js.native
  // Charts tab
  def chartsHandler(`type`: String): Unit = js.native
  def chartsMultipleHandler(): Unit = js.native
  def conditionalFormattingHandler(): Unit = js.native
  // Connect tab
  def connectLocalCSVHandler(): Unit = js.native
  def connectLocalJSONHandler(): Unit = js.native
  def connectOLAP(): Unit = js.native
  def connectRemoteCSV(): Unit = js.native
  def connectRemoteJSON(): Unit = js.native
  def exportHandler(`type`: String): Unit = js.native
  // Fields tab
  def fieldsHandler(): Unit = js.native
  // Format tab
  def formatCellsHandler(): Unit = js.native
  // Fullscreen tab
  def fullscreenHandler(): Unit = js.native
  def getTabs(): js.Array[ToolbarTab] = js.native
  // Grid tab
  def gridHandler(): Unit = js.native
  // Open tab
  def openLocalReport(): Unit = js.native
  def openRemoteReport(): Unit = js.native
  // Options tab
  def optionsHandler(): Unit = js.native
  // Export tab
  def printHandler(): Unit = js.native
  // Save tab
  def saveHandler(): Unit = js.native
}

object Toolbar {
  @scala.inline
  def apply(
    chartsHandler: String => Unit,
    chartsMultipleHandler: () => Unit,
    conditionalFormattingHandler: () => Unit,
    connectLocalCSVHandler: () => Unit,
    connectLocalJSONHandler: () => Unit,
    connectOLAP: () => Unit,
    connectRemoteCSV: () => Unit,
    connectRemoteJSON: () => Unit,
    exportHandler: String => Unit,
    fieldsHandler: () => Unit,
    formatCellsHandler: () => Unit,
    fullscreenHandler: () => Unit,
    getTabs: () => js.Array[ToolbarTab],
    gridHandler: () => Unit,
    icons: AnonCharts,
    openLocalReport: () => Unit,
    openRemoteReport: () => Unit,
    optionsHandler: () => Unit,
    printHandler: () => Unit,
    saveHandler: () => Unit
  ): Toolbar = {
    val __obj = js.Dynamic.literal(chartsHandler = js.Any.fromFunction1(chartsHandler), chartsMultipleHandler = js.Any.fromFunction0(chartsMultipleHandler), conditionalFormattingHandler = js.Any.fromFunction0(conditionalFormattingHandler), connectLocalCSVHandler = js.Any.fromFunction0(connectLocalCSVHandler), connectLocalJSONHandler = js.Any.fromFunction0(connectLocalJSONHandler), connectOLAP = js.Any.fromFunction0(connectOLAP), connectRemoteCSV = js.Any.fromFunction0(connectRemoteCSV), connectRemoteJSON = js.Any.fromFunction0(connectRemoteJSON), exportHandler = js.Any.fromFunction1(exportHandler), fieldsHandler = js.Any.fromFunction0(fieldsHandler), formatCellsHandler = js.Any.fromFunction0(formatCellsHandler), fullscreenHandler = js.Any.fromFunction0(fullscreenHandler), getTabs = js.Any.fromFunction0(getTabs), gridHandler = js.Any.fromFunction0(gridHandler), icons = icons.asInstanceOf[js.Any], openLocalReport = js.Any.fromFunction0(openLocalReport), openRemoteReport = js.Any.fromFunction0(openRemoteReport), optionsHandler = js.Any.fromFunction0(optionsHandler), printHandler = js.Any.fromFunction0(printHandler), saveHandler = js.Any.fromFunction0(saveHandler))
    __obj.asInstanceOf[Toolbar]
  }
  @scala.inline
  implicit class ToolbarOps[Self <: Toolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartsHandler(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartsHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChartsMultipleHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartsMultipleHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConditionalFormattingHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalFormattingHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnectLocalCSVHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectLocalCSVHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnectLocalJSONHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectLocalJSONHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnectOLAP(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectOLAP")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnectRemoteCSV(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectRemoteCSV")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnectRemoteJSON(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectRemoteJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExportHandler(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFieldsHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFormatCellsHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatCellsHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFullscreenHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTabs(value: () => js.Array[ToolbarTab]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGridHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIcons(value: AnonCharts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenLocalReport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openLocalReport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenRemoteReport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openRemoteReport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptionsHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaveHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveHandler")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

