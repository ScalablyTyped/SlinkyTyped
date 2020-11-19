package typingsSlinky.blueprintjsCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.overflowListMod.IOverflowListProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OverflowList {
  
  @JSImport("@blueprintjs/core", "OverflowList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.OverflowList[T]] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapseFrom(value: Boundary): this.type = set("collapseFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minVisibleItems(value: Double): this.type = set("minVisibleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def observeParents(value: Boolean): this.type = set("observeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOverflow(value: /* overflowItems */ js.Array[T] => Unit): this.type = set("onOverflow", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): this.type = set("tagName", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: IOverflowListProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](
    items: js.Array[T],
    overflowRenderer: js.Array[T] => ReactElement,
    visibleItemRenderer: (T, Double) => ReactChild
  ): Builder[T] = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], overflowRenderer = js.Any.fromFunction1(overflowRenderer), visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[IOverflowListProps[T]]))
  }
}
