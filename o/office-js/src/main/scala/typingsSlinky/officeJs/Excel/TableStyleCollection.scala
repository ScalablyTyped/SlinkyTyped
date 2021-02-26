package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.CollectionLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.TableStyleCollectionData
import typingsSlinky.officeJs.Excel.Interfaces.TableStyleCollectionLoadOptions
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.ClientResult
import typingsSlinky.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of TableStyles.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait TableStyleCollection extends ClientObject {
  
  /**
    * Creates a blank TableStyle with the specified name.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name The unique name for the new TableStyle. Will throw an invalid argument exception if the name is already in use.
    * @param makeUniqueName Optional, defaults to false. If true, will append numbers to the name in order to make it unique, if needed.
    * @returns The newly created TableStyle.
    */
  def add(name: String): TableStyle = js.native
  def add(name: String, makeUniqueName: Boolean): TableStyle = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableStyleCollection: RequestContext = js.native
  
  /**
    * Gets the number of table styles in the collection.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets the default TableStyle for the parent object's scope.
    *
    * [Api set: ExcelApi 1.10]
    * @returns The TableStyle object that is the current default TableStyle.
    */
  def getDefault(): TableStyle = js.native
  
  /**
    * Gets a TableStyle by name.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name Name of the TableStyle to be retrieved.
    * @returns The TableStyle object whose name matches the input.
    */
  def getItem(name: String): TableStyle = js.native
  
  /**
    * Gets a TableStyle by name. If the TableStyle does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name Name of the TableStyle to be retrieved.
    * @returns The TableStyle object whose name matches the input.
    */
  def getItemOrNullObject(name: String): TableStyle = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableStyle] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableStyleCollection = js.native
  def load(options: TableStyleCollectionLoadOptions with CollectionLoadOptions): TableStyleCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TableStyleCollection = js.native
  def load(propertyNames: String): TableStyleCollection = js.native
  def load(propertyNames: js.Array[String]): TableStyleCollection = js.native
  
  def setDefault(newDefaultStyle: String): Unit = js.native
  /**
    * Sets the default TableStyle for use in the parent object's scope.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param newDefaultStyle The TableStyle object or name of the TableStyle object that should be the new default.
    */
  def setDefault(newDefaultStyle: TableStyle): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TableStyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableStyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableStyleCollectionData = js.native
}
