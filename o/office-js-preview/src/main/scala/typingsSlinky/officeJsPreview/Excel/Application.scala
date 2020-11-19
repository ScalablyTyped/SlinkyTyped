package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.ApplicationData
import typingsSlinky.officeJsPreview.Excel.Interfaces.ApplicationLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.ApplicationUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AutomaticExceptTables
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Calculating
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Done
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Full
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FullRebuild
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Manual
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Pending
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Recalculate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Excel application that manages the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait Application extends ClientObject {
  
  /**
    * Recalculate all currently opened workbooks in Excel.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param calculationType Specifies the calculation type to use. See Excel.CalculationType for details.
    */
  def calculate(calculationType: CalculationType): Unit = js.native
  @JSName("calculate")
  def calculate_Full(calculationType: Full): Unit = js.native
  @JSName("calculate")
  def calculate_FullRebuild(calculationType: FullRebuild): Unit = js.native
  /**
    * Recalculate all currently opened workbooks in Excel.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param calculationType Specifies the calculation type to use. See Excel.CalculationType for details.
    */
  @JSName("calculate")
  def calculate_Recalculate(calculationType: Recalculate): Unit = js.native
  
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation.
    *
    * [Api set: ExcelApi 1.9]
    */
  val calculationEngineVersion: Double = js.native
  
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: CalculationMode | Automatic | AutomaticExceptTables | Manual = js.native
  
  /**
    *
    * Returns the calculation state of the application. See Excel.CalculationState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  val calculationState: CalculationState | Done | Calculating | Pending = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Application: RequestContext = js.native
  
  /**
    *
    * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  val cultureInfo: CultureInfo = js.native
  
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  val decimalSeparator: String = js.native
  
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  val iterativeCalculation: IterativeCalculation = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Application = js.native
  def load(options: ApplicationLoadOptions): Application = js.native
  def load(propertyNamesAndPaths: Expand): Application = js.native
  def load(propertyNames: String): Application = js.native
  def load(propertyNames: js.Array[String]): Application = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Application): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Application): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ApplicationUpdateData): Unit = js.native
  def set(properties: ApplicationUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Suspends calculation until the next "context.sync()" is called. Once set, it is the developer's responsibility to re-calc the workbook, to ensure that any dependencies are propagated.
    *
    * [Api set: ExcelApi 1.6]
    */
  def suspendApiCalculationUntilNextSync(): Unit = js.native
  
  /**
    * Suspends screen updating until the next `context.sync()` is called.
    
    **Note**: Don't call `suspendScreenUpdatingUntilNextSync` repeatedly (such as in a loop). Repeated calls will cause the Excel window to flicker.
    *
    * [Api set: ExcelApi 1.9]
    */
  def suspendScreenUpdatingUntilNextSync(): Unit = js.native
  
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  val thousandsSeparator: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ApplicationData = js.native
  
  /**
    *
    * Specifies if the system separators of Excel are enabled.
    System separators include the decimal separator and thousands separator.
    *
    * [Api set: ExcelApi 1.11]
    */
  val useSystemSeparators: Boolean = js.native
}
