package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.RangeFillData
import typingsSlinky.officeJsPreview.Excel.Interfaces.RangeFillLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.RangeFillUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Checker
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.CrissCross
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Down
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray16
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray25
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray50
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray75
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray8
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Grid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Horizontal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LightDown
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LightHorizontal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LightUp
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LightVertical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LinearGradient
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RectangularGradient
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SemiGray75
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Solid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Up
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the background of a range object.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait RangeFill extends ClientObject {
  
  /**
    * Resets the range background.
    *
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeFill: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeFill = js.native
  def load(options: RangeFillLoadOptions): RangeFill = js.native
  def load(propertyNamesAndPaths: Expand): RangeFill = js.native
  def load(propertyNames: String): RangeFill = js.native
  def load(propertyNames: js.Array[String]): RangeFill = js.native
  
  /**
    *
    * The pattern of a range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = js.native
  
  /**
    *
    * The HTML color code representing the color of the range pattern, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: String = js.native
  
  /**
    *
    * Specifies a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: Double = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeFill): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeFillUpdateData): Unit = js.native
  def set(properties: RangeFillUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFill): Unit = js.native
  
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Fill. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeFillData = js.native
}
