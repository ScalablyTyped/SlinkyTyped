package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  var file: js.Any = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object File {
  
  @scala.inline
  def apply(file: js.Any, originalEvent: org.scalajs.dom.raw.Event): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
