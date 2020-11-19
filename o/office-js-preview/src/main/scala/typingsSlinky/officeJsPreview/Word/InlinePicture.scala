package typingsSlinky.officeJsPreview.Word

import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.ClientResult
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.Word.Interfaces.InlinePictureData
import typingsSlinky.officeJsPreview.Word.Interfaces.InlinePictureLoadOptions
import typingsSlinky.officeJsPreview.Word.Interfaces.InlinePictureUpdateData
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.After
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Before
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Bmp_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Content
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Emf
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.End
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Exif
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gif_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Icon
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Jpeg_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Line
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Next
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Page
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Pdf
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Pict
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Png_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Replace
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SectionContinuous
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SectionEven
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SectionNext
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SectionOdd
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Select
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Start
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Svg_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Tiff
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Undefined
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unsupported
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Whole
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Wmf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an inline picture.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait InlinePicture extends ClientObject {
  
  /**
    *
    * Gets or sets a string that represents the alternative text associated with the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: String = js.native
  
  /**
    *
    * Gets or sets a string that contains the title for the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InlinePicture: RequestContext = js.native
  
  /**
    * Deletes the inline picture from the document.
    *
    * [Api set: WordApi 1.2]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the base64 encoded string representation of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  def getBase64ImageSrc(): ClientResult[String] = js.native
  
  /**
    * Gets the next inline image. Throws an error if this inline image is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNext(): InlinePicture = js.native
  
  /**
    * Gets the next inline image. Returns a null object if this inline image is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): InlinePicture = js.native
  
  /**
    * Gets the picture, or the starting or ending point of the picture, as a range.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location can be 'Whole', 'Start', or 'End'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: RangeLocation): Range = js.native
  @JSName("getRange")
  def getRange_After(rangeLocation: After): Range = js.native
  @JSName("getRange")
  def getRange_Before(rangeLocation: Before): Range = js.native
  @JSName("getRange")
  def getRange_Content(rangeLocation: Content): Range = js.native
  @JSName("getRange")
  def getRange_End(rangeLocation: End): Range = js.native
  @JSName("getRange")
  def getRange_Start(rangeLocation: Start): Range = js.native
  @JSName("getRange")
  def getRange_Whole(rangeLocation: Whole): Range = js.native
  
  /**
    *
    * Gets or sets a number that describes the height of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var height: Double = js.native
  
  /**
    *
    * Gets or sets a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.1]
    */
  var hyperlink: String = js.native
  
  /**
    *
    * Gets the format of the inline image. Read-only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val imageFormat: ImageFormat | Unsupported | Undefined | Bmp_ | Jpeg_ | Gif_ | Tiff | Png_ | Icon | Exif | Wmf | Emf | Pict | Pdf | Svg_ = js.native
  
  /**
    * Inserts a break at the specified location in the main document.
    *
    * [Api set: WordApi 1.2]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: InsertLocation): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: After): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: End): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: After): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: End): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: Page, insertLocation: After): Unit = js.native
  /**
    * Inserts a break at the specified location in the main document.
    *
    * [Api set: WordApi 1.2]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(breakType: Page, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: Page, insertLocation: End): Unit = js.native
  def insertBreak(breakType: Page, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: Page, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: After): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: End): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: After): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: End): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: After): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: End): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: After): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: End): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: Start): Unit = js.native
  
  /**
    * Wraps the inline picture with a rich text content control.
    *
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  
  /**
    * Inserts a document at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertFileFromBase64(base64File: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_After(base64File: String, insertLocation: After): Range = js.native
  /**
    * Inserts a document at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Before(base64File: String, insertLocation: Before): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_End(base64File: String, insertLocation: End): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Replace(base64File: String, insertLocation: Replace): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Start(base64File: String, insertLocation: Start): Range = js.native
  
  /**
    * Inserts HTML at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertHtml(html: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertHtml")
  def insertHtml_After(html: String, insertLocation: After): Range = js.native
  /**
    * Inserts HTML at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertHtml")
  def insertHtml_Before(html: String, insertLocation: Before): Range = js.native
  @JSName("insertHtml")
  def insertHtml_End(html: String, insertLocation: End): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Replace(html: String, insertLocation: Replace): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Start(html: String, insertLocation: Start): Range = js.native
  
  /**
    * Inserts an inline picture at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Before', or 'After'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: InsertLocation): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_After(base64EncodedImage: String, insertLocation: After): InlinePicture = js.native
  /**
    * Inserts an inline picture at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Before', or 'After'.
    */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Before(base64EncodedImage: String, insertLocation: Before): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_End(base64EncodedImage: String, insertLocation: End): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Replace(base64EncodedImage: String, insertLocation: Replace): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Start(base64EncodedImage: String, insertLocation: Start): InlinePicture = js.native
  
  /**
    * Inserts OOXML at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertOoxml(ooxml: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_After(ooxml: String, insertLocation: After): Range = js.native
  /**
    * Inserts OOXML at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertOoxml")
  def insertOoxml_Before(ooxml: String, insertLocation: Before): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_End(ooxml: String, insertLocation: End): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Replace(ooxml: String, insertLocation: Replace): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Start(ooxml: String, insertLocation: Start): Range = js.native
  
  /**
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertParagraph(paragraphText: String, insertLocation: InsertLocation): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_After(paragraphText: String, insertLocation: After): Paragraph = js.native
  /**
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertParagraph")
  def insertParagraph_Before(paragraphText: String, insertLocation: Before): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_End(paragraphText: String, insertLocation: End): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Replace(paragraphText: String, insertLocation: Replace): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Start(paragraphText: String, insertLocation: Start): Paragraph = js.native
  
  /**
    * Inserts text at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertText(text: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertText")
  def insertText_After(text: String, insertLocation: After): Range = js.native
  /**
    * Inserts text at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertText")
  def insertText_Before(text: String, insertLocation: Before): Range = js.native
  @JSName("insertText")
  def insertText_End(text: String, insertLocation: End): Range = js.native
  @JSName("insertText")
  def insertText_Replace(text: String, insertLocation: Replace): Range = js.native
  @JSName("insertText")
  def insertText_Start(text: String, insertLocation: Start): Range = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InlinePicture = js.native
  def load(options: InlinePictureLoadOptions): InlinePicture = js.native
  def load(propertyNamesAndPaths: Expand): InlinePicture = js.native
  def load(propertyNames: String): InlinePicture = js.native
  def load(propertyNames: js.Array[String]): InlinePicture = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: Boolean = js.native
  
  /**
    *
    * Gets the parent paragraph that contains the inline image. Read-only.
    *
    * [Api set: WordApi 1.2]
    */
  val paragraph: Paragraph = js.native
  
  /**
    *
    * Gets the content control that contains the inline image. Throws an error if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    *
    * Gets the content control that contains the inline image. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    *
    * Gets the table that contains the inline image. Throws an error if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    *
    * Gets the table cell that contains the inline image. Throws an error if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    *
    * Gets the table cell that contains the inline image. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    *
    * Gets the table that contains the inline image. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    * Selects the inline picture. This causes Word to scroll to the selection.
    *
    * [Api set: WordApi 1.2]
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
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: InlinePicture): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.InlinePicture): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: InlinePictureUpdateData): Unit = js.native
  def set(properties: InlinePictureUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.InlinePicture object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.InlinePictureData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): InlinePictureData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InlinePicture = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): InlinePicture = js.native
  
  /**
    *
    * Gets or sets a number that describes the width of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var width: Double = js.native
}
