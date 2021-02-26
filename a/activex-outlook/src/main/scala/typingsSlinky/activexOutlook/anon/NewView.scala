package typingsSlinky.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewView extends StObject {
  
  var Cancel: Boolean = js.native
  
  val NewView: js.Any = js.native
}
object NewView {
  
  @scala.inline
  def apply(Cancel: Boolean, NewView: js.Any): NewView = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewView = NewView.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewView]
  }
  
  @scala.inline
  implicit class NewViewMutableBuilder[Self <: NewView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewView(value: js.Any): Self = StObject.set(x, "NewView", value.asInstanceOf[js.Any])
  }
}
