package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.Excel.Interfaces.DataPivotHierarchyData
import typingsSlinky.officeJs.Excel.Interfaces.DataPivotHierarchyLoadOptions
import typingsSlinky.officeJs.Excel.Interfaces.DataPivotHierarchyUpdateData
import typingsSlinky.officeJs.OfficeExtension.ClientObject
import typingsSlinky.officeJs.OfficeExtension.UpdateOptions
import typingsSlinky.officeJs.anon.Expand
import typingsSlinky.officeJs.officeJsStrings.Automatic
import typingsSlinky.officeJs.officeJsStrings.Average
import typingsSlinky.officeJs.officeJsStrings.Count
import typingsSlinky.officeJs.officeJsStrings.CountNumbers
import typingsSlinky.officeJs.officeJsStrings.Max
import typingsSlinky.officeJs.officeJsStrings.Min
import typingsSlinky.officeJs.officeJsStrings.Product
import typingsSlinky.officeJs.officeJsStrings.StandardDeviation
import typingsSlinky.officeJs.officeJsStrings.StandardDeviationP
import typingsSlinky.officeJs.officeJsStrings.Sum
import typingsSlinky.officeJs.officeJsStrings.Unknown_
import typingsSlinky.officeJs.officeJsStrings.Variance
import typingsSlinky.officeJs.officeJsStrings.VarianceP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Excel DataPivotHierarchy.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DataPivotHierarchy extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DataPivotHierarchy: RequestContext = js.native
  
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  val field: PivotField = js.native
  
  /**
    *
    * Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DataPivotHierarchy = js.native
  def load(options: DataPivotHierarchyLoadOptions): DataPivotHierarchy = js.native
  def load(propertyNamesAndPaths: Expand): DataPivotHierarchy = js.native
  def load(propertyNames: String): DataPivotHierarchy = js.native
  def load(propertyNames: js.Array[String]): DataPivotHierarchy = js.native
  
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: String = js.native
  
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: String = js.native
  
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: Double = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DataPivotHierarchy): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.DataPivotHierarchy): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DataPivotHierarchyUpdateData): Unit = js.native
  def set(properties: DataPivotHierarchyUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Reset the DataPivotHierarchy back to its default values.
    *
    * [Api set: ExcelApi 1.8]
    */
  def setToDefault(): Unit = js.native
  
  /**
    *
    * Specifies if the data should be shown as a specific summary calculation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: ShowAsRule = js.native
  
  /**
    *
    * Specifies if all items of the DataPivotHierarchy are shown.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DataPivotHierarchy object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DataPivotHierarchyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DataPivotHierarchyData = js.native
}
