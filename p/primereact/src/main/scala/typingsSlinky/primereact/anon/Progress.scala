package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress extends StObject {
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
  
  var progress: js.Any = js.native
}
object Progress {
  
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, progress: js.Any): Progress = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: js.Any): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
