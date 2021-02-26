package typingsSlinky.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upload extends StObject {
  
  var initiated: js.Any = js.native
  
  var name: String = js.native
  
  var uploadId: String = js.native
}
object Upload {
  
  @scala.inline
  def apply(initiated: js.Any, name: String, uploadId: String): Upload = {
    val __obj = js.Dynamic.literal(initiated = initiated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upload]
  }
  
  @scala.inline
  implicit class UploadMutableBuilder[Self <: Upload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiated(value: js.Any): Self = StObject.set(x, "initiated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
