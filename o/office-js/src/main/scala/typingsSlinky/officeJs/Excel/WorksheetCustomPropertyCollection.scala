package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.WorksheetCustomPropertyCollectionData
import typingsSlinky.officeJs.Excel.Interfaces.WorksheetCustomPropertyCollectionLoadOptions
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.ClientResult
import typingsSlinky.officeJs.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains the collection of worksheet-level custom property.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait WorksheetCustomPropertyCollection extends ClientObject {
  
  /**
    * Adds a new custom property that maps to the provided key. This overwrites existing custom properties with that key.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param key The key that identifies the custom property object. It is case-insensitive.The key is limited to 255 characters (larger values will cause an "InvalidArgument" error to be thrown.)
    * @param value The value of this custom property.
    */
  def add(key: String, value: String): WorksheetCustomProperty = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetCustomPropertyCollection: RequestContext = js.native
  
  /**
    * Gets the number of custom properties on this worksheet.
    *
    * [Api set: ExcelApi 1.12]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a custom property object by its key, which is case-insensitive. Throws if the custom property does not exist.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param key The key that identifies the custom property object. It is case-insensitive.
    */
  def getItem(key: String): WorksheetCustomProperty = js.native
  
  /**
    * Gets a custom property object by its key, which is case-insensitive. Returns a null object if the custom property does not exist.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param key The key that identifies the custom property object. It is case-insensitive.
    */
  def getItemOrNullObject(key: String): WorksheetCustomProperty = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[WorksheetCustomProperty] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetCustomPropertyCollection = js.native
  def load(options: WorksheetCustomPropertyCollectionLoadOptions with CollectionLoadOptions): WorksheetCustomPropertyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): WorksheetCustomPropertyCollection = js.native
  def load(propertyNames: String): WorksheetCustomPropertyCollection = js.native
  def load(propertyNames: js.Array[String]): WorksheetCustomPropertyCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.WorksheetCustomPropertyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetCustomPropertyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): WorksheetCustomPropertyCollectionData = js.native
}
