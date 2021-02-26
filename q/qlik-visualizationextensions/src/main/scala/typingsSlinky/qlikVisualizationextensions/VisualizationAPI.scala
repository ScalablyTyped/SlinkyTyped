package typingsSlinky.qlikVisualizationextensions

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.qlikVisualizationextensions.TableAPI.IQTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisualizationAPI {
  
  @js.native
  trait IQVisualization extends StObject {
    
    /**
      * Closes a visualization and releases the session object.
      * @return - A promise.
      */
    def close(): IPromise[_] = js.native
    
    /**
      * Tells the visualization it has been resized and should re-paint.
      */
    def resize(): Unit = js.native
    
    /**
      * Sets options for a visualization.
      * @param options - Options to set (using applyPatches).
      */
    def setOptions(): Unit = js.native
    def setOptions(options: js.Any): Unit = js.native
    
    /**
      * Shows the visualization in an HTML element.
      * @param [element] - Optional. HTML element or HTML element ID.
      * @param [options] - Optional.
      * Name | Type | Description
      * noInteraction | Boolean | Set to true if you want to disable all interaction, including selections, in the visualization.
      * noSelections | Boolean | Set to true if you want to disable selections in the visualization.
      * | | Parameter introduced in version 3.0.
      */
    def show(): Unit = js.native
    def show(element: js.UndefOr[scala.Nothing], options: js.Any): Unit = js.native
    def show(element: String): Unit = js.native
    def show(element: String, options: js.Any): Unit = js.native
    def show(element: js.Any): Unit = js.native
    def show(element: js.Any, options: js.Any): Unit = js.native
    
    /**
      * Table object for this visualization.
      * Only for visualizations built on a hypercube.
      */
    var table: IQTable = js.native
  }
  
  @js.native
  trait IVisualization extends StObject {
    
    /**
      * Create a new visualization on the fly based on a session object
      * and will not be persisted in the app.
      * @param type - Visualization type. Can be:
      *       # barchart
      *       # combochart
      *       # gauge
      *       # kpi
      *       # linechart
      *       # piechart
      *       # pivot-table
      *       # scatterplot
      *       # table
      *       # treemap
      *       # extension
      * @param [cols] - Optional. Column definitions, dimensions and measures.
      *       Each entry can be of the following structures:
      *       # String
      *       # NxDimension
      *       # NxMeasure
      *       If the NxDimension or the NxMeasure refer to a library dimension
      *       or a library measure, you also need to add qType : "measure" or "dimension".
      * @param [options] - Optional. Options to set.
      * @return - A promise of a QVisualization.
      */
    def create(`type`: VisualizationType): IPromise[_] = js.native
    def create(`type`: VisualizationType, cols: js.UndefOr[scala.Nothing], options: js.Any): IPromise[_] = js.native
    def create(`type`: VisualizationType, cols: js.Array[_]): IPromise[_] = js.native
    def create(`type`: VisualizationType, cols: js.Array[_], options: js.Any): IPromise[_] = js.native
    
    /**
      * Gets an existing visualization.
      * @param id - Id for an existing visualization.
      * @return - A promise of a QVisualization.
      */
    def get(id: String): IPromise[_] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.barchart
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.combochart
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.gauge
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.kpi
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.linechart
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.piechart
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`pivot-table`
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.scatterplot
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.table
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.treemap
    - typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.extension
  */
  trait VisualizationType extends StObject
  object VisualizationType {
    
    @scala.inline
    def barchart: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.barchart = "barchart".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.barchart]
    
    @scala.inline
    def combochart: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.combochart = "combochart".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.combochart]
    
    @scala.inline
    def extension: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.extension = "extension".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.extension]
    
    @scala.inline
    def gauge: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.gauge = "gauge".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.gauge]
    
    @scala.inline
    def kpi: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.kpi = "kpi".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.kpi]
    
    @scala.inline
    def linechart: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.linechart = "linechart".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.linechart]
    
    @scala.inline
    def piechart: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.piechart = "piechart".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.piechart]
    
    @scala.inline
    def `pivot-table`: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`pivot-table` = "pivot-table".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.`pivot-table`]
    
    @scala.inline
    def scatterplot: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.scatterplot = "scatterplot".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.scatterplot]
    
    @scala.inline
    def table: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.table = "table".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.table]
    
    @scala.inline
    def treemap: typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.treemap = "treemap".asInstanceOf[typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.treemap]
  }
}
