package typingsSlinky.reactDraggable.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDraggable.anon.PartialDraggableCoreProps
import typingsSlinky.reactDraggable.mod.DraggableData
import typingsSlinky.reactDraggable.mod.DraggableEvent
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DraggableCore {
  
  @JSImport("react-draggable", "DraggableCore")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactDraggable.mod.DraggableCore] {
    
    @scala.inline
    def allowAnyClick(value: Boolean): this.type = set("allowAnyClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancel(value: String): this.type = set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableUserSelectHack(value: Boolean): this.type = set("enableUserSelectHack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def grid(value: js.Tuple2[Double, Double]): this.type = set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handle(value: String): this.type = set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeRef(value: ReactRef[HTMLElement]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetParent(value: HTMLElement): this.type = set("offsetParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseDown(value: /* e */ MouseEvent => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def onStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DraggableCore.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialDraggableCoreProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
