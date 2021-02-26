package typingsSlinky.contentfulManagement.anon

import typingsSlinky.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  var contentType: String = js.native
  
  var file: String | js.typedarray.ArrayBuffer | Stream = js.native
  
  var fileName: String = js.native
}
object File {
  
  @scala.inline
  def apply(contentType: String, file: String | js.typedarray.ArrayBuffer | Stream, fileName: String): File = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String | js.typedarray.ArrayBuffer | Stream): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
