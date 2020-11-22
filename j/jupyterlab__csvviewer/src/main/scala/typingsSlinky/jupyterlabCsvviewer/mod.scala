package typingsSlinky.jupyterlabCsvviewer

import typingsSlinky.jupyterlabCsvviewer.parseMod.IParser.IOptions
import typingsSlinky.jupyterlabCsvviewer.parseMod.IParser.IResults
import typingsSlinky.luminoDatagrid.mod.DataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/csvviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def parseDSV(options: IOptions): IResults = js.native
  
  def parseDSVNoQuotes(options: IOptions): IResults = js.native
  
  @js.native
  class CSVDelimiter protected ()
    extends typingsSlinky.jupyterlabCsvviewer.toolbarMod.CSVDelimiter {
    /**
      * Construct a new csv table widget.
      */
    def this(options: typingsSlinky.jupyterlabCsvviewer.toolbarMod.CSVToolbar.IOptions) = this()
  }
  
  @js.native
  class CSVDocumentWidget protected ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget {
    def this(options: typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget.IOptions) = this()
  }
  
  @js.native
  class CSVViewer protected ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVViewer {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions) = this()
  }
  
  @js.native
  class CSVViewerFactory ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVViewerFactory
  
  @js.native
  class DSVModel protected ()
    extends typingsSlinky.jupyterlabCsvviewer.modelMod.DSVModel {
    /**
      * Create a data model with static CSV data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: typingsSlinky.jupyterlabCsvviewer.modelMod.DSVModel.IOptions) = this()
  }
  
  @js.native
  class GridSearchService protected ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.GridSearchService {
    def this(grid: DataGrid) = this()
  }
  
  @js.native
  class TSVViewerFactory ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.TSVViewerFactory
  
  @js.native
  class TextRenderConfig ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.TextRenderConfig
}
