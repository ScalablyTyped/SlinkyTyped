package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.PivotTableScopedCollectionData
import typingsSlinky.officeJs.Excel.Interfaces.PivotTableScopedCollectionLoadOptions
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.ClientResult
import typingsSlinky.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a scoped collection of PivotTables. The PivotTables are sorted based on the location of the PivotTable's top-left corner. They are ordered top to bottom and then left to right.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait PivotTableScopedCollection extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotTableScopedCollection: RequestContext = js.native
  
  /**
    * Gets the number of PivotTables in the collection.
    *
    * [Api set: ExcelApi 1.12]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets the first PivotTable in the collection. The PivotTables in the collection are sorted top to bottom and left to right, such that top-left table is the first PivotTable in the collection.
    *
    * [Api set: ExcelApi 1.12]
    */
  def getFirst(): PivotTable = js.native
  
  /**
    * Gets a PivotTable by name.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param key Name of the PivotTable to be retrieved.
    */
  def getItem(key: String): PivotTable = js.native
  
  /**
    * Gets a PivotTable by name. If the PivotTable does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param name Name of the PivotTable to be retrieved.
    */
  def getItemOrNullObject(name: String): PivotTable = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PivotTable] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotTableScopedCollection = js.native
  def load(options: PivotTableScopedCollectionLoadOptions with CollectionLoadOptions): PivotTableScopedCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): PivotTableScopedCollection = js.native
  def load(propertyNames: String): PivotTableScopedCollection = js.native
  def load(propertyNames: js.Array[String]): PivotTableScopedCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PivotTableScopedCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotTableScopedCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PivotTableScopedCollectionData = js.native
}
