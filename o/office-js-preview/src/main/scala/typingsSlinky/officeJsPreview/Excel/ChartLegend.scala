package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.ChartLegendData
import typingsSlinky.officeJsPreview.Excel.Interfaces.ChartLegendLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.ChartLegendUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Corner
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Custom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Left
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Right
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the legend in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartLegend extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartLegend: RequestContext = js.native
  
  /**
    *
    * Represents the formatting of a chart legend, which includes fill and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartLegendFormat = js.native
  
  /**
    *
    * Specifies the height, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: Double = js.native
  
  /**
    *
    * Specifies the left, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: Double = js.native
  
  /**
    *
    * Represents a collection of legendEntries in the legend.
    *
    * [Api set: ExcelApi 1.7]
    */
  val legendEntries: ChartLegendEntryCollection = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartLegend = js.native
  def load(options: ChartLegendLoadOptions): ChartLegend = js.native
  def load(propertyNamesAndPaths: Expand): ChartLegend = js.native
  def load(propertyNames: String): ChartLegend = js.native
  def load(propertyNames: js.Array[String]): ChartLegend = js.native
  
  /**
    *
    * Specifies if the chart legend should overlap with the main body of the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var overlay: Boolean = js.native
  
  /**
    *
    * Specifies the position of the legend on the chart. See Excel.ChartLegendPosition for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLegend): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartLegend): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartLegendUpdateData): Unit = js.native
  def set(properties: ChartLegendUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * Specifies if the legend has a shadow on the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartLegend object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartLegendData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartLegendData = js.native
  
  /**
    *
    * Specifies the top of a chart legend.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: Double = js.native
  
  /**
    *
    * Specifies if the ChartLegend is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: Boolean = js.native
  
  /**
    *
    * Specifies the width, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: Double = js.native
}
