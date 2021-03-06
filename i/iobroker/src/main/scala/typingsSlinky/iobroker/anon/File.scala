package typingsSlinky.iobroker.anon

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  var file: String | Buffer = js.native
  
  var mimeType: String = js.native
}
object File {
  
  @scala.inline
  def apply(file: String | Buffer, mimeType: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String | Buffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
  }
}
