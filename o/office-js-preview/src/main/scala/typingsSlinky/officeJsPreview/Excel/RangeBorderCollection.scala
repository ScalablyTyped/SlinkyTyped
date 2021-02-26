package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.RangeBorderCollectionData
import typingsSlinky.officeJsPreview.Excel.Interfaces.RangeBorderCollectionLoadOptions
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.LoadOption
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DiagonalDown
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DiagonalUp
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeTop
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideHorizontal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideVertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the border objects that make up the range border.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait RangeBorderCollection extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeBorderCollection: RequestContext = js.native
  
  /**
    *
    * Number of border objects in the collection.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Gets a border object using its name.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
    */
  def getItem(index: BorderIndex): RangeBorder = js.native
  
  /**
    * Gets a border object using its index.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): RangeBorder = js.native
  
  @JSName("getItem")
  def getItem_DiagonalDown(index: DiagonalDown): RangeBorder = js.native
  @JSName("getItem")
  def getItem_DiagonalUp(index: DiagonalUp): RangeBorder = js.native
  @JSName("getItem")
  def getItem_EdgeBottom(index: EdgeBottom): RangeBorder = js.native
  @JSName("getItem")
  def getItem_EdgeLeft(index: EdgeLeft): RangeBorder = js.native
  @JSName("getItem")
  def getItem_EdgeRight(index: EdgeRight): RangeBorder = js.native
  /**
    * Gets a border object using its name.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the border object to be retrieved. See Excel.BorderIndex for details.
    */
  @JSName("getItem")
  def getItem_EdgeTop(index: EdgeTop): RangeBorder = js.native
  @JSName("getItem")
  def getItem_InsideHorizontal(index: InsideHorizontal): RangeBorder = js.native
  @JSName("getItem")
  def getItem_InsideVertical(index: InsideVertical): RangeBorder = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[RangeBorder] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeBorderCollection = js.native
  def load(options: RangeBorderCollectionLoadOptions with CollectionLoadOptions): RangeBorderCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): RangeBorderCollection = js.native
  def load(propertyNames: String): RangeBorderCollection = js.native
  def load(propertyNames: js.Array[String]): RangeBorderCollection = js.native
  
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Borders, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the entire border collections don't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RangeBorderCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeBorderCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): RangeBorderCollectionData = js.native
}
