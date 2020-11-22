package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.WorksheetCustomPropertyData
import typingsSlinky.officeJsPreview.Excel.Interfaces.WorksheetCustomPropertyLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.WorksheetCustomPropertyUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a worksheet-level custom property.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait WorksheetCustomProperty extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetCustomProperty: RequestContext = js.native
  
  /**
    * Deletes the custom property.
    *
    * [Api set: ExcelApi 1.12]
    */
  def delete(): Unit = js.native
  
  /**
    *
    * Gets the key of the custom property. Custom property keys are case-insensitive. The key is limited to 255 characters (larger values will cause an "InvalidArgument" error to be thrown.)
    *
    * [Api set: ExcelApi 1.12]
    */
  val key: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetCustomProperty = js.native
  def load(options: WorksheetCustomPropertyLoadOptions): WorksheetCustomProperty = js.native
  def load(propertyNamesAndPaths: Expand): WorksheetCustomProperty = js.native
  def load(propertyNames: String): WorksheetCustomProperty = js.native
  def load(propertyNames: js.Array[String]): WorksheetCustomProperty = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.WorksheetCustomProperty): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: WorksheetCustomPropertyUpdateData): Unit = js.native
  def set(properties: WorksheetCustomPropertyUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: WorksheetCustomProperty): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.WorksheetCustomProperty object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetCustomPropertyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): WorksheetCustomPropertyData = js.native
  
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.12]
    */
  var value: String = js.native
}
