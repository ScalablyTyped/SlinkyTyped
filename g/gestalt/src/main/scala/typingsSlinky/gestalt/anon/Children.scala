package typingsSlinky.gestalt.anon

import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.gestaltStrings.error
import typingsSlinky.gestalt.gestaltStrings.info
import typingsSlinky.gestalt.mod.Icons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var icon: js.UndefOr[Icons] = js.native
  
  var iconAccessibilityLabel: js.UndefOr[String] = js.native
  
  var summary: js.UndefOr[js.Array[String]] = js.native
  
  var title: String = js.native
  
  var `type`: js.UndefOr[info | error] = js.native
}
object Children {
  
  @scala.inline
  def apply(title: String): Children = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconAccessibilityLabel(value: String): Self = StObject.set(x, "iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconAccessibilityLabelUndefined: Self = StObject.set(x, "iconAccessibilityLabel", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setSummary(value: js.Array[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setSummaryVarargs(value: String*): Self = StObject.set(x, "summary", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: info | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
