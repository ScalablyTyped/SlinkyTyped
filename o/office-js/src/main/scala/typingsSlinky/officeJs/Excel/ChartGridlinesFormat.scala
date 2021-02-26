package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.ChartGridlinesFormatData
import typingsSlinky.officeJs.Excel.Interfaces.ChartGridlinesFormatLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.ChartGridlinesFormatUpdateData
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.UpdateOptions
import typingsSlinky.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Encapsulates the format properties for chart gridlines.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartGridlinesFormat extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartGridlinesFormat: RequestContext = js.native
  
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  val line: ChartLineFormat = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartGridlinesFormat = js.native
  def load(options: ChartGridlinesFormatLoadOptions): ChartGridlinesFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartGridlinesFormat = js.native
  def load(propertyNames: String): ChartGridlinesFormat = js.native
  def load(propertyNames: js.Array[String]): ChartGridlinesFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartGridlinesFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartGridlinesFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartGridlinesFormatUpdateData): Unit = js.native
  def set(properties: ChartGridlinesFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartGridlinesFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartGridlinesFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartGridlinesFormatData = js.native
}
