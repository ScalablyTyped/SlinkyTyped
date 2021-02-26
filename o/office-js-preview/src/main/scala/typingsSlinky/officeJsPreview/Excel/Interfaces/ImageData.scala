package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.PictureFormat
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BMP
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GIF
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.JPEG
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.PNG
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SVG
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `image.toJSON()`. */
@js.native
trait ImageData extends StObject {
  
  /**
    *
    * Returns the format of the image.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG] = js.native
  
  /**
    *
    * Specifies the shape identifier for the image object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.native
}
object ImageData {
  
  @scala.inline
  def apply(): ImageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageData]
  }
  
  @scala.inline
  implicit class ImageDataMutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
