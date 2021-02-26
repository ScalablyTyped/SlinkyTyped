package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.RowColumnPivotHierarchyCollectionData
import typingsSlinky.officeJs.Excel.Interfaces.RowColumnPivotHierarchyCollectionLoadOptions
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.ClientResult
import typingsSlinky.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of RowColumnPivotHierarchy items associated with the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait RowColumnPivotHierarchyCollection extends ClientObject {
  
  /**
    * Adds the PivotHierarchy to the current axis. If the hierarchy is present elsewhere on the row, column,
    or filter axis, it will be removed from that location.
    *
    * [Api set: ExcelApi 1.8]
    */
  def add(pivotHierarchy: PivotHierarchy): RowColumnPivotHierarchy = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RowColumnPivotHierarchyCollection: RequestContext = js.native
  
  /**
    * Gets the number of pivot hierarchies in the collection.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a RowColumnPivotHierarchy by its name or id.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the RowColumnPivotHierarchy to be retrieved.
    */
  def getItem(name: String): RowColumnPivotHierarchy = js.native
  
  /**
    * Gets a RowColumnPivotHierarchy by name. If the RowColumnPivotHierarchy does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the RowColumnPivotHierarchy to be retrieved.
    */
  def getItemOrNullObject(name: String): RowColumnPivotHierarchy = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[RowColumnPivotHierarchy] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RowColumnPivotHierarchyCollection = js.native
  def load(options: RowColumnPivotHierarchyCollectionLoadOptions with CollectionLoadOptions): RowColumnPivotHierarchyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): RowColumnPivotHierarchyCollection = js.native
  def load(propertyNames: String): RowColumnPivotHierarchyCollection = js.native
  def load(propertyNames: js.Array[String]): RowColumnPivotHierarchyCollection = js.native
  
  /**
    * Removes the PivotHierarchy from the current axis.
    *
    * [Api set: ExcelApi 1.8]
    */
  def remove(rowColumnPivotHierarchy: RowColumnPivotHierarchy): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RowColumnPivotHierarchyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RowColumnPivotHierarchyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): RowColumnPivotHierarchyCollectionData = js.native
}
