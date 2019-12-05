package typingsSlinky.atJupyterlabCsvviewer

import typingsSlinky.atJupyterlabCsvviewer.libParseMod.IParser.IResults
import typingsSlinky.atJupyterlabCsvviewer.libToolbarMod.CSVToolbar.IOptions
import typingsSlinky.atPhosphorDatagrid.atPhosphorDatagridMod.DataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer", JSImport.Namespace)
@js.native
object atJupyterlabCsvviewerMod extends js.Object {
  @js.native
  class CSVDelimiter protected ()
    extends typingsSlinky.atJupyterlabCsvviewer.libToolbarMod.CSVDelimiter {
    /**
      * Construct a new csv table widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class CSVDocumentWidget protected ()
    extends typingsSlinky.atJupyterlabCsvviewer.libWidgetMod.CSVDocumentWidget {
    def this(options: typingsSlinky.atJupyterlabCsvviewer.libWidgetMod.CSVDocumentWidget.IOptions) = this()
  }
  
  @js.native
  class CSVViewer protected ()
    extends typingsSlinky.atJupyterlabCsvviewer.libWidgetMod.CSVViewer {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typingsSlinky.atJupyterlabCsvviewer.libWidgetMod.CSVViewer.IOptions) = this()
  }
  
  @js.native
  class CSVViewerFactory ()
    extends typingsSlinky.atJupyterlabCsvviewer.libWidgetMod.CSVViewerFactory
  
  @js.native
  class DSVModel protected ()
    extends typingsSlinky.atJupyterlabCsvviewer.libModelMod.DSVModel {
    /**
      * Create a data model with static CSV data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: typingsSlinky.atJupyterlabCsvviewer.libModelMod.DSVModel.IOptions) = this()
  }
  
  @js.native
  class GridSearchService protected ()
    extends typingsSlinky.atJupyterlabCsvviewer.libWidgetMod.GridSearchService {
    def this(grid: DataGrid) = this()
  }
  
  @js.native
  class TSVViewerFactory ()
    extends typingsSlinky.atJupyterlabCsvviewer.libWidgetMod.TSVViewerFactory
  
  @js.native
  class TextRenderConfig ()
    extends typingsSlinky.atJupyterlabCsvviewer.libWidgetMod.TextRenderConfig
  
  def parseDSV(options: typingsSlinky.atJupyterlabCsvviewer.libParseMod.IParser.IOptions): IResults = js.native
  def parseDSVNoQuotes(options: typingsSlinky.atJupyterlabCsvviewer.libParseMod.IParser.IOptions): IResults = js.native
}

