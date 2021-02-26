package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maximized extends StObject {
  
  var maximized: Boolean = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object Maximized {
  
  @scala.inline
  def apply(maximized: Boolean, originalEvent: org.scalajs.dom.raw.Event): Maximized = {
    val __obj = js.Dynamic.literal(maximized = maximized.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maximized]
  }
  
  @scala.inline
  implicit class MaximizedMutableBuilder[Self <: Maximized] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
