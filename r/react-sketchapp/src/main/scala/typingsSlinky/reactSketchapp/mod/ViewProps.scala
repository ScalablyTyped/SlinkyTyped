package typingsSlinky.reactSketchapp.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactSketchapp.typesMod.ResizeConstraints
import typingsSlinky.reactSketchapp.typesMod.SketchShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewProps extends StObject {
  
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var resizingConstraint: js.UndefOr[ResizeConstraints] = js.native
  
  var shadows: js.UndefOr[js.Array[SketchShadow]] = js.native
  
  var style: js.UndefOr[Style | StyleReference] = js.native
}
object ViewProps {
  
  @scala.inline
  def apply(): ViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProps]
  }
  
  @scala.inline
  implicit class ViewPropsMutableBuilder[Self <: ViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResizingConstraint(value: ResizeConstraints): Self = StObject.set(x, "resizingConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizingConstraintUndefined: Self = StObject.set(x, "resizingConstraint", js.undefined)
    
    @scala.inline
    def setShadows(value: js.Array[SketchShadow]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShadowsVarargs(value: SketchShadow*): Self = StObject.set(x, "shadows", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: Style | StyleReference): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
