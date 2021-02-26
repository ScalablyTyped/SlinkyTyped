package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.TopBottomConditionalFormatData
import typingsSlinky.officeJsPreview.Excel.Interfaces.TopBottomConditionalFormatLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.TopBottomConditionalFormatUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a Top/Bottom conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait TopBottomConditionalFormat extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TopBottomConditionalFormat: RequestContext = js.native
  
  /**
    *
    * Returns a format object, encapsulating the conditional format's font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  val format: ConditionalRangeFormat = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TopBottomConditionalFormat = js.native
  def load(options: TopBottomConditionalFormatLoadOptions): TopBottomConditionalFormat = js.native
  def load(propertyNamesAndPaths: Expand): TopBottomConditionalFormat = js.native
  def load(propertyNames: String): TopBottomConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): TopBottomConditionalFormat = js.native
  
  /**
    *
    * The criteria of the Top/Bottom conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: ConditionalTopBottomRule = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TopBottomConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TopBottomConditionalFormatUpdateData): Unit = js.native
  def set(properties: TopBottomConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TopBottomConditionalFormat): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TopBottomConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TopBottomConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TopBottomConditionalFormatData = js.native
}
