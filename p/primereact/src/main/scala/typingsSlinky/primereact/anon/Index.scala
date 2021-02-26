package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends StObject {
  
  var index: Double = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object Index {
  
  @scala.inline
  def apply(index: Double, originalEvent: org.scalajs.dom.raw.Event): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
