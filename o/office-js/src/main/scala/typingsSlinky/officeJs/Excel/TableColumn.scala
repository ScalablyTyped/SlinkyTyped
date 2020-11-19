package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.TableColumnData
import typingsSlinky.officeJs.Excel.Interfaces.TableColumnLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.TableColumnUpdateData
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.UpdateOptions
import typingsSlinky.officeJs.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a column in a table.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait TableColumn extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableColumn: RequestContext = js.native
  
  /**
    * Deletes the column from the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    *
    * Retrieve the filter applied to the column.
    *
    * [Api set: ExcelApi 1.2]
    */
  val filter: Filter = js.native
  
  /**
    * Gets the range object associated with the data body of the column.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getDataBodyRange(): Range = js.native
  
  /**
    * Gets the range object associated with the header row of the column.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getHeaderRowRange(): Range = js.native
  
  /**
    * Gets the range object associated with the entire column.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  
  /**
    * Gets the range object associated with the totals row of the column.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getTotalRowRange(): Range = js.native
  
  /**
    *
    * Returns a unique key that identifies the column within the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  val id: Double = js.native
  
  /**
    *
    * Returns the index number of the column within the columns collection of the table. Zero-indexed.
    *
    * [Api set: ExcelApi 1.1]
    */
  val index: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableColumn = js.native
  def load(options: TableColumnLoadOptions): TableColumn = js.native
  def load(propertyNamesAndPaths: Expand): TableColumn = js.native
  def load(propertyNames: String): TableColumn = js.native
  def load(propertyNames: js.Array[String]): TableColumn = js.native
  
  /**
    *
    * Specifies the name of the table column.
    *
    * [Api set: ExcelApi 1.1 for getting the name; 1.4 for setting it.]
    */
  var name: String = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TableColumn): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableColumnUpdateData): Unit = js.native
  def set(properties: TableColumnUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableColumn): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TableColumn object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableColumnData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableColumnData = js.native
  
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.Array[js.Array[_]] = js.native
}
