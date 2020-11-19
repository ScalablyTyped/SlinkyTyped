package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.ChartTrendlineData
import typingsSlinky.officeJsPreview.Excel.Interfaces.ChartTrendlineLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.ChartTrendlineUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Exponential
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Linear
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Logarithmic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MovingAverage
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Polynomial
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Power
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * This object represents the attributes for a chart trendline object.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait ChartTrendline extends ClientObject {
  
  /**
    *
    * Represents the number of periods that the trendline extends backward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: Double = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTrendline: RequestContext = js.native
  
  /**
    * Delete the trendline object.
    *
    * [Api set: ExcelApi 1.7]
    */
  def delete(): Unit = js.native
  
  /**
    *
    * Represents the formatting of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  val format: ChartTrendlineFormat = js.native
  
  /**
    *
    * Represents the number of periods that the trendline extends forward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: Double = js.native
  
  /**
    *
    * Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.Any = js.native
  
  /**
    *
    * Represents the label of a chart trendline.
    *
    * [Api set: ExcelApi 1.8]
    */
  val label: ChartTrendlineLabel = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTrendline = js.native
  def load(options: ChartTrendlineLoadOptions): ChartTrendline = js.native
  def load(propertyNamesAndPaths: Expand): ChartTrendline = js.native
  def load(propertyNames: String): ChartTrendline = js.native
  def load(propertyNames: js.Array[String]): ChartTrendline = js.native
  
  /**
    *
    * Represents the period of a chart trendline. Only applicable for trendline with MovingAverage type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: Double = js.native
  
  /**
    *
    * Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: String = js.native
  
  /**
    *
    * Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: Double = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTrendline): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartTrendline): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartTrendlineUpdateData): Unit = js.native
  def set(properties: ChartTrendlineUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * True if the equation for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: Boolean = js.native
  
  /**
    *
    * True if the R-squared for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTrendline object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartTrendlineData = js.native
  
  /**
    *
    * Represents the type of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: ChartTrendlineType | Linear | Exponential | Logarithmic | MovingAverage | Polynomial | Power = js.native
}
