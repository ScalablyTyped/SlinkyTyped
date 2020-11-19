package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.Excel.Interfaces.ImageData
import typingsSlinky.officeJsPreview.Excel.Interfaces.ImageLoadOptions
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.anon.Expand
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BMP
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GIF
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.JPEG
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.PNG
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SVG
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an image in the worksheet. To get the corresponding Shape object, use Image.shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait Image extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Image: RequestContext = js.native
  
  /**
    *
    * Returns the format of the image.
    *
    * [Api set: ExcelApi 1.9]
    */
  val format: PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG = js.native
  
  /**
    *
    * Specifies the shape identifier for the image object.
    *
    * [Api set: ExcelApi 1.9]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Image = js.native
  def load(options: ImageLoadOptions): Image = js.native
  def load(propertyNamesAndPaths: Expand): Image = js.native
  def load(propertyNames: String): Image = js.native
  def load(propertyNames: js.Array[String]): Image = js.native
  
  /**
    *
    * Returns the Shape object associated with the image.
    *
    * [Api set: ExcelApi 1.9]
    */
  val shape: Shape = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Image object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ImageData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ImageData = js.native
}
