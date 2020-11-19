package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.ChartMapOptionsData
import typingsSlinky.officeJsPreview.Excel.Interfaces.ChartMapOptionsLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.ChartMapOptionsUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Albers
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BestFit
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.City
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Continent
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Country
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.County
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DataOnly
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Mercator
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Miller
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Robinson
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ShowAll
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.State
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Encapsulates the properties for a region map chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartMapOptions extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartMapOptions: RequestContext = js.native
  
  /**
    *
    * Specifies the series map labels strategy of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = js.native
  
  /**
    *
    * Specifies the series mapping level of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartMapOptions = js.native
  def load(options: ChartMapOptionsLoadOptions): ChartMapOptions = js.native
  def load(propertyNamesAndPaths: Expand): ChartMapOptions = js.native
  def load(propertyNames: String): ChartMapOptions = js.native
  def load(propertyNames: js.Array[String]): ChartMapOptions = js.native
  
  /**
    *
    * Specifies the series projection type of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartMapOptions): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartMapOptions): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartMapOptionsUpdateData): Unit = js.native
  def set(properties: ChartMapOptionsUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartMapOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartMapOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartMapOptionsData = js.native
}
