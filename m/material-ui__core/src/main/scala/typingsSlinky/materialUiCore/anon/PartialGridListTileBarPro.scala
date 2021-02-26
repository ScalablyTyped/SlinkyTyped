package typingsSlinky.materialUiCore.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiCore.materialUiCoreStrings.bottom
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.top
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/GridListTileBar.GridListTileBarProps> */
@js.native
trait PartialGridListTileBarPro extends StObject {
  
  var actionIcon: js.UndefOr[ReactElement] = js.native
  
  var actionPosition: js.UndefOr[left | right] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[PartialClassNameMapGridLiActionIcon] = js.native
  
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var subtitle: js.UndefOr[ReactElement] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
  
  var titlePosition: js.UndefOr[top | bottom] = js.native
}
object PartialGridListTileBarPro {
  
  @scala.inline
  def apply(): PartialGridListTileBarPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGridListTileBarPro]
  }
  
  @scala.inline
  implicit class PartialGridListTileBarProMutableBuilder[Self <: PartialGridListTileBarPro] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionIcon(value: ReactElement): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIconReactElement(value: ReactElement): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIconUndefined: Self = StObject.set(x, "actionIcon", js.undefined)
    
    @scala.inline
    def setActionPosition(value: left | right): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialClassNameMapGridLiActionIcon): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setInnerRef(value: Ref[_] | ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    @scala.inline
    def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubtitle(value: ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleReactElement(value: ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePosition(value: top | bottom): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
