package typingsSlinky.officeJsPreview.Word

import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.Word.Interfaces.FontData
import typingsSlinky.officeJsPreview.Word.Interfaces.FontLoadOptions
import typingsSlinky.officeJsPreview.Word.Interfaces.FontUpdateData
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashLine
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashLineHeavy
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashLineLong
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashLineLongHeavy
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DotDashLine
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DotDashLineHeavy
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DotLine
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dotted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DottedHeavy
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Hidden
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Mixed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Single
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Thick
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TwoDotDashLine
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TwoDotDashLineHeavy
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Wave
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.WaveDouble
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.WaveHeavy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a font.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait Font extends ClientObject {
  
  /**
    *
    * Gets or sets a value that indicates whether the font is bold. True if the font is formatted as bold, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var bold: Boolean = js.native
  
  /**
    *
    * Gets or sets the color for the specified font. You can provide the value in the '#RRGGBB' format or the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Font: RequestContext = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font has a double strikethrough. True if the font is formatted as double strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var doubleStrikeThrough: Boolean = js.native
  
  /**
    *
    * Gets or sets the highlight color. To set it, use a value either in the '#RRGGBB' format or the color name. To remove highlight color, set it to null. The returned highlight color can be in the '#RRGGBB' format, an empty string for mixed highlight colors, or null for no highlight color.
    **Note**: Only the default highlight colors are available in Office for Windows Desktop. These are "Yellow", "Lime", "Turquoise", "Pink", "Blue", "Red", "DarkBlue", "Teal", "Green", "Purple", "DarkRed", "Olive", "Gray", "LightGray", and "Black". When the add-in runs in Office for Windows Desktop, any other color is converted to the closest color when applied to the font.
    *
    * [Api set: WordApi 1.1]
    */
  var highlightColor: String = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font is italicized. True if the font is italicized, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var italic: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Font = js.native
  def load(options: FontLoadOptions): Font = js.native
  def load(propertyNamesAndPaths: Expand): Font = js.native
  def load(propertyNames: String): Font = js.native
  def load(propertyNames: js.Array[String]): Font = js.native
  
  /**
    *
    * Gets or sets a value that represents the name of the font.
    *
    * [Api set: WordApi 1.1]
    */
  var name: String = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Font): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.Font): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: FontUpdateData): Unit = js.native
  def set(properties: FontUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * Gets or sets a value that represents the font size in points.
    *
    * [Api set: WordApi 1.1]
    */
  var size: Double = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font has a strikethrough. True if the font is formatted as strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var strikeThrough: Boolean = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font is a subscript. True if the font is formatted as subscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var subscript: Boolean = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the font is a superscript. True if the font is formatted as superscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var superscript: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Font object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.FontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): FontData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Font = js.native
  
  /**
    *
    * Gets or sets a value that indicates the font's underline type. 'None' if the font is not underlined.
    *
    * [Api set: WordApi 1.1]
    */
  var underline: UnderlineType | Mixed | None | Hidden | DotLine | Single | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Word | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Font = js.native
}
