package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.NamedItemData
import typingsSlinky.officeJsPreview.Excel.Interfaces.NamedItemLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.NamedItemUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Array
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Boolean
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Double
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Error
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a defined name for a range of cells or value. Names can be primitive named objects (as seen in the type below), range object, or a reference to a range. This object can be used to obtain range object associated with names.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait NamedItem extends ClientObject {
  
  /**
    *
    * Returns an object containing values and types of the named item.
    *
    * [Api set: ExcelApi 1.7]
    */
  val arrayValues: NamedItemArrayValues = js.native
  
  /**
    *
    * Specifies the comment associated with this name.
    *
    * [Api set: ExcelApi 1.4]
    */
  var comment: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NamedItem: RequestContext = js.native
  
  /**
    * Deletes the given name.
    *
    * [Api set: ExcelApi 1.4]
    */
  def delete(): Unit = js.native
  
  /**
    *
    * The formula of the named item. Formula always starts with a '=' sign.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.Any = js.native
  
  /**
    * Returns the range object that is associated with the name. Throws an error if the named item's type is not a range.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  
  /**
    * Returns the range object that is associated with the name. Returns a null object if the named item's type is not a range.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getRangeOrNullObject(): Range = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NamedItem = js.native
  def load(options: NamedItemLoadOptions): NamedItem = js.native
  def load(propertyNamesAndPaths: Expand): NamedItem = js.native
  def load(propertyNames: String): NamedItem = js.native
  def load(propertyNames: js.Array[String]): NamedItem = js.native
  
  /**
    *
    * The name of the object.
    *
    * [Api set: ExcelApi 1.1]
    */
  val name: String = js.native
  
  /**
    *
    * Specifies if the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook.
    *
    * [Api set: ExcelApi 1.4]
    */
  val scope: NamedItemScope | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Worksheet | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Workbook = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.NamedItem): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: NamedItemUpdateData): Unit = js.native
  def set(properties: NamedItemUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: NamedItem): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.NamedItem object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.NamedItemData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NamedItemData = js.native
  
  /**
    *
    * Specifies the type of the value returned by the name's formula. See Excel.NamedItemType for details.
    *
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  val `type`: NamedItemType | typingsSlinky.officeJsPreview.officeJsPreviewStrings.String | Integer | Double | Boolean | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Range | Error | Array = js.native
  
  /**
    *
    * Represents the value computed by the name's formula. For a named range, will return the range address.
    *
    * [Api set: ExcelApi 1.1]
    */
  val value: js.Any = js.native
  
  /**
    *
    * Specifies if the object is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: scala.Boolean = js.native
  
  /**
    *
    * Returns the worksheet on which the named item is scoped to. Throws an error if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  val worksheet: Worksheet = js.native
  
  /**
    *
    * Returns the worksheet on which the named item is scoped to. Returns a null object if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  val worksheetOrNullObject: Worksheet = js.native
}
