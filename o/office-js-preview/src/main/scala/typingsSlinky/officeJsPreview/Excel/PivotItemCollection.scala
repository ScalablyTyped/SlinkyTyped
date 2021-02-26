package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.PivotItemCollectionData
import typingsSlinky.officeJsPreview.Excel.Interfaces.PivotItemCollectionLoadOptions
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.ClientResult
import typingsSlinky.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of all the PivotItems related to their parent PivotField.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait PivotItemCollection extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotItemCollection: RequestContext = js.native
  
  /**
    * Gets the number of PivotItems in the collection.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a PivotItem by its name or id.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the PivotItem to be retrieved.
    */
  def getItem(name: String): PivotItem = js.native
  
  /**
    * Gets a PivotItem by name. If the PivotItem does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the PivotItem to be retrieved.
    */
  def getItemOrNullObject(name: String): PivotItem = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PivotItem] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotItemCollection = js.native
  def load(options: PivotItemCollectionLoadOptions with CollectionLoadOptions): PivotItemCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): PivotItemCollection = js.native
  def load(propertyNames: String): PivotItemCollection = js.native
  def load(propertyNames: js.Array[String]): PivotItemCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PivotItemCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotItemCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PivotItemCollectionData = js.native
}
