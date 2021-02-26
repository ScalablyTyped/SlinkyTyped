package typingsSlinky.modernizr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoBoolean extends StObject {
  
  var h264: String = js.native
  
  var ogg: String = js.native
  
  var webm: String = js.native
}
object VideoBoolean {
  
  @scala.inline
  def apply(h264: String, ogg: String, webm: String): VideoBoolean = {
    val __obj = js.Dynamic.literal(h264 = h264.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], webm = webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoBoolean]
  }
  
  @scala.inline
  implicit class VideoBooleanMutableBuilder[Self <: VideoBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH264(value: String): Self = StObject.set(x, "h264", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgg(value: String): Self = StObject.set(x, "ogg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebm(value: String): Self = StObject.set(x, "webm", value.asInstanceOf[js.Any])
  }
}
