package typingsSlinky.reactDraggableList.components

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDraggableList.mod.Props
import typingsSlinky.reactDraggableList.mod.TemplateProps
import typingsSlinky.reactDraggableList.mod.default
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDraggableList {
  
  @scala.inline
  def apply[I, C, T /* <: ReactComponentClass[Partial[TemplateProps[I, C]]] */](
    itemKey: String | (js.Function1[I, String]),
    list: js.Array[I],
    template: Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], T]
  ): Builder[I, C, T] = {
    val __props = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    new Builder[I, C, T](js.Array(this.component, __props.asInstanceOf[Props[I, C, T]]))
  }
  
  @JSImport("react-draggable-list", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[I, C, T /* <: ReactComponentClass[Partial[TemplateProps[I, C]]] */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[I, C, T]] {
    
    @scala.inline
    def autoScrollMaxSpeed(value: Double): this.type = set("autoScrollMaxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoScrollRegionSize(value: Double): this.type = set("autoScrollRegionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def commonProps(value: C): this.type = set("commonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def constrainDrag(value: Boolean): this.type = set("constrainDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: () => js.UndefOr[HTMLElement | Null]): this.type = set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMoveEnd(value: (/* newList */ js.Array[I], I, /* oldIndex */ Double, /* newIndex */ Double) => Unit): this.type = set("onMoveEnd", js.Any.fromFunction4(value))
    
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def springConfig(value: js.Object): this.type = set("springConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unsetZIndex(value: Boolean): this.type = set("unsetZIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps[I, C, T /* <: ReactComponentClass[Partial[TemplateProps[I, C]]] */](p: Props[I, C, T]): Builder[I, C, T] = new Builder[I, C, T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
