package typingsSlinky.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadId extends StObject {
  
  var uploadId: String = js.native
}
object UploadId {
  
  @scala.inline
  def apply(uploadId: String): UploadId = {
    val __obj = js.Dynamic.literal(uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadId]
  }
  
  @scala.inline
  implicit class UploadIdMutableBuilder[Self <: UploadId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
