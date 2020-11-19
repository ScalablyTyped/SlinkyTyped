package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.RangeAreasData
import typingsSlinky.officeJsPreview.Excel.Interfaces.RangeAreasLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.RangeAreasUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.All
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Blanks
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ConditionalFormats
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Constants
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Contents
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DataValidations
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Errors
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ErrorsLogical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ErrorsLogicalNumber
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ErrorsLogicalText
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ErrorsNumberText
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ErrorsNumbers
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ErrorsText
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Formats
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Formulas
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Hyperlinks
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Logical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LogicalNumbers
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LogicalNumbersText
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LogicalText
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Numbers
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NumbersText
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RemoveHyperlinks
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SameConditionalFormat
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SameDataValidation
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Text
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Values
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * RangeAreas represents a collection of one or more rectangular ranges in the same worksheet.
  To learn how to use discontinguous ranges, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-multiple-ranges | Work with multiple ranges simultaneously in Excel add-ins}.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait RangeAreas extends ClientObject {
  
  /**
    *
    * Returns the RangeAreas reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4").
    *
    * [Api set: ExcelApi 1.9]
    */
  val address: String = js.native
  
  /**
    *
    * Returns the RangeAreas reference in the user locale.
    *
    * [Api set: ExcelApi 1.9]
    */
  val addressLocal: String = js.native
  
  /**
    *
    * Returns the number of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  val areaCount: Double = js.native
  
  /**
    *
    * Returns a collection of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  val areas: RangeCollection = js.native
  
  /**
    * Calculates all cells in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  def calculate(): Unit = js.native
  
  /**
    *
    * Returns the number of cells in the RangeAreas object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * [Api set: ExcelApi 1.9]
    */
  val cellCount: Double = js.native
  
  /**
    * Clears values, format, fill, border, etc on each of the areas that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param applyTo Optional. Determines the type of clear action. See Excel.ClearApplyTo for details. Default is "All".
    */
  def clear(): Unit = js.native
  def clear(applyTo: ClearApplyTo): Unit = js.native
  @JSName("clear")
  def clear_All(applyTo: All): Unit = js.native
  @JSName("clear")
  def clear_Contents(applyTo: Contents): Unit = js.native
  @JSName("clear")
  def clear_Formats(applyTo: Formats): Unit = js.native
  @JSName("clear")
  def clear_Hyperlinks(applyTo: Hyperlinks): Unit = js.native
  @JSName("clear")
  def clear_RemoveHyperlinks(applyTo: RemoveHyperlinks): Unit = js.native
  
  /**
    *
    * Returns a collection of ConditionalFormats that intersect with any cells in this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  val conditionalFormats: ConditionalFormatCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeAreas: RequestContext = js.native
  
  /**
    * Converts all cells in the RangeAreas with datatypes into text.
    *
    * [Api set: ExcelApi 1.9]
    */
  def convertDataTypeToText(): Unit = js.native
  
  /**
    * Converts all cells in the RangeAreas into linked datatype.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param serviceID The Service ID which will be used to query the data.
    * @param languageCulture Language Culture to query the service for.
    */
  def convertToLinkedDataType(serviceID: Double, languageCulture: String): Unit = js.native
  
  /**
    * Copies cell data or formatting from the source range or RangeAreas to the current RangeAreas.
    The destination rangeAreas can be a different size than the source range or RangeAreas. The destination will be expanded automatically if it is smaller than the source.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param sourceRange The source range or RangeAreas to copy from. When the source RangeAreas has multiple ranges, their form must able to be created by removing full rows or columns from a rectangular range.
    * @param copyType The type of cell data or formatting to copy over. Default is "All".
    * @param skipBlanks True if to skip blank cells in the source range or RangeAreas. Default is false.
    * @param transpose True if to transpose the cells in the destination RangeAreas. Default is false.
    */
  def copyFrom(
    sourceRange: Range | RangeAreas | String,
    copyType: js.UndefOr[All | Formulas | Values | Formats],
    skipBlanks: js.UndefOr[Boolean],
    transpose: js.UndefOr[Boolean]
  ): Unit = js.native
  def copyFrom(sourceRange: String): Unit = js.native
  def copyFrom(
    sourceRange: String,
    copyType: js.UndefOr[scala.Nothing],
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: String, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType): Unit = js.native
  def copyFrom(
    sourceRange: String,
    copyType: RangeCopyType,
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: String, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  /**
    * Copies cell data or formatting from the source range or RangeAreas to the current RangeAreas.
    The destination rangeAreas can be a different size than the source range or RangeAreas. The destination will be expanded automatically if it is smaller than the source.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param sourceRange The source range or RangeAreas to copy from. When the source RangeAreas has multiple ranges, their form must able to be created by removing full rows or columns from a rectangular range.
    * @param copyType The type of cell data or formatting to copy over. Default is "All".
    * @param skipBlanks True if to skip blank cells in the source range or RangeAreas. Default is false.
    * @param transpose True if to transpose the cells in the destination RangeAreas. Default is false.
    */
  def copyFrom(sourceRange: Range): Unit = js.native
  def copyFrom(sourceRange: RangeAreas): Unit = js.native
  def copyFrom(
    sourceRange: RangeAreas,
    copyType: js.UndefOr[scala.Nothing],
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean): Unit = js.native
  def copyFrom(
    sourceRange: RangeAreas,
    copyType: js.UndefOr[scala.Nothing],
    skipBlanks: Boolean,
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType): Unit = js.native
  def copyFrom(
    sourceRange: RangeAreas,
    copyType: RangeCopyType,
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: RangeAreas, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(
    sourceRange: Range,
    copyType: js.UndefOr[scala.Nothing],
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: js.UndefOr[scala.Nothing], skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType): Unit = js.native
  def copyFrom(
    sourceRange: Range,
    copyType: RangeCopyType,
    skipBlanks: js.UndefOr[scala.Nothing],
    transpose: Boolean
  ): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: Boolean): Unit = js.native
  def copyFrom(sourceRange: Range, copyType: RangeCopyType, skipBlanks: Boolean, transpose: Boolean): Unit = js.native
  
  /**
    *
    * Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  val dataValidation: DataValidation = js.native
  
  /**
    *
    * Returns a RangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  val format: RangeFormat = js.native
  
  /**
    * Returns a RangeAreas object that represents the entire columns of the RangeAreas (for example, if the current RangeAreas represents cells "B4:E11, H2", it returns a RangeAreas that represents columns "B:E, H:H").
    *
    * [Api set: ExcelApi 1.9]
    */
  def getEntireColumn(): RangeAreas = js.native
  
  /**
    * Returns a RangeAreas object that represents the entire rows of the RangeAreas (for example, if the current RangeAreas represents cells "B4:E11", it returns a RangeAreas that represents rows "4:11").
    *
    * [Api set: ExcelApi 1.9]
    */
  def getEntireRow(): RangeAreas = js.native
  
  def getIntersection(anotherRange: String): RangeAreas = js.native
  /**
    * Returns the RangeAreas object that represents the intersection of the given ranges or RangeAreas. If no intersection is found, an ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param anotherRange The range, RangeAreas object or range address that will be used to determine the intersection.
    */
  def getIntersection(anotherRange: Range): RangeAreas = js.native
  def getIntersection(anotherRange: RangeAreas): RangeAreas = js.native
  
  def getIntersectionOrNullObject(anotherRange: String): RangeAreas = js.native
  /**
    * Returns the RangeAreas object that represents the intersection of the given ranges or RangeAreas. If no intersection is found, a null object is returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param anotherRange The range, RangeAreas, or address that will be used to determine the intersection.
    */
  def getIntersectionOrNullObject(anotherRange: Range): RangeAreas = js.native
  def getIntersectionOrNullObject(anotherRange: RangeAreas): RangeAreas = js.native
  
  /**
    * Returns an RangeAreas object that is shifted by the specific row and column offset. The dimension of the returned RangeAreas will match the original object. If the resulting RangeAreas is forced outside the bounds of the worksheet grid, an error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param rowOffset The number of rows (positive, negative, or 0) by which the RangeAreas is to be offset. Positive values are offset downward, and negative values are offset upward.
    * @param columnOffset The number of columns (positive, negative, or 0) by which the RangeAreas is to be offset. Positive values are offset to the right, and negative values are offset to the left.
    */
  def getOffsetRangeAreas(rowOffset: Double, columnOffset: Double): RangeAreas = js.native
  
  /**
    * Returns a RangeAreas object that represents all the cells that match the specified type and value. Throws an error if no special cells are found that match the criteria.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCells(
    cellType: ConditionalFormats | DataValidations | Blanks | Constants | Formulas | SameConditionalFormat | SameDataValidation | Visible,
    cellValueType: js.UndefOr[
      All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
    ]
  ): RangeAreas = js.native
  /**
    * Returns a RangeAreas object that represents all the cells that match the specified type and value. Throws an error if no special cells are found that match the criteria.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCells(cellType: SpecialCellType): RangeAreas = js.native
  def getSpecialCells(cellType: SpecialCellType, cellValueType: SpecialCellValueType): RangeAreas = js.native
  
  /**
    * Returns a RangeAreas object that represents all the cells that match the specified type and value. Returns a null object if no special cells are found that match the criteria.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCellsOrNullObject(
    cellType: ConditionalFormats | DataValidations | Blanks | Constants | Formulas | SameConditionalFormat | SameDataValidation | Visible,
    cellValueType: js.UndefOr[
      All | Errors | ErrorsLogical | ErrorsNumbers | ErrorsText | ErrorsLogicalNumber | ErrorsLogicalText | ErrorsNumberText | Logical | LogicalNumbers | LogicalText | LogicalNumbersText | Numbers | NumbersText | Text
    ]
  ): RangeAreas = js.native
  /**
    * Returns a RangeAreas object that represents all the cells that match the specified type and value. Returns a null object if no special cells are found that match the criteria.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cellType The type of cells to include.
    * @param cellValueType If cellType is either Constants or Formulas, this argument is used to determine which types of cells to include in the result. These values can be combined together to return more than one type. The default is to select all constants or formulas, no matter what the type.
    */
  def getSpecialCellsOrNullObject(cellType: SpecialCellType): RangeAreas = js.native
  def getSpecialCellsOrNullObject(cellType: SpecialCellType, cellValueType: SpecialCellValueType): RangeAreas = js.native
  
  /**
    * Returns a scoped collection of tables that overlap with any range in this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param fullyContained If true, returns only tables that are fully contained within the range bounds. Default is false.
    */
  def getTables(): TableScopedCollection = js.native
  def getTables(fullyContained: Boolean): TableScopedCollection = js.native
  
  /**
    * Returns the used RangeAreas that comprises all the used areas of individual rectangular ranges in the RangeAreas object.
    If there are no used cells within the RangeAreas, the ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param valuesOnly Whether to only consider cells with values as used cells. Default is false.
    */
  def getUsedRangeAreas(): RangeAreas = js.native
  def getUsedRangeAreas(valuesOnly: Boolean): RangeAreas = js.native
  
  /**
    * Returns the used RangeAreas that comprises all the used areas of individual rectangular ranges in the RangeAreas object.
    If there are no used cells within the RangeAreas, a null object will be returned.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param valuesOnly Whether to only consider cells with values as used cells.
    */
  def getUsedRangeAreasOrNullObject(): RangeAreas = js.native
  def getUsedRangeAreasOrNullObject(valuesOnly: Boolean): RangeAreas = js.native
  
  /**
    *
    * Specifies if all the ranges on this RangeAreas object represent entire columns (e.g., "A:C, Q:Z").
    *
    * [Api set: ExcelApi 1.9]
    */
  val isEntireColumn: Boolean = js.native
  
  /**
    *
    * Specifies if all the ranges on this RangeAreas object represent entire rows (e.g., "1:3, 5:7").
    *
    * [Api set: ExcelApi 1.9]
    */
  val isEntireRow: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeAreas = js.native
  def load(options: RangeAreasLoadOptions): RangeAreas = js.native
  def load(propertyNamesAndPaths: Expand): RangeAreas = js.native
  def load(propertyNames: String): RangeAreas = js.native
  def load(propertyNames: js.Array[String]): RangeAreas = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeAreas): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeAreasUpdateData): Unit = js.native
  def set(properties: RangeAreasUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeAreas): Unit = js.native
  
  /**
    * Sets the RangeAreas to be recalculated when the next recalculation occurs.
    *
    * [Api set: ExcelApi 1.9]
    */
  def setDirty(): Unit = js.native
  
  /**
    *
    * Represents the style for all ranges in this RangeAreas object.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeAreas object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeAreasData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeAreasData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): RangeAreas = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): RangeAreas = js.native
  
  /**
    *
    * Returns the worksheet for the current RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  val worksheet: Worksheet = js.native
}
