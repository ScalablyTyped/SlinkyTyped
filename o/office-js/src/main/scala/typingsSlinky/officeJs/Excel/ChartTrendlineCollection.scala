package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.ChartTrendlineCollectionData
import typingsSlinky.officeJs.Excel.Interfaces.ChartTrendlineCollectionLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.ClientResult
import typingsSlinky.officeJs.OfficeExtension.LoadOption
import typingsSlinky.officeJs.officeJsStrings.Exponential
import typingsSlinky.officeJs.officeJsStrings.Linear
import typingsSlinky.officeJs.officeJsStrings.Logarithmic
import typingsSlinky.officeJs.officeJsStrings.MovingAverage
import typingsSlinky.officeJs.officeJsStrings.Polynomial
import typingsSlinky.officeJs.officeJsStrings.Power
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of Chart Trendlines.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait ChartTrendlineCollection extends ClientObject {
  
  /**
    * Adds a new trendline to trendline collection.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
    */
  def add(): ChartTrendline = js.native
  def add(`type`: ChartTrendlineType): ChartTrendline = js.native
  @JSName("add")
  def add_Exponential(`type`: Exponential): ChartTrendline = js.native
  @JSName("add")
  def add_Linear(`type`: Linear): ChartTrendline = js.native
  @JSName("add")
  def add_Logarithmic(`type`: Logarithmic): ChartTrendline = js.native
  @JSName("add")
  def add_MovingAverage(`type`: MovingAverage): ChartTrendline = js.native
  @JSName("add")
  def add_Polynomial(`type`: Polynomial): ChartTrendline = js.native
  @JSName("add")
  def add_Power(`type`: Power): ChartTrendline = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTrendlineCollection: RequestContext = js.native
  
  /**
    * Returns the number of trendlines in the collection.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Get trendline object by index, which is the insertion order in items array.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param index Represents the insertion order in items array.
    */
  def getItem(index: Double): ChartTrendline = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ChartTrendline] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTrendlineCollection = js.native
  def load(options: ChartTrendlineCollectionLoadOptions with CollectionLoadOptions): ChartTrendlineCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ChartTrendlineCollection = js.native
  def load(propertyNames: String): ChartTrendlineCollection = js.native
  def load(propertyNames: js.Array[String]): ChartTrendlineCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartTrendlineCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ChartTrendlineCollectionData = js.native
}
