package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.NumberFormatInfoData
import typingsSlinky.officeJs.Excel.Interfaces.NumberFormatInfoLoadOptions
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * [Api set: ExcelApi 1.11]
  */
@js.native
trait NumberFormatInfo extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NumberFormatInfo: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NumberFormatInfo = js.native
  def load(options: NumberFormatInfoLoadOptions): NumberFormatInfo = js.native
  def load(propertyNamesAndPaths: Expand): NumberFormatInfo = js.native
  def load(propertyNames: String): NumberFormatInfo = js.native
  def load(propertyNames: js.Array[String]): NumberFormatInfo = js.native
  
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  val numberDecimalSeparator: String = js.native
  
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  val numberGroupSeparator: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.NumberFormatInfo object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.NumberFormatInfoData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NumberFormatInfoData = js.native
}
