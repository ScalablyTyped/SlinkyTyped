package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.gif
import typingsSlinky.exceljs.exceljsStrings.jpeg
import typingsSlinky.exceljs.exceljsStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
  var base64: js.UndefOr[String] = js.native
  
  var buffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  
  var extension: jpeg | png | gif = js.native
  
  var filename: js.UndefOr[String] = js.native
}
object Image {
  
  @scala.inline
  def apply(extension: jpeg | png | gif): Image = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
    
    @scala.inline
    def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setExtension(value: jpeg | png | gif): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
