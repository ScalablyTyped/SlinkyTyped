package typingsSlinky.domMediacaptureRecord

import org.scalajs.dom.raw.DOMException
import typingsSlinky.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRecorderErrorEventInit extends EventInit {
  
  var error: DOMException = js.native
}
object MediaRecorderErrorEventInit {
  
  @scala.inline
  def apply(error: DOMException): MediaRecorderErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderErrorEventInit]
  }
  
  @scala.inline
  implicit class MediaRecorderErrorEventInitMutableBuilder[Self <: MediaRecorderErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: DOMException): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
