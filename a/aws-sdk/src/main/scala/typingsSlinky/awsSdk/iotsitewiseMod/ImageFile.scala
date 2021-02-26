package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageFile extends StObject {
  
  /**
    * The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
    */
  var data: ImageFileData = js.native
  
  /**
    * The file type of the image.
    */
  var `type`: ImageFileType = js.native
}
object ImageFile {
  
  @scala.inline
  def apply(data: ImageFileData, `type`: ImageFileType): ImageFile = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFile]
  }
  
  @scala.inline
  implicit class ImageFileMutableBuilder[Self <: ImageFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ImageFileData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImageFileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
