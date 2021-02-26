package typingsSlinky.antDesignPro.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseText extends StObject {
  
  var collapseText: js.UndefOr[ReactElement] = js.native
  
  var expandText: js.UndefOr[ReactElement] = js.native
  
  var selectAllText: js.UndefOr[ReactElement] = js.native
}
object CollapseText {
  
  @scala.inline
  def apply(): CollapseText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseText]
  }
  
  @scala.inline
  implicit class CollapseTextMutableBuilder[Self <: CollapseText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseText(value: ReactElement): Self = StObject.set(x, "collapseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseTextReactElement(value: ReactElement): Self = StObject.set(x, "collapseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseTextUndefined: Self = StObject.set(x, "collapseText", js.undefined)
    
    @scala.inline
    def setExpandText(value: ReactElement): Self = StObject.set(x, "expandText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandTextReactElement(value: ReactElement): Self = StObject.set(x, "expandText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandTextUndefined: Self = StObject.set(x, "expandText", js.undefined)
    
    @scala.inline
    def setSelectAllText(value: ReactElement): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllTextReactElement(value: ReactElement): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
  }
}
