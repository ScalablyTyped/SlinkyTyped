package typingsSlinky.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends StObject {
  
  var option: js.Object = js.native
  
  var originalEvent: org.scalajs.dom.raw.Event = js.native
}
object Option {
  
  @scala.inline
  def apply(option: js.Object, originalEvent: org.scalajs.dom.raw.Event): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: js.Object): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
