package typingsSlinky.officeJsPreview.Word

import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.ClientResult
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.Word.Interfaces.TableRowData
import typingsSlinky.officeJsPreview.Word.Interfaces.TableRowLoadOptions
import typingsSlinky.officeJsPreview.Word.Interfaces.TableRowUpdateData
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.anon.IgnorePunct
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.After
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.All
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Before
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Center
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Centered
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.End
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Inside
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideHorizontal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideVertical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Justified
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Left
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Mixed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Outside
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Replace
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Right
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Select
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Start
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Top
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a row in a Word document.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait TableRow extends ClientObject {
  
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val cellCount: Double = js.native
  
  /**
    *
    * Gets cells. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val cells: TableCellCollection = js.native
  
  /**
    * Clears the contents of the row.
    *
    * [Api set: WordApi 1.3]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableRow: RequestContext = js.native
  
  /**
    * Deletes the entire row.
    *
    * [Api set: WordApi 1.3]
    */
  def delete(): Unit = js.native
  
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val font: Font = js.native
  
  /**
    * Gets the border style of the cells in the row.
    *
    * [Api set: WordApi 1.3]
    *
    * @param borderLocation Required. The border location.
    */
  def getBorder(borderLocation: BorderLocation): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_All(borderLocation: All): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Bottom(borderLocation: Bottom): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Inside(borderLocation: Inside): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_InsideHorizontal(borderLocation: InsideHorizontal): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_InsideVertical(borderLocation: InsideVertical): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Left(borderLocation: Left): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Outside(borderLocation: Outside): TableBorder = js.native
  @JSName("getBorder")
  def getBorder_Right(borderLocation: Right): TableBorder = js.native
  /**
    * Gets the border style of the cells in the row.
    *
    * [Api set: WordApi 1.3]
    *
    * @param borderLocation Required. The border location.
    */
  @JSName("getBorder")
  def getBorder_Top(borderLocation: Top): TableBorder = js.native
  
  /**
    * Gets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    */
  def getCellPadding(cellPaddingLocation: CellPaddingLocation): ClientResult[Double] = js.native
  @JSName("getCellPadding")
  def getCellPadding_Bottom(cellPaddingLocation: Bottom): ClientResult[Double] = js.native
  @JSName("getCellPadding")
  def getCellPadding_Left(cellPaddingLocation: Left): ClientResult[Double] = js.native
  @JSName("getCellPadding")
  def getCellPadding_Right(cellPaddingLocation: Right): ClientResult[Double] = js.native
  /**
    * Gets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    */
  @JSName("getCellPadding")
  def getCellPadding_Top(cellPaddingLocation: Top): ClientResult[Double] = js.native
  
  /**
    * Gets the next row. Throws an error if this row is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNext(): TableRow = js.native
  
  /**
    * Gets the next row. Returns a null object if this row is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): TableRow = js.native
  
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /**
    * Inserts a content control on the row.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def insertContentControl(): ContentControl = js.native
  
  /**
    * Inserts rows using this row as a template. If values are specified, inserts the values into the new rows.
    *
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. Where the new rows should be inserted, relative to the current row. It can be 'Before' or 'After'.
    * @param rowCount Required. Number of rows to add
    * @param values Optional. Strings to insert in the new rows, specified as a 2D array. The number of cells in each row must not exceed the number of cells in the existing row.
    */
  def insertRows(insertLocation: InsertLocation, rowCount: Double): TableRowCollection = js.native
  def insertRows(insertLocation: InsertLocation, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_After(insertLocation: After, rowCount: Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_After(insertLocation: After, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  /**
    * Inserts rows using this row as a template. If values are specified, inserts the values into the new rows.
    *
    * [Api set: WordApi 1.3]
    *
    * @param insertLocation Required. Where the new rows should be inserted, relative to the current row. It can be 'Before' or 'After'.
    * @param rowCount Required. Number of rows to add
    * @param values Optional. Strings to insert in the new rows, specified as a 2D array. The number of cells in each row must not exceed the number of cells in the existing row.
    */
  @JSName("insertRows")
  def insertRows_Before(insertLocation: Before, rowCount: Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Before(insertLocation: Before, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_End(insertLocation: End, rowCount: Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_End(insertLocation: End, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Replace(insertLocation: Replace, rowCount: Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Replace(insertLocation: Replace, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Start(insertLocation: Start, rowCount: Double): TableRowCollection = js.native
  @JSName("insertRows")
  def insertRows_Start(insertLocation: Start, rowCount: Double, values: js.Array[js.Array[String]]): TableRowCollection = js.native
  
  /**
    *
    * Checks whether the row is a header row. Read-only. To set the number of header rows, use HeaderRowCount on the Table object.
    *
    * [Api set: WordApi 1.3]
    */
  val isHeader: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableRow = js.native
  def load(options: TableRowLoadOptions): TableRow = js.native
  def load(propertyNamesAndPaths: Expand): TableRow = js.native
  def load(propertyNames: String): TableRow = js.native
  def load(propertyNames: js.Array[String]): TableRow = js.native
  
  /**
    * Merges the row into one cell.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def merge(): TableCell = js.native
  
  /**
    *
    * Gets parent table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    *
    * Gets and sets the preferred height of the row in points.
    *
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: Double = js.native
  
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val rowIndex: Double = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the row. The search results are a collection of range objects.
    *
    * [Api set: WordApi 1.3]
    *
    * @param searchText Required. The search text.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: String): RangeCollection = js.native
  def search(searchText: String, searchOptions: SearchOptions): RangeCollection = js.native
  def search(searchText: String, searchOptions: IgnorePunct): RangeCollection = js.native
  
  /**
    * Selects the row and navigates the Word UI to it.
    *
    * [Api set: WordApi 1.3]
    *
    * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): Unit = js.native
  def select(selectionMode: SelectionMode): Unit = js.native
  @JSName("select")
  def select_End(selectionMode: End): Unit = js.native
  @JSName("select")
  def select_Select(selectionMode: Select): Unit = js.native
  @JSName("select")
  def select_Start(selectionMode: Start): Unit = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.TableRow): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableRowUpdateData): Unit = js.native
  def set(properties: TableRowUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableRow): Unit = js.native
  
  /**
    * Sets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    * @param cellPadding Required. The cell padding.
    */
  def setCellPadding(cellPaddingLocation: CellPaddingLocation, cellPadding: Double): Unit = js.native
  @JSName("setCellPadding")
  def setCellPadding_Bottom(cellPaddingLocation: Bottom, cellPadding: Double): Unit = js.native
  @JSName("setCellPadding")
  def setCellPadding_Left(cellPaddingLocation: Left, cellPadding: Double): Unit = js.native
  @JSName("setCellPadding")
  def setCellPadding_Right(cellPaddingLocation: Right, cellPadding: Double): Unit = js.native
  /**
    * Sets cell padding in points.
    *
    * [Api set: WordApi 1.3]
    *
    * @param cellPaddingLocation Required. The cell padding location can be 'Top', 'Left', 'Bottom', or 'Right'.
    * @param cellPadding Required. The cell padding.
    */
  @JSName("setCellPadding")
  def setCellPadding_Top(cellPaddingLocation: Top, cellPadding: Double): Unit = js.native
  
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.TableRow object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.TableRowData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableRowData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): TableRow = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): TableRow = js.native
  
  /**
    *
    * Gets and sets the text values in the row, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.Array[js.Array[String]] = js.native
  
  /**
    *
    * Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: VerticalAlignment | Mixed | Top | Center | Bottom = js.native
}
