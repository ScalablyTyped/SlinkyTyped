package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.PivotTableStyleData
import typingsSlinky.officeJs.Excel.Interfaces.PivotTableStyleLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.PivotTableStyleUpdateData
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.UpdateOptions
import typingsSlinky.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a PivotTable Style, which defines style elements by PivotTable region.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait PivotTableStyle extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotTableStyle: RequestContext = js.native
  
  /**
    * Deletes the PivotTableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  def delete(): Unit = js.native
  
  /**
    * Creates a duplicate of this PivotTableStyle with copies of all the style elements.
    *
    * [Api set: ExcelApi 1.10]
    * @returns The new PivotTableStyle object that has been duplicated from this PivotTableStyle.
    */
  def duplicate(): PivotTableStyle = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotTableStyle = js.native
  def load(options: PivotTableStyleLoadOptions): PivotTableStyle = js.native
  def load(propertyNamesAndPaths: Expand): PivotTableStyle = js.native
  def load(propertyNames: String): PivotTableStyle = js.native
  def load(propertyNames: js.Array[String]): PivotTableStyle = js.native
  
  /**
    *
    * Gets the name of the PivotTableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: String = js.native
  
  /**
    *
    * Specifies if this PivotTableStyle object is read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  val readOnly: Boolean = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.PivotTableStyle): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PivotTableStyleUpdateData): Unit = js.native
  def set(properties: PivotTableStyleUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotTableStyle): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PivotTableStyle object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotTableStyleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PivotTableStyleData = js.native
}
