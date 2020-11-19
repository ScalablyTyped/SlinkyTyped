package typingsSlinky.materialUiCore.gridListTileBarGridListTileBarMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiCore.anon.PartialClassNameMapGridLiActionIcon
import typingsSlinky.materialUiCore.materialUiCoreStrings.bottom
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.top
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/GridListTileBar/GridListTileBar.GridListTileBarClassKey, never> */
@js.native
trait GridListTileBarProps extends js.Object {
  
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
object GridListTileBarProps {
  
  @scala.inline
  def apply(): GridListTileBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridListTileBarProps]
  }
  
  @scala.inline
  implicit class GridListTileBarPropsOps[Self <: GridListTileBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionIconReactElement(value: ReactElement): Self = this.set("actionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIcon(value: ReactElement): Self = this.set("actionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionIcon: Self = this.set("actionIcon", js.undefined)
    
    @scala.inline
    def setActionPosition(value: left | right): Self = this.set("actionPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionPosition: Self = this.set("actionPosition", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialClassNameMapGridLiActionIcon): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setInnerRefRefObject(value: ReactRef[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[_] | ReactRef[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubtitleReactElement(value: ReactElement): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: ReactElement): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitlePosition(value: top | bottom): Self = this.set("titlePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePosition: Self = this.set("titlePosition", js.undefined)
  }
}
