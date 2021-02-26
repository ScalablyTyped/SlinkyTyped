package typingsSlinky.blueprintjsCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.collapsibleListMod.ICollapsibleListProps
import typingsSlinky.blueprintjsCore.menuItemMod.IMenuItemProps
import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CollapsibleList {
  
  @scala.inline
  def apply(dropdownTarget: ReactElement, visibleItemRenderer: (IMenuItemProps, Double) => ReactElement): Builder = {
    val __props = js.Dynamic.literal(dropdownTarget = dropdownTarget.asInstanceOf[js.Any], visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    new Builder(js.Array(this.component, __props.asInstanceOf[ICollapsibleListProps]))
  }
  
  @JSImport("@blueprintjs/core", "CollapsibleList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.CollapsibleList] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapseFrom(value: Boundary): this.type = set("collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownProps(value: IPopoverProps): this.type = set("dropdownProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleItemClassName(value: String): this.type = set("visibleItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibleItemCount(value: Double): this.type = set("visibleItemCount", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICollapsibleListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
