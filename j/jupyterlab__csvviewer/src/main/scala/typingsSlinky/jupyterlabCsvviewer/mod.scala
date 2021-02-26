package typingsSlinky.jupyterlabCsvviewer

import typingsSlinky.jupyterlabCsvviewer.parseMod.IParser.IResults
import typingsSlinky.jupyterlabCsvviewer.toolbarMod.CSVToolbar.IOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.luminoDatagrid.mod.DataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/csvviewer", "CSVDelimiter")
  @js.native
  class CSVDelimiter protected ()
    extends typingsSlinky.jupyterlabCsvviewer.toolbarMod.CSVDelimiter {
    /**
      * Construct a new csv table widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "CSVDocumentWidget")
  @js.native
  class CSVDocumentWidget protected ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget {
    def this(options: typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "CSVViewer")
  @js.native
  class CSVViewer protected ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVViewer {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "CSVViewerFactory")
  @js.native
  class CSVViewerFactory protected ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "DSVModel")
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
  
  @JSImport("@jupyterlab/csvviewer", "GridSearchService")
  @js.native
  class GridSearchService protected ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.GridSearchService {
    def this(grid: DataGrid) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "TSVViewerFactory")
  @js.native
  class TSVViewerFactory protected ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.TSVViewerFactory {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[IDocumentWidget[typingsSlinky.jupyterlabCsvviewer.widgetMod.CSVViewer, IModel]]) = this()
  }
  
  @JSImport("@jupyterlab/csvviewer", "TextRenderConfig")
  @js.native
  class TextRenderConfig ()
    extends typingsSlinky.jupyterlabCsvviewer.widgetMod.TextRenderConfig
  
  @JSImport("@jupyterlab/csvviewer", "parseDSV")
  @js.native
  def parseDSV(options: typingsSlinky.jupyterlabCsvviewer.parseMod.IParser.IOptions): IResults = js.native
  
  @JSImport("@jupyterlab/csvviewer", "parseDSVNoQuotes")
  @js.native
  def parseDSVNoQuotes(options: typingsSlinky.jupyterlabCsvviewer.parseMod.IParser.IOptions): IResults = js.native
}
