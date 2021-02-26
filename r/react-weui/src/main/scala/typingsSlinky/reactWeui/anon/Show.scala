package typingsSlinky.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Show extends StObject {
  
  var icon: String = js.native
  
  var show: Boolean = js.native
}
object Show {
  
  @scala.inline
  def apply(icon: String, show: Boolean): Show = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Show]
  }
  
  @scala.inline
  implicit class ShowMutableBuilder[Self <: Show] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
