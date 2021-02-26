package typingsSlinky.reactBigScheduler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends StObject {
  
  var isEventPerspective: Boolean = js.native
  
  var showAgenda: Boolean = js.native
  
  var viewName: js.UndefOr[String] = js.native
  
  var viewType: ViewTypes = js.native
}
object View {
  
  @scala.inline
  def apply(isEventPerspective: Boolean, showAgenda: Boolean, viewType: ViewTypes): View = {
    val __obj = js.Dynamic.literal(isEventPerspective = isEventPerspective.asInstanceOf[js.Any], showAgenda = showAgenda.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewMutableBuilder[Self <: View] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEventPerspective(value: Boolean): Self = StObject.set(x, "isEventPerspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAgenda(value: Boolean): Self = StObject.set(x, "showAgenda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
    
    @scala.inline
    def setViewType(value: ViewTypes): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
  }
}
